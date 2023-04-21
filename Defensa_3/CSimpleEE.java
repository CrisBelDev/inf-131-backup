package Defensa_3;

public class CSimpleEE {
	private int ini,fin,max=50;
	private EstExperimental[] v=new EstExperimental[max+1];
	CSimpleEE() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(EstExperimental x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	EstExperimental eliminar() {
		EstExperimental elem=null;
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
			EstExperimental x=new EstExperimental();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleEE aux=new CSimpleEE();
		while(!esvacio()) {
			EstExperimental x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleEE x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
