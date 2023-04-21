package Ejercicio_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mian {

	public static void main(String[] args) {
		//Es dia de san valentin y los cines estan dando entradas a parejas,
		//se tiene registrado en las siguientes estructuras:
		//Cola de Peliculas (nombre,idpelicula, hora,nrosala)
		// y a las personas en una Pila de parejas(PersonaHombre<nombre,ci,edad>, 
		//PersonaMujer<nombre,ci,edad>, idpelicula)
		Stack<Pareja> a =new Stack<Pareja>();
		llenarP(a,Leer.datoInt());
		mostrarP(a);
		Queue<Pelicula> b=new LinkedList<Pelicula>();
		llenarC(b,Leer.datoInt());
		mostrarC(b);
		//1. Mostrar la(s) pelicula(s) mas vista.
		Solucion1(a,b);
		//2. Agrupar las parejas de acuerdo al orden de las pelicula.
		Solucion2(a,b);
	}
	private static void Solucion2(Stack<Pareja> a, Queue<Pelicula> b) {
		Queue<Pelicula> auxp=new LinkedList<Pelicula>();
		Stack<Pareja> auxe =new Stack<Pareja>(),rst=new Stack<Pareja>();
		while(!b.isEmpty()) {
			Pelicula x=b.poll();
			while(!a.isEmpty()) {
				Pareja y=a.pop();
				if(y.getIdpelicula().equals(x.getIdPelicula()))
					rst.push(y);
				else
					auxe.push(y);
			}
			//vaciarP(a, auxe);
			while(!auxe.isEmpty())
				a.push(auxe.pop());
			auxp.offer(x);
		}
		//vaciarC(b, auxp);
		while(!auxp.isEmpty())
			b.offer(auxp.poll());
		while(!rst.isEmpty())
			auxe.push(rst.pop());
		while(!auxe.isEmpty())
			a.push(auxe.pop());
		
	}
	//peli1 = 200 p
	//peli2 = 150 p
	//peli3 = 200 p
	private static void Solucion1(Stack<Pareja> a, Queue<Pelicula> b) {
		int max=MaximoCantidadEspectadores(a,b);
		Queue<Pelicula> aux=new LinkedList<Pelicula>();
		while(!b.isEmpty()) {
			Pelicula x=b.poll();
			if(ContarEspectadoresPelicula(x.getIdPelicula(),a)==max)
				x.mostrar();
			aux.offer(x);
		}
		//vaciarC(b, aux);
		while(!aux.isEmpty())
			b.offer(aux.poll());
	}

	private static int MaximoCantidadEspectadores(Stack<Pareja> a, Queue<Pelicula> b) {
		int max=0;
		Queue<Pelicula> aux=new LinkedList<Pelicula>();
		while(!b.isEmpty()) {
			Pelicula x=b.poll();
			if(ContarEspectadoresPelicula(x.getIdPelicula(),a)>max)
				max=ContarEspectadoresPelicula(x.getIdPelicula(),a);
			aux.offer(x);
		}
		//vaciarC(b, aux);
		while(!aux.isEmpty())
			b.offer(aux.poll());
		return max;
	}
	private static int ContarEspectadoresPelicula(String idPelicula, Stack<Pareja> a) {
		int cont=0;
		Stack<Pareja> aux=new Stack<Pareja>();
		while(!a.isEmpty()) {
			Pareja x=a.pop();
			if(x.getIdpelicula().equals(idPelicula))
				cont++;
			aux.push(x);
		}
		//vaciarP(a, aux);
		while(!aux.isEmpty())
			a.push(aux.pop());
		return cont;
	}
	private static void mostrarP(Stack<Pareja> a) {
		Stack<Pareja> aux =new Stack<Pareja>();
		while(!a.isEmpty()) {
			Pareja x=a.pop();
			x.mostrar();
			aux.push(x);
		}
		vaciarP(a,aux);
	}

	private static void vaciarP(Stack<Pareja> a, Stack<Pareja> aux) {
		while(!aux.isEmpty())
			a.push(aux.pop());
	}

	private static void llenarP(Stack<Pareja> a, int n) {
		for (int i = 0; i < n; i++) {
			Pareja x=new Pareja(new Persona(Leer.dato(),Leer.datoInt(),Leer.datoInt()), new Persona(Leer.dato(),Leer.datoInt(),Leer.datoInt()), Leer.dato());
			a.push(x);
		}
			
	}

	private static void mostrarC(Queue<Pelicula> b) {
		Queue<Pelicula> aux=new LinkedList<Pelicula>();
		while(!b.isEmpty()) {
			Pelicula x=b.poll();
			x.mostrar();
			aux.offer(x);
		}
		vaciarC(b,aux);
	}

	private static void vaciarC(Queue<Pelicula> b, Queue<Pelicula> aux) {
		while(!aux.isEmpty())
			b.offer(aux.poll());
	}

	private static void llenarC(Queue<Pelicula> b, int n) {
		for (int i = 0; i < n; i++)
			b.offer(new Pelicula(Leer.dato(), Leer.dato(), Leer.dato(), Leer.datoInt()));
	}
}
