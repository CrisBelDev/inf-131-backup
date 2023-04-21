package Ejercicio_8;

public class PilaCadena {
	private int max = 50, tope;
	private String[] v = new String[max + 1];

	PilaCadena() {
		tope = 0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope == max;
	}
	void adicionar(String c) {
		if (!esllena()) {
			tope++;
			v[tope] = c;
		}
	}
	String eliminar() {
		String elem = null;
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		}
		return elem;
	}
	void vaciar(PilaCadena z) {
		while (!z.esvacia())
			adicionar(z.eliminar());
	}
	public void llenar(int n) {
		for (int i = 0; i < n; i++) {
			adicionar(Leer.dato());
		}
	}
	public void mostrar() {
		PilaCadena aux=new PilaCadena();
		while(!esvacia()) {
			String x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	public int nroElem() {
		return tope;
	}
}
