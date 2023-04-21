package Defensa_2;

public class PilaActividadG {
	private int tope,max=50;
	private ActividadG[] v=new ActividadG[max+1];
	
	PilaActividadG() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(ActividadG num) {
		if(!esllena()) {
			tope++;
			v[tope]=num;
		}
		else
			System.out.println("pila llena");
	}
	ActividadG eliminar() {
		ActividadG elem=null;
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
			ActividadG x=new ActividadG();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new ActividadG("t1","g1",25));
		adicionar(new ActividadG("t2","g2",35));
		adicionar(new ActividadG("t3","g1",20));
		adicionar(new ActividadG("t1","g2",45));
		adicionar(new ActividadG("t2","g1",15));
		adicionar(new ActividadG("t4","g3",15));
		adicionar(new ActividadG("t4","g3",65));
		
	}
	void mostrar() {
		PilaActividadG aux=new PilaActividadG();
		while(!esvacia()) {
			ActividadG num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	 void vaciar(PilaActividadG z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }

}
