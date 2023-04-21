package Ejercicio_9;

public class CSimpleEst {
	private int ini,fin,max=50;
	private Estudiante[] v=new Estudiante[max+1];
	CSimpleEst() {
		ini=fin=0;
	}
	boolean esvacia() {
		return (ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(Estudiante x) {
		if(!esllena()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Estudiante eliminar() {
		Estudiante elem=null;
		if(!esvacia()) {
			ini++;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola llena");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Estudiante x=new Estudiante();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		Estudiante a=new Estudiante();
		a.setNom("juan perez");
		a.setCi(123);
		Estudiante b=new Estudiante();
		b.setNom("rodrigo yujra");
		b.setCi(234);
		Estudiante c=new Estudiante();
		c.setNom("erick rodirguez");
		c.setCi(345);
		adicionar(a);
		adicionar(b);
		adicionar(c);
	}
	void mostrar() {
		CSimpleEst aux=new CSimpleEst();
		while(!esvacia()) {
			Estudiante x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleEst z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
