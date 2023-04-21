package Ejercicio_1;

public class PilaCaracter {
	private int max = 50, tope;
	private char[] v = new char[max + 1];

	PilaCaracter() {
		tope = 0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope == max;
	}
	void adicionar(char c) {
		if (!esllena()) {
			tope++;
			v[tope] = c;
		}
	}
	char eliminar() {
		char elem = ' ';
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		}
		return elem;
	}
	void vaciar(PilaCaracter z) {
		while (!z.esvacia())
			adicionar(z.eliminar());
	}
	public void llenar(int n) {
		for (int i = 0; i < n; i++) {
			adicionar(Leer.dato().charAt(0));
		}
	}
	public void mostrar() {
		PilaCaracter aux=new PilaCaracter();
		while(!esvacia()) {
			char x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
}
