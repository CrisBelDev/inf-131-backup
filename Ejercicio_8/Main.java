package Ejercicio_8;

public class Main {
	
	public static void main(String[]args) {
		//Sea una Pila de Cadeanas A y Una Cola Simple de Cadenas B
		PilaCadena a=new PilaCadena();
		a.llenar(Leer.datoInt());
		a.mostrar();
		CSimpleCadena b=new CSimpleCadena();
		b.llenar(Leer.datoInt());
		b.mostrar();
		//Intercambiar el i-esimo elemento de A con el j-esimo de B
		IntercambiarIeJe(a,b,Leer.datoInt(),Leer.datoInt());
		a.mostrar();
		b.mostrar();
		
	}

	private static void IntercambiarIeJe(PilaCadena a, CSimpleCadena b, int ie, int je) {
		if(a.nroElem()>=ie && b.nroElem()>=je) {
			int n1=a.nroElem(),n2=b.nroElem();
			ie=a.nroElem()-ie;
			je=je-1;
			for (int i = 0; i < ie; i++)
				b.adicionar(a.eliminar());
			String x=a.eliminar();
			for (int i = 0; i < je; i++)
				b.adicionar(b.eliminar());
			String y=b.eliminar();
			a.adicionar(y);
			b.adicionar(x);
			
			for (int i = 0; i < (n2-(je+1)); i++)
				b.adicionar(b.eliminar());
			for (int i = 0; i < ie; i++)
				a.adicionar(b.eliminar());
			for (int i = 0; i < ie; i++)
				b.adicionar(a.eliminar());
			
			for (int i = 0; i < n2; i++)
				b.adicionar(b.eliminar());
			for (int i = 0; i < ie; i++)
				a.adicionar(b.eliminar());
			
		}
	}
}
