package Ejercicio_9;
public class CCircularPract {
	private int ini,fin,max=50;
	private Practica[] v=new Practica[max+1];
	CCircularPract() {
		ini=fin=0;
	}
	int nroelem() {
		return (max+fin-ini)%max;
	}
	boolean esvacia() {
		return nroelem()==0;
	}
	boolean eslleno() {
		return (max-1)==nroelem();
	}
	void adicionar(Practica elem) {
		if(!eslleno()) {
			fin=(fin+1)%max;
			v[fin]=elem;
		}
		else
			System.out.println("cola llena");
	}
	//fin=(fin+1)%max;
	//fin=(4+1)%4=5%4=1
	
	//(max+fin-ini)%max;
	//(4+4-1)%4 = 3==3
	Practica eliminar() {
		Practica elem=null;
		if(!esvacia()) {
			ini=(ini+1)%max;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("cola vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Practica p=new Practica();
			p.leer();
			adicionar(p);
		}
	}
	void llenar() {
		Practica x=new Practica();
		x.setCi(234);
		x.setNota(100);
		x.setNroP(1);
		Practica y=new Practica();
		y.setCi(345);
		y.setNota(100);
		y.setNroP(2);
		Practica z=new Practica();
		z.setCi(234);
		z.setNota(100);
		z.setNroP(2);
		Practica w=new Practica();
		w.setCi(123);
		w.setNota(30);
		w.setNroP(1);
		Practica q=new Practica();
		q.setCi(123);
		q.setNota(70);
		q.setNroP(2);
		adicionar(x);
		adicionar(y);
		adicionar(z);
		adicionar(w);
		adicionar(q);
	}
	void mostrar() {
		CCircularPract aux=new CCircularPract();
		while(!esvacia()) {
			Practica x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CCircularPract w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
}
