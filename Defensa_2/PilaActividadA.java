package Defensa_2;
public class PilaActividadA {
	private int tope,max=50;
	private ActividadA[] v=new ActividadA[max+1];
	
	PilaActividadA() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(ActividadA num) {
		if(!esllena()) {
			tope++;
			v[tope]=num;
		}
		else
			System.out.println("pila llena");
	}
	ActividadA eliminar() {
		ActividadA elem=null;
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
			ActividadA x=new ActividadA();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new ActividadA("t1","act1",50,100));
		adicionar(new ActividadA("t1","act2",50,100));
		adicionar(new ActividadA("t5","act3",50,100));
		adicionar(new ActividadA("t2","act4",50,100));
		adicionar(new ActividadA("t2","act5",50,100));
		adicionar(new ActividadA("t3","act6",50,100));
		adicionar(new ActividadA("t4","act7",50,100));
	}
	void mostrar() {
		PilaActividadA aux=new PilaActividadA();
		while(!esvacia()) {
			ActividadA num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	 void vaciar(PilaActividadA z) {
		 while(!z.esvacia())
			 adicionar(z.eliminar());
	 }

}
