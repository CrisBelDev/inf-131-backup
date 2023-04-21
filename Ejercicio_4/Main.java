package Ejercicio_4;

import Ejercicio_2.Leer;

public class Main {
	public static void main(String[]args) {
		PilaMascota a=new PilaMascota();
		a.llenar(Leer.datoInt());
		a.mostrar();
		//1. Eliminar a la(s) mascota(s) con la mayor edad
		Solucion1a(a);
		//1. Eliminar a la(s) mascota(s) con la menor edad
		Solucion1b(a);
		//2. Agrupar a las mascotas por tipo
		Solucion2(a);
		//3. Ordenar a las mascotas por edad ascendentemente
		Solucion3(a);
		//4. Dada que la pila esta ordenada por edad, agregar una nueva
		//   mascota donde corresponda manteniendo el orden.
		Solucion4(a,new Mascota(Leer.dato(),Leer.dato(),Leer.datoInt()));
	}

	private static void Solucion4(PilaMascota a, Mascota nueva) {
		boolean sw=true;
		PilaMascota aux=new PilaMascota();
		while(!a.esvacia()) {
			Mascota x=a.eliminar();
			if(nueva.getEdad()>x.getEdad()) {
				aux.adicionar(nueva);
				aux.adicionar(x);
				sw=false;
			}
			else
				aux.adicionar(x);
		}
		if(sw)
			aux.adicionar(nueva);
		a.vaciar(aux);
	}

	private static void Solucion3(PilaMascota a) {
		PilaMascota aux=new PilaMascota(),rst=new PilaMascota();
		while(!a.esvacia()) {
			Mascota may=a.eliminar();
			while(!a.esvacia()) {
				Mascota x=a.eliminar();
				if(x.getEdad()>may.getEdad()) {
					aux.adicionar(may);
					may=x;
				}
				else
					aux.adicionar(x);
			}
			a.vaciar(aux);
			rst.adicionar(may);
		}
		a.vaciar(rst);
	}

	private static void Solucion2(PilaMascota a) {
		PilaMascota aux=new PilaMascota(),rst=new PilaMascota();
		while(!a.esvacia()) {
			Mascota x=a.eliminar();
			rst.adicionar(x);
			while(!a.esvacia()) {
				Mascota y=a.eliminar();
				if(y.getTipo().equals(x.getTipo()))
					rst.adicionar(y);
				else
					aux.adicionar(y);
			}
			a.vaciar(aux);
		}
		a.vaciar(rst);
	}

	private static void Solucion1b(PilaMascota a) {
		int menedad=MenorEdadMascotas(a);
		PilaMascota aux=new PilaMascota();
		while(!a.esvacia()) {
			Mascota x=a.eliminar();
			if(x.getEdad()!=menedad)
				aux.adicionar(x);
		}
		a.vaciar(aux);
	}

	private static void Solucion1a(PilaMascota a) {
		int mayedad=MayorEdadMascotas(a);
		PilaMascota aux=new PilaMascota();
		while(!a.esvacia()) {
			Mascota x=a.eliminar();
			if(x.getEdad()!=mayedad)
				aux.adicionar(x);
		}
		a.vaciar(aux);
	}

	private static int MayorEdadMascotas(PilaMascota a) {
		int may=0;
		PilaMascota aux=new PilaMascota();
		while(!a.esvacia()) {
			Mascota x=a.eliminar();
			if(x.getEdad()>may)
				may=x.getEdad();
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return may;
	}
	private static int MenorEdadMascotas(PilaMascota a) {
		int men=100;
		PilaMascota aux=new PilaMascota();
		while(!a.esvacia()) {
			Mascota x=a.eliminar();
			if(x.getEdad()<men)
				men=x.getEdad();
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return men;
	}

}
