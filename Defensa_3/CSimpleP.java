package Defensa_3;

public class CSimpleP {
	private int ini,fin,max=50;
	private Producto[] v=new Producto[max+1];
	CSimpleP() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Producto x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Producto eliminar() {
		Producto elem=null;
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
			Producto x=new Producto();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleP aux=new CSimpleP();
		while(!esvacio()) {
			Producto x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleP x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
