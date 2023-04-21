package Defensa_4;

public class main {
	public static void main(String[]args) {
		//Cola CRU_SUL: idCruSul, nombre, provincia, teléfono
		//Pila Facultades: idFacultad, nombre, dirección, teléfono
		//Pila Programa Academico: idCruSul, idFacultad, nivel, nombre, 
		//estado, nroEstudiantes,fechaInicio(dd/mm/aaaa), 
		//fechaFinalizacion(dd/mm/aaaa)
//		a) Crear un objeto de cada estructura, llenar(opcional) y mostrar
		CSimpleCruSul a=new CSimpleCruSul();
		a.llenar(Leer.datoInt());
		a.mostrar();
		PilaFacultad b=new PilaFacultad();
		b.llenar(Leer.datoInt());
		b.mostrar();
		PilaProgAcademico c=new PilaProgAcademico();
		c.llenar(Leer.datoInt());
		c.mostrar();
//		b) Mostrar la provincia, nombre de la facultad, nivel y nombre del 
//		programa académico, que se abrieron el año pasado.
		Solucion1(a,b,c);
		
//		c) De cada Facultad mostrar el(los) programa académico (nivel, 
//		nombre, estado) con mayor número de estudiantes.
		Solucion2(b,c);
//		d) Ordenar los programas académicos según el orden de CRU_SUL.
		Solucion3(a,c);
		a.mostrar();
		c.mostrar();
		//

	}
	private static void Solucion3(CSimpleCruSul a, PilaProgAcademico c) {
		CSimpleCruSul auxc=new CSimpleCruSul();
		PilaProgAcademico auxp=new PilaProgAcademico(),rst=new PilaProgAcademico();
		while(!a.esvacia()) {
			CruSul x=a.eliminar();
			while(!c.esvacia()) {
				ProgAcademico y=c.eliminar();
				if(y.getIdCruSul().equals(x.getIdCruSul()))
					rst.adicionar(y);
				else
					auxp.adicionar(y);
			}
			c.vaciar(auxp);
			auxc.adicionar(x);
		}
		a.vaciar(auxc);
		auxp.vaciar(rst);
		c.vaciar(auxp);
	}
	//facu 1 :
	//pro 1 = 20est
	//pro 2 = 40est
	//pro 3 = 40est
	private static void Solucion2(PilaFacultad b, PilaProgAcademico c) {
		PilaFacultad aux=new PilaFacultad();
		while(!b.esvacia()) {
			Facultad x=b.eliminar();
			System.out.println(x.getNombre());
			MostrarProgAcademicosMaxEstudiantes(x.getIdFacultad(),c,MaxCantidadEstudiantesProgFacu(x.getIdFacultad(),c));
			aux.adicionar(x);
		}
		b.vaciar(aux);
	}

	private static void MostrarProgAcademicosMaxEstudiantes(String idFacultad, PilaProgAcademico c, int max) {
		PilaProgAcademico aux=new PilaProgAcademico();
		while(!c.esvacia()) {
			ProgAcademico x=c.eliminar();
			if(x.getIdFacultad().equals(idFacultad) && x.getNroestudiantes()==max)
				System.out.println(x.getNivel()+" "+x.getNombre()+" "+x.getEstado());
			aux.adicionar(x);
		}
		c.vaciar(aux);
	}

	private static int MaxCantidadEstudiantesProgFacu(String idFacultad, PilaProgAcademico c) {
		int max=0;
		PilaProgAcademico aux=new PilaProgAcademico();
		while(!c.esvacia()) {
			ProgAcademico x=c.eliminar();
			if(x.getIdFacultad().equals(idFacultad) && x.getNroestudiantes()>max)
				max=x.getNroestudiantes();
			aux.adicionar(x);
		}
		c.vaciar(aux);
		return max;
	}

	private static void Solucion1(CSimpleCruSul a, PilaFacultad b, PilaProgAcademico c) {
		PilaProgAcademico aux=new PilaProgAcademico();
		while(!c.esvacia()) {
			ProgAcademico x=c.eliminar();
			if(x.getFechaInicio().substring(6).equals("2020"))
				System.out.println(MostrarProvincia(x.getIdCruSul(),a)+" "+MostrarFacultad(x.getIdFacultad(),b)+" "+x.getNivel()+" "+x.getNombre());
			aux.adicionar(x);
		}
		c.vaciar(aux);
	}

	private static String MostrarFacultad(String idFacultad, PilaFacultad b) {
		String nomfac=null;
		PilaFacultad aux=new PilaFacultad();
		while(!b.esvacia()) {
			Facultad x=b.eliminar();
			if(x.getIdFacultad().equals(idFacultad))
				nomfac=x.getNombre();
			aux.adicionar(x);
		}
		b.vaciar(aux);
		return nomfac;
	}

	private static String MostrarProvincia(String idCruSul, CSimpleCruSul a) {
		String nomprov=null;
		CSimpleCruSul aux=new CSimpleCruSul();
		while(!a.esvacia()) {
			CruSul x=a.eliminar();
			if(x.getIdCruSul().equals(idCruSul))
				nomprov=x.getProvincia();
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return nomprov;
	}

}
