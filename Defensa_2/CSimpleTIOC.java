package Defensa_2;

public class CSimpleTIOC {
	private int ini,fin,max=50;
	private TIOC[] v=new TIOC[max+1];
	CSimpleTIOC() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(TIOC x) {
		if(!eslleno()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	TIOC eliminar() {
		TIOC elem=null;
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
			TIOC x=new TIOC();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleTIOC aux=new CSimpleTIOC();
		while(!esvacio()) {
			TIOC x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleTIOC x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	void llenar() {
		adicionar(new TIOC("r1","t1","nom1","ub1",100,30));
		adicionar(new TIOC("r2","t2","nom2","ub2",200,40));
		adicionar(new TIOC("r1","t3","nom3","ub3",100,20));
		adicionar(new TIOC("r3","t4","nom4","ub1",200,10));
		adicionar(new TIOC("r3","t5","nom5","ub2",100,30));
	}
	int nroElem() {
		return fin-ini;
	}
}
