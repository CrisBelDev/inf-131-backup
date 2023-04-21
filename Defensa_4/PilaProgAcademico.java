package Defensa_4;

public class PilaProgAcademico {
	private int max=50,tope;
	private ProgAcademico[] v=new ProgAcademico[max+1];
	PilaProgAcademico() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(ProgAcademico l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	ProgAcademico eliminar() {
		ProgAcademico elem=null;
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
			ProgAcademico x=new ProgAcademico();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaProgAcademico aux=new PilaProgAcademico();
		while(!esvacia()) {
			ProgAcademico x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaProgAcademico z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
