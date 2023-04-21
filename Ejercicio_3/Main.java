package Ejercicio_3;

public class Main {

	public static void main(String[] args) {
		PilaLibro a=new PilaLibro();
		a.llenar(Leer.datoInt());
		a.mostrar();
		//1. Mostrar los libros del autor de nombre X.
		Solucion1(a,Leer.dato());
		//2. Contar cuantos libros de 7ma edicion tiene el autor de nombre X.
		System.out.println(Solucion2(a,Leer.dato()));
		//3. Verificar si todos los libros del autor X tienen año de publicacion mayor a X.
		if(Solucion3(a,Leer.dato(),Leer.datoInt()))
			System.out.println("verdad");
		else
			System.out.println("falso");
		//4. Verificar si algun libro del autor X es de 8va edicion
		System.out.println(Solucion4(a,Leer.dato()));
	}
	private static boolean Solucion4(PilaLibro a, String autx) {
		boolean sw=false;
		PilaLibro aux=new PilaLibro();
		while(!a.esvacia()) {
			Libro x=a.eliminar();
			if(x.getAutor().equals(autx) && x.getEdicion()==8)
				sw=true;
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return sw;
	}
	private static boolean Solucion3(PilaLibro a, String autx, int aniox) {
		boolean sw=true;
		PilaLibro aux=new PilaLibro();
		while(!a.esvacia()) {
			Libro x=a.eliminar();
			if(x.getAutor().equals(autx) && x.getAniopublicacion()<=aniox)
				sw=false;
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return sw;
	}
	private static int Solucion2(PilaLibro a, String autx) {
		int cont=0;
		PilaLibro aux=new PilaLibro();
		while(!a.esvacia()) {
			Libro x=a.eliminar();
			if(x.getAutor().equals(autx) && x.getEdicion()==7)
				cont++;
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return cont;
	}
	//equals "ABC"=="ABC" true , "ABc"=="ABC" false
	//equalsIgnoreCase "ABC"=="ABC" true , "aBc"=="ABC" true, "abc"=="bca" false
	private static void Solucion1(PilaLibro a, String autx) {
		PilaLibro aux=new PilaLibro();
		while(!a.esvacia()) {
			Libro x=a.eliminar();
			if(x.getAutor().equals(autx))
				x.mostrar();
			aux.adicionar(x);
		}
		a.vaciar(aux);
	}

}
