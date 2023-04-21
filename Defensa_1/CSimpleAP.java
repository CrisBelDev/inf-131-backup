package Defensa_1;

public class CSimpleAP {
	private int ini,fin,max=50;
	private AreaProtegida[] v=new AreaProtegida[max+1];
	CSimpleAP() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(AreaProtegida x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	AreaProtegida eliminar() {
		AreaProtegida elem=null;
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
			AreaProtegida x=new AreaProtegida();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleAP aux=new CSimpleAP();
		while(!esvacio()) {
			AreaProtegida x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleAP x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
