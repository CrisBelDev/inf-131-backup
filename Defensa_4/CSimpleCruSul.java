package Defensa_4;

public class CSimpleCruSul {
	private int ini,fin,max=9;
	private CruSul[] v=new CruSul[max+1];
	CSimpleCruSul() {
		ini=fin=0;
	}
	boolean esvacia() {
		return (ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(CruSul elem) {
		if(!esllena()) {
			fin++;
			v[fin]=elem;
		}
		else
			System.out.println("Cola llena");
	}
	CruSul eliminar() {
		CruSul elem=null;
		if(!esvacia()) {
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
			CruSul elem=new CruSul();
			elem.leer();
			adicionar(elem);
		}
	}
	void mostrar() {
		CSimpleCruSul aux=new CSimpleCruSul();
		while(!esvacia()) {
			CruSul x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleCruSul w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
