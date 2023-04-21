package Defensa_2;

public class Main {
	public static void main(String[]args) {
		//Cola de Regi�n: idRegion, nombre, departamentos
		//Cola de Territorio Indigena Originario Campesino(TIOC): idRegion, 
		//idTIOC, nombre, ubicaci�n, superficie(km2),poblaci�n(nroHabitantes)
		//Pila de la Actividad Agr�cola: idTIOC, nomActividad, producci�n(nroToneladas), superficie(km2)
		//Pila de la Actividad Ganadera: idTIOC, nomGanado, nroCabezas
//		a) Crear un objeto de cada estructura, llenar y mostrar
		CSimpleRegion a=new CSimpleRegion();
		CSimpleTIOC b=new CSimpleTIOC();
		PilaActividadA c=new PilaActividadA();
		PilaActividadG d=new PilaActividadG();
		a.llenar();
		b.llenar();
		c.llenar();
		d.llenar();
		a.mostrar();b.mostrar();c.mostrar();d.mostrar();
		//b) �Cu�l es la mayor poblaci�n de TIOC por Regi�n?
		Solucion1(a,b);
		
		//b) Mostrar las TIOCS con mayor poblacion por Region
		Solucion1a(a,b);
		
		//c) �Qu� TIOCs tienen el mayor Producci�n en Actividad Agr�cola? 
		//Mostrar las TIOC.
		Solucion2(b,c);
		
		//d) Mostrar las Regiones de las TIOCs que tienen ganado �vacuno�.
		Solucion3(a,b,d,"vacuno");
	}
	private static void Solucion3(CSimpleRegion a, CSimpleTIOC b, PilaActividadG d, String nomganado) {
		CSimpleTIOC aux=new CSimpleTIOC();
		while(!b.esvacio()) {
			TIOC x=b.eliminar();
			if(VerificarGanadoTIOC(x.getIdTIOC(),nomganado,d))
				MostrarRegionTioc(x.getIdRegion(),a);
			aux.adicionar(x);
		}
		b.vaciar(aux);
	}
	private static void MostrarRegionTioc(String idRegion, CSimpleRegion a) {
		CSimpleRegion aux=new CSimpleRegion();
		while(!a.esvacio()) {
			Region x=a.eliminar();
			if(x.getIdRegion().equals(idRegion))
				x.mostrar();
			aux.adicionar(x);
		}
		a.vaciar(aux);
	}
	private static boolean VerificarGanadoTIOC(String idTIOC, String nomganado, PilaActividadG d) {
		boolean sw=false;
		PilaActividadG aux=new PilaActividadG();
		while(!d.esvacia()) {
			ActividadG x=d.eliminar();
			if(x.getIdTIOC().equals(idTIOC) && x.getNomGanado().equals(nomganado))
				sw=true;
			aux.adicionar(x);
		}
		d.vaciar(aux);
		return sw;
	}
	private static void Solucion2(CSimpleTIOC b, PilaActividadA c) {
		int maxprod=MaximaCantidadProduccionAgricolaTIOCs(b,c);
		CSimpleTIOC aux=new CSimpleTIOC();
		while(!b.esvacio()){
			TIOC x=b.eliminar();
			if(CantidaddeProduccionAgricola(x.getIdTIOC(),c)==maxprod)
				x.mostrar();
			aux.adicionar(x);
		}
		b.vaciar(aux);
	}
	private static int MaximaCantidadProduccionAgricolaTIOCs(CSimpleTIOC b, PilaActividadA c) {
		int maxprod=0;
		CSimpleTIOC aux=new CSimpleTIOC();
		while(!b.esvacio()){
			TIOC x=b.eliminar();
			if(CantidaddeProduccionAgricola(x.getIdTIOC(),c)>maxprod)
				maxprod=CantidaddeProduccionAgricola(x.getIdTIOC(),c);
			aux.adicionar(x);
		}
		b.vaciar(aux);
		return maxprod;
		
	}
	private static int CantidaddeProduccionAgricola(String idTIOC, PilaActividadA c) {
		int sumprod=0;
		PilaActividadA aux=new PilaActividadA();
		while(!c.esvacia()) {
			ActividadA x=c.eliminar();
			if(x.getIdTIOC().equals(idTIOC))
				sumprod=sumprod+x.getProduccion();
			aux.adicionar(x);
		}
		c.vaciar(aux);
		return sumprod;
	}
	// tioc 1 = 150 prod 
	// tioc 2 = 250 prod
	// tioc 3= 500 prod
	// tioc 4 = 50 prod
	// tioc 5 = 500 prod

	private static void Solucion1(CSimpleRegion a, CSimpleTIOC b) {
		CSimpleRegion aux=new CSimpleRegion();
		while(!a.esvacio()) {
			Region x=a.eliminar();
			System.out.println(x.getNombre()+"tiene un max poblacion="+MaxpoblacionRegionTioc(x.getIdRegion(),b));
			aux.adicionar(x);
		}
		a.vaciar(aux);
	}
	private static void Solucion1a(CSimpleRegion a, CSimpleTIOC b) {
		CSimpleRegion aux=new CSimpleRegion();
		CSimpleTIOC auxt=new CSimpleTIOC();
		while(!a.esvacio()) {
			Region x=a.eliminar();
			int max= MaxpoblacionRegionTioc(x.getIdRegion(), b);
			while(!b.esvacio()) {
				TIOC y=b.eliminar();
				if(y.getIdRegion().equals(x.getIdRegion()) && y.getPoblacion()==max)
					y.mostrar();
				auxt.adicionar(y);
			}
			aux.adicionar(x);
		}
		a.vaciar(aux);
	}
	private static int MaxpoblacionRegionTioc(String idRegion, CSimpleTIOC b) {
		int max=0;
		CSimpleTIOC aux=new CSimpleTIOC();
		while(!b.esvacio()) {
			TIOC x=b.eliminar();
			if(x.getIdRegion().equals(idRegion) && x.getPoblacion()>max)
				max=x.getPoblacion();
			aux.adicionar(x);
		}
		b.vaciar(aux);
		return max;
	}
}
