package Ejercicio_1;


public class Main {
	
	public static void main(String[]args) {
		PilaCaracter pila=new PilaCaracter();
		//Dada una secuencia de parentesis verificar si esta balanceada.
		//Ej. ()()(()) = balanceada
		//Ej. ()(())) = no balanceada
		//String sec=Leer.dato();
		if(VerificarParentesis("))()(())",pila))
			System.out.println("balanceado");
		else
			System.out.println("no balanceado");
	}
	//))()(())
	//(
	//
	//(
	//
	//(
	//(
	//
	private static boolean VerificarParentesis(String sec, PilaCaracter pila) {
		for (int i = 0; i < sec.length(); i++) {
			char x=sec.charAt(i);
			if(x=='(')
				pila.adicionar(x);
			else {
				char y=pila.eliminar();
				if(y!='(')
					return false;
			}
		}
		if(!pila.esvacia())
			return false;
		return true;
	}

}
