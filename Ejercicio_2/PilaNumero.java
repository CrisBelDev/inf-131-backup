package Ejercicio_2;


public class PilaNumero {
	private int max = 50, tope;
	private int[] v = new int[max + 1];

	PilaNumero() {
		tope = 0;
	}
	boolean esvacia() {
		return tope == 0;
	}
	boolean esllena() {
		return tope == max;
	}
	void adicionar(int c) {
		if (!esllena()) {
			tope++;
			v[tope] = c;
		}
	}
	int eliminar() {
		int elem = -1;
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		}
		return elem;
	}
	void vaciar(PilaNumero z) {
		while (!z.esvacia())
			adicionar(z.eliminar());
	}
	public void llenar(int n) {
		for (int i = 0; i < n; i++) {
			adicionar(Leer.datoInt());
		}
	}
	public void mostrar() {
		PilaNumero aux=new PilaNumero();
		while(!esvacia()) {
			int x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	public int nroelem() {
		return tope;
	}
}
