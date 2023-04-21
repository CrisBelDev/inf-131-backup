package Defensa_1;

public class PilaFa {
	private int max=50,tope;
	private Fauna[] v=new Fauna[max+1];
	PilaFa() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Fauna l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Fauna eliminar() {
		Fauna elem=null;
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
			Fauna x=new Fauna();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaFa aux=new PilaFa();
		while(!esvacia()) {
			Fauna x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaFa z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
