package Defensa_1;

public class Main {

	public static void main(String[] args) {
		//Cola de AreaProtegida: IdAreaP, Categoría, nombre, superficie, ubicación, fechaCreacion
		//Cola de Ecorregiones: idAreaP, nombre
		//Pila de la Flora: idAreaP, nombre, familia, descripción
		//Pila de la Fauna: idAreaP, nombreComun, clase/tipo, descripción
		//a) Crear un objeto de cada estructura, llenar y mostrar
		CSimpleAP a=new CSimpleAP();
		a.llenar(Leer.datoInt());
		a.mostrar();
		CSimpleE b=new CSimpleE();
		b.llenar(Leer.datoInt());
		b.mostrar();
		PilaFl c=new PilaFl();
		c.llenar(Leer.datoInt());
		c.mostrar();
		PilaFa d=new PilaFa();
		d.llenar(Leer.datoInt());
		d.mostrar();
		//b) ¿Cuál es la mayor superficie de las áreas protegidas?
		
		//c) ¿Qué áreas protegidas tienen el menor número de Flora? 
		//Mostrar el Área Protegida.
		
		//d) Mostrar la Flora de las áreas protegidas que tienen a 
		//la “mara” o “cedro”.

	}

}
