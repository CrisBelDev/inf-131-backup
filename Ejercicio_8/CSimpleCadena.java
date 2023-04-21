package Ejercicio_8;

public class CSimpleCadena {
	private int ini,fin,max=50;
	private String[] v=new String[max+1];
	CSimpleCadena() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	//this=1,2,4,5,6
	//x=3
	//this=1,2,3,4,5,6
	
	void adicionar(String x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	String eliminar() {
		String elem="";
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
			adicionar(Leer.dato());
		}
	}
	void mostrar() {
		CSimpleCadena aux=new CSimpleCadena();
		while(!esvacio()) {
			String x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleCadena x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
