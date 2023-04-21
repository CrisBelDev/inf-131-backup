package Defensa_1;

public class CSimpleE {
	private int ini,fin,max=50;
	private Ecorregion[] v=new Ecorregion[max+1];
	CSimpleE() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Ecorregion x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Ecorregion eliminar() {
		Ecorregion elem=null;
		if(!esvacio()) {
			ini++;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Ecorregion x=new Ecorregion();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleE aux=new CSimpleE();
		while(!esvacio()) {
			Ecorregion x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleE x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
