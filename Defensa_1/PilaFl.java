package Defensa_1;

public class PilaFl {
	private int max=50,tope;
	private Flora[] v=new Flora[max+1];
	PilaFl() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Flora l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Flora eliminar() {
		Flora elem=null;
		if(!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("pila vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Flora x=new Flora();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaFl aux=new PilaFl();
		while(!esvacia()) {
			Flora x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaFl z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
