package Ejercicio_7;

public class CSimpleN {
	private int ini,fin,max=50;
	private int[] v=new int[max+1];
	CSimpleN() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(int x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	int eliminar() {
		int elem=' ';
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
			adicionar(Leer.datoInt());
		}
	}
	void mostrar() {
		CSimpleN aux=new CSimpleN();
		while(!esvacio()) {
			int x=eliminar();
			System.out.print(x+" ");
			aux.adicionar(x);
		}
		vaciar(aux);
		System.out.println();
	}
	void vaciar(CSimpleN x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
