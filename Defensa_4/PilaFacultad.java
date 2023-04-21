package Defensa_4;

public class PilaFacultad {
	private int max=50,tope;
	private Facultad[] v=new Facultad[max+1];
	PilaFacultad() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Facultad l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Facultad eliminar() {
		Facultad elem=null;
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
			Facultad x=new Facultad();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaFacultad aux=new PilaFacultad();
		while(!esvacia()) {
			Facultad x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaFacultad z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
