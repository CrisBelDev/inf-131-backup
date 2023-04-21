package Ejercicio_6;

public class PilaMateria {
	private int max=50,tope;
	private Materia[] v=new Materia[max+1];
	PilaMateria() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Materia l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Materia eliminar() {
		Materia elem=null;
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
			Materia x=new Materia();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaMateria aux=new PilaMateria();
		while(!esvacia()) {
			Materia x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaMateria z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
