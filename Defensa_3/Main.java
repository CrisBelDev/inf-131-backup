package Defensa_3;

public class Main {
	
	public static void main(String[]args) {
		//Cola Estaci�n Experimental: idEst, nombre, direcci�n
		//Cola Producci�n de Productos: idEst, fecha(dd/mm/aaaa), producto, 
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
		//b) En la estaci�n experimental con nombre X, mostrar los datos de 
		//la producci�n del producto P en este a�o.
		
		//c) Mostrar nombre y variedad de los Animales en mayor cantidad de 
		//cada Estaci�n Experimental.
		
		//d) Llevar a la estaci�n experimental X, su producci�n y su crianza 
		//al final de cada estructura.
	}

}
