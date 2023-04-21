package Ejercicio_7;

public class CSimpleNumero {
	private int ini,fin,max=50;
	private int[] v=new int[max+1];
	CSimpleNumero() {
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
			int indice=0;
			for (int i = ini+1; i <= fin; i++) {
				if(v[i]>x) {
					indice=i;
					break;
				}
			}
			if(indice>0) {
				for (int i = fin+1; i >= indice; i--)
					v[i]=v[i-1];
				v[indice] = x;
				fin++;
			}
			else {
				fin++;
				v[fin]=x;
			}
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
		CSimpleNumero aux=new CSimpleNumero();
		while(!esvacio()) {
			int x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleNumero x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
