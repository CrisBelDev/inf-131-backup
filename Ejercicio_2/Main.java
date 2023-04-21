package Ejercicio_2;

public class Main {
	public static void main(String[]args) {
		// Dadas dos Pilas A y B ambas con valores enteros y mayores a cero.
		PilaNumero a=new PilaNumero();
		//a.llenar(Leer.datoInt());
		a.adicionar(1);
		a.adicionar(4);
		a.adicionar(7);
		a.adicionar(7);
		a.adicionar(2);
		a.adicionar(1);
		System.out.println();
		a.mostrar();
//		PilaNumero b=new PilaNumero();
//		b.llenar(Leer.datoInt());
//		b.adicionar(9);
//		b.adicionar(8);
//		b.adicionar(7);
//		System.out.println();
//		b.mostrar();
//		//1. Intercambiar sus valores de tal forma que en la Pila A queden 
//		//   los pares y en B los impares (Sin estructuras auxiliares)
//		Solucion1(a,b);
//		System.out.println();
//		a.mostrar();
//		System.out.println();
//		b.mostrar();
//		//2. Intercambiar el i-esimo elemento de A con el j-esimo 
//		//   de B(Sin estructuras auxiliares)
//		Solucion2(a,b,1,1);
//		System.out.println();
//		a.mostrar();
//		System.out.println();
//		b.mostrar();
//		//a. llevar todos los numeros primos al fondo de la Pila
//		SolucionA(a);
//		SolucionA1(a);
//		System.out.println();
//		a.mostrar();
//		//b. Eliminar elementos que se repiten
//		//Ej. enstrada: 1,2,3,4,1,2 salida: 3,4 
//		SolucionB(a);
//		System.out.println();
//		a.mostrar();
		System.out.println(primo(1));
	}
	
	public static boolean primo(int n){
        int cont = 2;
        boolean p=true;
        while (p&&(cont!=n)){
          if (n%cont == 0)
            p=false;
          cont++;
          System.out.println(n);
        }
        return p;
    }
	
	private static void SolucionB(PilaNumero a) {
		PilaNumero aux=new PilaNumero(),res=new PilaNumero();
		boolean sw;
		while(!a.esvacia()) {
			int x=a.eliminar();
			sw=true;
			while(!a.esvacia()) {
				int y=a.eliminar();
				if(y!=x)
					aux.adicionar(y);
				else
					sw=false;
			}
			if(sw)
				res.adicionar(x);
			a.vaciar(aux);
		}
		a.vaciar(res);
	}

	private static void SolucionA1(PilaNumero a) {
		PilaNumero aux=new PilaNumero(),res=new PilaNumero();
		while(!a.esvacia()) {
			int x=a.eliminar();
			if(esPrimo(x))
				res.adicionar(x);
			else
				aux.adicionar(x);
		}
		a.vaciar(res);
		a.vaciar(aux);
	}

	private static void SolucionA(PilaNumero a) {
		PilaNumero aux=new PilaNumero();
		int n=a.nroelem(),cont=0;
		aux.vaciar(a);
		for (int i = 0; i < n; i++) {
			int x=aux.eliminar();
			if(esPrimo(x)) {
				for (int j = 0; j < cont; j++)
					aux.adicionar(a.eliminar());
				a.adicionar(x);
				for (int j = 0; j < cont; j++)
					a.adicionar(aux.eliminar());
			}
			else {
				cont++;
				a.adicionar(x);
			}
		}
	}
	
	private static boolean esPrimo(int x) {
		if(x==0 || x==1)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}


	private static void Solucion2(PilaNumero a, PilaNumero b, int ie, int je) {
		if(ie<=a.nroelem() && je<=b.nroelem()) {
			ie=a.nroelem()-ie;
			je=b.nroelem()-je;
			for (int i = 0; i < ie; i++) 
				b.adicionar(a.eliminar());
			int x=a.eliminar();
			for (int i = 0; i < (ie+je); i++) 
				a.adicionar(b.eliminar());
			int y=b.eliminar();
			b.adicionar(x);
			for (int i = 0; i < (ie+je); i++) 
				b.adicionar(a.eliminar());
			a.adicionar(y);
			for (int i = 0; i < ie; i++) 
				a.adicionar(b.eliminar());
			
		}
	}
	// A = 1,4,5,2
	// B = 7,8,9
	// Resultado:
	// A = 8,4,2
	// B = 1,5,7,9

	private static void Solucion1(PilaNumero a, PilaNumero b) {
		int ni=separar(a,b,0);
		int np=separar(b,a,1);
		for (int i = 0; i < ni; i++) {
			int x=a.eliminar();
			for (int j = 0; j < (np+i); j++)
				a.adicionar(b.eliminar());
			b.adicionar(x);
			for (int j = 0; j < (np+i); j++)
				b.adicionar(a.eliminar());
		}
		for (int i = 0; i < np; i++) {
			int x=b.eliminar();
			for (int j = 0; j < i; j++)
				b.adicionar(a.eliminar());
			a.adicionar(x);
			for (int j = 0; j < i; j++)
				a.adicionar(b.eliminar());
		}
	}
	private static int separar(PilaNumero q, PilaNumero r, int val) {
		int n1=q.nroelem(),cont=0;
		r.vaciar(q);
		for (int i = 0; i < n1; i++) {
			int x=r.eliminar();
			if(x%2==val) {
				for (int j = 0; j < cont; j++)
					r.adicionar(q.eliminar());
				q.adicionar(x);
				for (int j = 0; j < cont; j++)
					q.adicionar(r.eliminar());
			}
			else {
				cont++;
				q.adicionar(x);
			}
		}
		return cont;
	}
}
