package Ejercicio_3;

public class PilaLibro {
	private int max=50,tope;
	private Libro[] v=new Libro[max+1];
	PilaLibro() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Libro l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Libro eliminar() {
		Libro elem=null;
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
			Libro x=new Libro();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaLibro aux=new PilaLibro();
		while(!esvacia()) {
			Libro x=eliminar();
			x.mostrar();//la cambia
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaLibro z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}

}
