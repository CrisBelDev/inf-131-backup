package Defensa_2;

public class CSimpleRegion {
	private int ini,fin,max=50;
	private Region[] v=new Region[max+1];
	CSimpleRegion() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Region x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Region eliminar() {
		Region elem=null;
		if(!esvacio()) {
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
			Region x=new Region();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleRegion aux=new CSimpleRegion();
		while(!esvacio()) {
			Region x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleRegion x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	void llenar() {
		adicionar(new Region("r1","norte amazonico",8));
		adicionar(new Region("r2","amazonia del sur",7));
		adicionar(new Region("r3","chiquitania",5));
	}
	int nroElem() {
		return fin-ini;
	}
}
