package Defensa_1;

public class Main {

	public static void main(String[] args) {
		//Cola de AreaProtegida: IdAreaP, Categor�a, nombre, superficie, ubicaci�n, fechaCreacion
		//Cola de Ecorregiones: idAreaP, nombre
		//Pila de la Flora: idAreaP, nombre, familia, descripci�n
		//Pila de la Fauna: idAreaP, nombreComun, clase/tipo, descripci�n
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
		//b) �Cu�l es la mayor superficie de las �reas protegidas?
		
		//c) �Qu� �reas protegidas tienen el menor n�mero de Flora? 
		//Mostrar el �rea Protegida.
		
		//d) Mostrar la Flora de las �reas protegidas que tienen a 
		//la �mara� o �cedro�.

	}

}
