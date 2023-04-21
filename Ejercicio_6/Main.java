package Ejercicio_6;

public class Main {
	public static void main(String[]args) {
		// La universidad abre los periodos de inscripcion a materias para lo cual
		// hace uso de las siguientes estructuras:
		PilaMateria m=new PilaMateria();
		m.llenar(Leer.datoInt());
		m.mostrar();
		PilaParalelo p=new PilaParalelo();
		p.llenar(Leer.datoInt());
		p.mostrar();
		PilaEstudiante e=new PilaEstudiante();
		e.llenar(Leer.datoInt());
		e.mostrar();
		//1. Cuantos estudiantes hay en cada materia
		Solucion1(m,p);
		//2. Mostrar las materias que tomo el estudiante de nombre X
		Solucion2(e,m,p,Leer.dato());
		//3. Verificar si el estudiante de nombre X tomo todas las materias del 3er semestre.
		if(Solucion3(m,p,e,Leer.dato(),3))
			System.out.println("Si");
		else
			System.out.println("No");
		//4. Mostrar el nombre de la materia y paralelos en lo que se lleno el cupo maximo.
		Solucion4(m,p,e);
		//5. Adicionar al estudiante con nombre X la materia Y, paralelo Z, siempre y cuando haya cupo.
		Solucion5(m,p,e,Leer.dato(),Leer.dato(),"F");
		m.mostrar();
		p.mostrar();
		e.mostrar();
		//6. Eliminar a aquellos estudiantes que no estan inscritos en ninguna materia.
		Solucion6(p,e);
		p.mostrar();
		e.mostrar();
		
	}

	private static void Solucion6(PilaParalelo p, PilaEstudiante e) {
		PilaEstudiante auxe=new PilaEstudiante();
		while(!e.esvacia()) {
			Estudiante x=e.eliminar();
			if(VerificarInscripcionMateriasEstudiante(x.getCi(),p))
				auxe.adicionar(x);
		}
		e.vaciar(auxe);
	}

	private static boolean VerificarInscripcionMateriasEstudiante(int ci, PilaParalelo p) {
		boolean sw=false;
		PilaParalelo auxp=new PilaParalelo();
		while(!p.esvacia()) {
			Paralelo x=p.eliminar();
			if(x.getCi()==ci)
				sw=true;
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
		return sw;
	}

	private static void Solucion5(PilaMateria m, PilaParalelo p, PilaEstudiante e, String nomx, String maty, String parz) {
		int cie=ObtenerCiEstudiante(e, nomx);
		String codM=ObtenerCodMateria(m,maty);
		if(cie>0 && codM!=null) {
			PilaParalelo auxp=new PilaParalelo();
			int cont=0,nrocupos=-1;
			while(!p.esvacia()) {
				Paralelo x=p.eliminar();
				if(x.getCodM().equals(codM) && x.getParalelo().equals(parz)) {
					cont++;
					nrocupos=x.getNrocoupos();
				}
					
				auxp.adicionar(x);
			}
			p.vaciar(auxp);
			if(nrocupos>0 && cont!=nrocupos)
				p.adicionar(new Paralelo(parz, codM, cie, nrocupos));
		}
		
	}
	private static String ObtenerCodMateria(PilaMateria m, String maty) {
		String codM=null;
		PilaMateria auxm=new PilaMateria();
		while(!m.esvacia()) {
			Materia x=m.eliminar();
			if(x.getMateria().equals(maty))
				codM=x.getCodM();
			auxm.adicionar(x);
		}
		m.vaciar(auxm);
		return codM;
	}
	//Materia mat01, Estructuras de Datos y Algoritmos, INF-131, 3
	//Materia mat02, LAboratorio de INF-131, LAB-131, 3
	
	//Paralelo A,mat01,111,5
	//Paralelo A,mat01,222,5
	//Paralelo A,mat01,333,5
	//Paralelo A,mat01,777,5
	//Paralelo A,mat01,888,5
	
	//Paralelo B,mat01,444,6
	//Paralelo B,mat01,555,6

	//Paralelo C,mat01,000,3
	//Paralelo C,mat01,5555,3
	
	//Paralelo D,mat01,4444,2
	
	//Paralelo A,mat02,111,3
	//Paralelo A,mat02,222,3
		
	//Paralelo B,mat02,333,2
	
	

	//PILA PARALELO UNICOS:
	//Paralelo A,mat01,0,5
	//Paralelo B,mat01,0,6
	//Paralelo C,mat01,0,3
	//Paralelo D,mat01,0,2
	//Paralelo A,mat02,0,3
	//Paralelo B,mat02,0,2
	private static void Solucion4(PilaMateria m, PilaParalelo p, PilaEstudiante e) {
		PilaParalelo unicos=new PilaParalelo(),auxpunicos=new PilaParalelo();
		EncontrarParalelos(unicos,m,p);
		PilaMateria auxm=new PilaMateria();
		while(!m.esvacia()) {
			Materia x=m.eliminar();
			while(!unicos.esvacia()) {
				Paralelo y=unicos.eliminar();
				if(y.getCodM().equals(x.getCodM()) && ContarEstudiantesParalelo(y,p)==y.getNrocoupos())
					System.out.println(x.getMateria()+" "+y.getParalelo());
				auxpunicos.adicionar(y);
			}
			unicos.vaciar(auxpunicos);
			auxm.adicionar(x);
 		}
		m.vaciar(auxm);
	}
	
	private static int ContarEstudiantesParalelo(Paralelo y, PilaParalelo p) {
		int sum=0;
		PilaParalelo auxp=new PilaParalelo();
		while(!p.esvacia()) {
			Paralelo x=p.eliminar();
			if(x.getCodM().equals(y.getCodM()) && x.getParalelo().equals(y.getParalelo()))
				sum++;
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
		return sum;
	}

	private static void EncontrarParalelos(PilaParalelo unicos, PilaMateria m, PilaParalelo p) {
		PilaMateria auxm=new PilaMateria();
		PilaParalelo auxp=new PilaParalelo();
		while(!m.esvacia()) {
			Materia x=m.eliminar();
			while(!p.esvacia()) {
				Paralelo y=p.eliminar();
				if(x.getCodM().equals(y.getCodM()))
					if(!VerificarExisteciaUnicosParalelos(unicos,y))
						unicos.adicionar(new Paralelo(y.getParalelo(), y.getCodM(), 0, y.getNrocoupos()));
				auxp.adicionar(y);
			}
			p.vaciar(auxp);
			auxm.adicionar(x);
		}
		m.vaciar(auxm);
	}

	private static boolean VerificarExisteciaUnicosParalelos(PilaParalelo unicos, Paralelo y) {
		boolean sw=false;
		PilaParalelo aux=new PilaParalelo();
		while(!unicos.esvacia()) {
			Paralelo x=unicos.eliminar();
			if(x.getCodM().equals(y.getCodM()) && x.getParalelo().equals(y.getParalelo()))
				sw=true;
			aux.adicionar(x);
		}
		unicos.vaciar(aux);
		return sw;
	}

	private static boolean Solucion3(PilaMateria m, PilaParalelo p, PilaEstudiante e, String nomx, int semx) {
		boolean sw=true;
		int cie=ObtenerCiEstudiante(e,nomx);
		if(cie!=-1) {
			PilaMateria auxm=new PilaMateria();
			while(!m.esvacia()) {
				Materia x=m.eliminar();
				if(x.getSemestre()==semx)
					if(!VerficarInscripcionEstMatPar(cie,x.getCodM(),p)) // not false = true
						sw=false;
				auxm.adicionar(x);	
			}
			m.vaciar(auxm);
			return sw;
		}
		else
			System.out.println("Estudiante no existe");
		return false;
	}

	private static boolean VerficarInscripcionEstMatPar(int cie, String codM, PilaParalelo p) {
		boolean sw=false;
		PilaParalelo auxp=new PilaParalelo();
		while(!p.esvacia()) {
			Paralelo x=p.eliminar();
			if(x.getCodM().equals(codM) && x.getCi()==cie)
				sw=true;
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
		return sw;
	}

	private static int ObtenerCiEstudiante(PilaEstudiante e, String nomx) {
		int ci=-1;
		PilaEstudiante auxe=new PilaEstudiante();
		while(!e.esvacia()) {
			Estudiante x=e.eliminar();
			if(x.getNombre().equals(nomx))
				ci=x.getCi();
			auxe.adicionar(x);
		}
		e.vaciar(auxe);
		return ci;
	}

	private static void Solucion2(PilaEstudiante e, PilaMateria m, PilaParalelo p, String nomx) {
		PilaEstudiante auxe=new PilaEstudiante();
		while(!e.esvacia()) {
			Estudiante x=e.eliminar();
			if(x.getNombre().equals(nomx))
				MostrarMateriasEstudiante(x.getCi(), m,p);
			auxe.adicionar(x);
		}
		e.vaciar(auxe);
	}

	private static void MostrarMateriasEstudiante(int ci, PilaMateria m, PilaParalelo p) {
		PilaParalelo auxp=new PilaParalelo();
		while(!p.esvacia()) {
			Paralelo x=p.eliminar();
			if(x.getCi()==ci)
				MsstrarMateria(x.getCodM(),m);
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
	}

	private static void MsstrarMateria(String codM, PilaMateria m) {
		PilaMateria auxm=new PilaMateria();
		while(!m.esvacia()) {
			Materia x=m.eliminar();
			if(x.getCodM().equals(codM))
				m.mostrar();
			auxm.adicionar(x);
		}
		m.vaciar(auxm);
	}

	private static void Solucion1(PilaMateria m, PilaParalelo p) {
		PilaMateria auxm=new PilaMateria();
		while(!m.esvacia()) {
			Materia x=m.eliminar();
			System.out.println(ContarEstudiantesParalelo(x.getCodM(),p));
			auxm.adicionar(x);
		}
		m.vaciar(auxm);
	}
	//inf-131
	//A , inf-131, 1111, 6
	//A , inf-131, 2222, 6
	//B , inf-131, 3333, 5
	//B , inf-131, 4444, 5
	private static int ContarEstudiantesParalelo(String codM, PilaParalelo p) {
		int sum=0;
		PilaParalelo auxp=new PilaParalelo();
		while(!p.esvacia()) {
			Paralelo x=p.eliminar();
			if(x.getCodM().equals(codM))
				sum++;
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
		return sum;
	}

}
