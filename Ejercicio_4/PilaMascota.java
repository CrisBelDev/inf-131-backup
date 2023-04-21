package Ejercicio_4;


public class PilaMascota {
	private int max=50,tope;
	private Mascota[] v=new Mascota[max+1];
	PilaMascota() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(Mascota l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Mascota eliminar() {
		Mascota elem=null;
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
			Mascota x=new Mascota();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaMascota aux=new PilaMascota();
		while(!esvacia()) {
			Mascota x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaMascota z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
