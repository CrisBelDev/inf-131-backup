package Ejercicio_5;
public class PilaCarta {
	private int tope,max=50;
	private Carta[] v=new Carta[max+1];
	
	PilaCarta() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Carta num) {
		if(!esllena()) {
			tope++;
			v[tope]=num;
		}
		else
			System.out.println("pila llena");
	}
	Carta eliminar() {
		Carta elem=null;
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
			Carta x=new Carta();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Carta("01/01/2021","a","aaa",333));
		adicionar(new Carta("01/10/2021","b","bbb",111));
		adicionar(new Carta("01/01/2021","c","ccc",222));
		adicionar(new Carta("01/01/2021","a","ddd",111));
	}
	void mostrar() {
		PilaCarta aux=new PilaCarta();
		while(!esvacia()) {
			Carta num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	 void vaciar(PilaCarta z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }

}
