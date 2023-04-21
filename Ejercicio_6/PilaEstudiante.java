package Ejercicio_6;

public class PilaEstudiante {
	private int max=50,tope;
	private Estudiante[] v=new Estudiante[max+1];
	PilaEstudiante() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Estudiante l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Estudiante eliminar() {
		Estudiante elem=null;
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
			Estudiante x=new Estudiante();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaEstudiante aux=new PilaEstudiante();
		while(!esvacia()) {
			Estudiante x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaEstudiante z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
