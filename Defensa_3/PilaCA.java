package Defensa_3;

public class PilaCA {
	private int max=50,tope;
	private CrianzaAnimal[] v=new CrianzaAnimal[max+1];
	PilaCA() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	public void adicionar(CrianzaAnimal l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	CrianzaAnimal eliminar() {
		CrianzaAnimal elem=null;
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
			CrianzaAnimal x=new CrianzaAnimal();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaCA aux=new PilaCA();
		while(!esvacia()) {
			CrianzaAnimal x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	 void vaciar(PilaCA z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }
	public int nroElem() {
		return tope;
	}
}
