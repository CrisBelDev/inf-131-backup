package Ejercicio_6;

public class PilaParalelo {
	private int max=50,tope;
	private Paralelo[] v=new Paralelo[max+1];
	PilaParalelo() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Paralelo l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Paralelo eliminar() {
		Paralelo elem=null;
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
			Paralelo x=new Paralelo();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaParalelo aux=new PilaParalelo();
		while(!esvacia()) {
			Paralelo x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaParalelo z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
