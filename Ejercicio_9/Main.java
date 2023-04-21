package Ejercicio_9;

public class Main {
	public static void main(String[]args) {
		//Sea una Cola Simple de Estudiante(nombre, ci) y 
		//una Cola Circular de Practicas (ci,nota,nroP)
		CSimpleEst a=new CSimpleEst();
		a.llenar();
		System.out.println("Cola Estudiante:");
		a.mostrar();
		
		CCircularPract b=new CCircularPract();
		b.llenar();
		System.out.println("Cola Practica:");
		b.mostrar();
		//1. Sacar el promedio de cada estudiante(teniendo en 
		//cuenta que se tienen 3 practicas).
		Solucion1(a,b);
		//2. Agrupar las notas de los estudiantes en el orden el que 
		//se encuentran en la cola de estudiantes, tal forma que esten 
		//ordenadas por nota.
		Solucion2(a,b);
		//3. Eliminar aquellos estudiantes reprobados, además de 
		//eliminar sus prácticas
		Solucion3(a,b);

	}

	private static void Solucion3(CSimpleEst a, CCircularPract b) {
		int n=a.nroElem();
		for (int i = 0; i < n; i++) {
			Estudiante x=a.eliminar();
			if(SumarNota(x.getCi(), b)/3 >= 51)
				a.adicionar(x);
			else
				EliminarPracticasEstudiante(x.getCi(),b);
		}
	}

	private static void EliminarPracticasEstudiante(int ci, CCircularPract b) {
		int n=b.nroelem();
		for (int i = 0; i < n; i++) {
			Practica y=b.eliminar();
			if(y.getCi()!=ci)
				b.adicionar(y);
		}
	}

	private static void Solucion2(CSimpleEst a, CCircularPract b) {
		OrdenarPracticasNota(b);
		CSimpleEst auxe=new CSimpleEst();
		CCircularPract auxp=new CCircularPract(),rst=new CCircularPract();
		while(!a.esvacia()) {
			Estudiante x=a.eliminar();
			while(!b.esvacia()) {
				Practica y=b.eliminar();
				if(y.getCi()==x.getCi())
					rst.adicionar(y);
				else
					auxp.adicionar(y);
			}
			b.vaciar(auxp);
			auxe.adicionar(x);
		}
		a.vaciar(auxe);
		b.vaciar(rst);
		
	}

	private static void OrdenarPracticasNota(CCircularPract b) {
		CCircularPract aux=new CCircularPract(),rst=new CCircularPract();
		while(!b.esvacia()) {
			Practica may=b.eliminar();
			while(!b.esvacia()) {
				Practica y=b.eliminar();
				if(y.getNota()>may.getNota()) {
					aux.adicionar(may);
					may=y;
				}
				else
					aux.adicionar(y);
			}
			b.vaciar(aux);
			rst.adicionar(may);
		}
		b.vaciar(rst);		
	}

	private static void Solucion1(CSimpleEst a, CCircularPract b) {
		CSimpleEst aux=new CSimpleEst();
		while(!a.esvacia()) {
			Estudiante x=a.eliminar();
			System.out.println(x.getNom()+" "+(SumarNota(x.getCi(),b)/3));
			aux.adicionar(x);
		}
		a.vaciar(aux);
	}

	private static int SumarNota(int ci, CCircularPract b) {
		int sum=0;
		CCircularPract aux=new CCircularPract();
		while(!b.esvacia()) {
			Practica x=b.eliminar();
			if(x.getCi()==ci)
				sum+=x.getNota();//suma=suma+x.getNota();
			aux.adicionar(x);
		}
		b.vaciar(aux);
		return sum;
	}

	

}
