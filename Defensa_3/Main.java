package Defensa_3;

public class Main {
	
	public static void main(String[]args) {
		//Cola Estación Experimental: idEst, nombre, dirección
		//Cola Producción de Productos: idEst, fecha(dd/mm/aaaa), producto, 
		//tipo, variedad, cantidad.
		//Pila Crianza de Animales: idEst, nombre, variedad, cantidad, edad.
		//a) Crear un objeto de cada estructura, llenar(opcional) y mostrar
		CSimpleEE a=new CSimpleEE();
		a.llenar(Leer.datoInt());
		a.mostrar();
		CSimpleP b=new CSimpleP();
		b.llenar(Leer.datoInt());
		b.mostrar();
		PilaCA c=new PilaCA();
		c.llenar(Leer.datoInt());
		c.mostrar();
		//b) En la estación experimental con nombre X, mostrar los datos de 
		//la producción del producto P en este año.
		
		//c) Mostrar nombre y variedad de los Animales en mayor cantidad de 
		//cada Estación Experimental.
		
		//d) Llevar a la estación experimental X, su producción y su crianza 
		//al final de cada estructura.
	}

}
