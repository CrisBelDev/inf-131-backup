package Ejercicio_5;

public class PilaCliente {
	private int max=50,tope;
	private Cliente[] v=new Cliente[max+1];
	PilaCliente() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Cliente l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Cliente eliminar() {
		Cliente elem=null;
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
			Cliente x=new Cliente();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Cliente(111,"david","meneces","zelaya"));
		adicionar(new Cliente(222,"joel","mendieta","carrasxo"));
		adicionar(new Cliente(333,"rodrigo","yujra","quisbert"));
	}
	void mostrar() {
		PilaCliente aux=new PilaCliente();
		while(!esvacia()) {
			Cliente num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	 void vaciar(PilaCliente z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }

}
