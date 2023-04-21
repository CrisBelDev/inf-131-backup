package Ejercicio_7;

public class Main {

	public static void main(String[] args) {
//		CSimpleCadena a=new CSimpleCadena();
////		a.llenar(Leer.datoInt());
//		a.adicionar("a");
//		a.adicionar("b");
//		a.adicionar("c");
//		a.adicionar("d");
//		a.adicionar("e");
//		System.out.println();
//		a.mostrar();
////		//1. Eliminar palabras que contienen al caracter X mas de Y veces
////		Solucion1(a,Leer.dato().charAt(0),Leer.datoInt());
////		//2. Cual es la palabra que mas se repite.
////		Solucion2(a);
//		//3. Ordenar ascendentemente sin usar auxiliares.
////		Solucion3(a);
////		System.out.println();
////		a.mostrar();
//		
//		CSimpleCadena b=new CSimpleCadena();
////		a.llenar(Leer.datoInt());
//		b.adicionar("1");
//		b.adicionar("2");
//		b.adicionar("3");
//		b.adicionar("4");
//		b.adicionar("5");
//		System.out.println();
//		b.mostrar();
//		//a) Dadas dos Cola de Cadenas A y B Intercambiar las k-primeras 
//		//cadenas de A con las J-ultimas cadenas de B(sin usar estructuras auxiliares).
//		SolucionA(a,b,2,3);
//		System.out.println();
//		a.mostrar();
//		System.out.println();
//		b.mostrar();
//		//b) Dadas una Cola de Números.Modificar el método adicionar 
//		//de tal forma que los números al ser agregadas se acomoden en orden ascendente.
//		CSimpleNumero c=new CSimpleNumero();
//		c.adicionar(9);
//		c.adicionar(4);
//		c.adicionar(1);
//		c.adicionar(6);
//		c.adicionar(8);
//		c.mostrar();
		
		CSimpleN px=new CSimpleN();
		px.adicionar(6);
		px.adicionar(4);
		px.adicionar(-2);
		px.adicionar(2);
		px.adicionar(4);
		px.adicionar(1);
		px.adicionar(-7);
		px.adicionar(0);
		System.out.println();
		px.mostrar();
		
		CSimpleN fx=new CSimpleN();
		fx.adicionar(3);
		fx.adicionar(2);
		fx.adicionar(-2);
		fx.adicionar(1);
		fx.adicionar(6);
		fx.adicionar(0);
		System.out.println();
		fx.mostrar();
		
		CSimpleN res=MultiplicarPolinomios(px,fx);
		System.out.println();
		res.mostrar();
		
	}
	private static CSimpleN MultiplicarPolinomios(CSimpleN px, CSimpleN fx) {
		CSimpleN aux=new CSimpleN(),rst=new CSimpleN(),mul=new CSimpleN();
		while(!fx.esvacio()){
			int base=fx.eliminar(),exp=fx.eliminar();
			SumarPolinomios(rst,MultiplicarTerminoFuncion(px,base,exp));
			aux.adicionar(base);
			aux.adicionar(exp);
		}
		fx.vaciar(aux);
		return rst;
	}
	
	private static void SumarPolinomios(CSimpleN sum, CSimpleN pol) {
		if(!sum.esvacio()) {
			boolean sw;
			CSimpleN aux=new CSimpleN();
			while(!pol.esvacio()) {
				int base1=pol.eliminar(),exp1=pol.eliminar();
				sw=true;
				while(!sum.esvacio()) {
					int base2=sum.eliminar(),exp2=sum.eliminar();
					if(exp1==exp2) {
						base2=base2+base1;
						sw=false;
					}	
					aux.adicionar(base2);
					aux.adicionar(exp2);
				}
				if(sw) {
					aux.adicionar(base1);
					aux.adicionar(exp1);
				}
				sum.vaciar(aux);
			}
			sum.vaciar(aux);
		}
		else
			sum.vaciar(pol);
	}
	private static CSimpleN MultiplicarTerminoFuncion(CSimpleN px, int basex, int expx) {
		CSimpleN aux=new CSimpleN(),rst=new CSimpleN();
		while(!px.esvacio()) {
			int base=px.eliminar(),exp=px.eliminar();
			aux.adicionar(base);
			aux.adicionar(exp);
			rst.adicionar(base*basex);
			rst.adicionar(exp+expx);
		}
		px.vaciar(aux);
		return rst;
	}
	private static void SolucionA(CSimpleCadena a, CSimpleCadena b, int k, int j) {
		if(k>0 && j>0 && a.nroElem()>=k && b.nroElem()>=j) {
			int n1=a.nroElem(),n2=b.nroElem();
			for (int i = 0; i < k; i++)
				a.adicionar(a.eliminar());
			for (int i = 0; i <(n1-k); i++)
				b.adicionar(a.eliminar());
			a.vaciar(b);
			for (int i = 0; i < k+(n2-j); i++)
				b.adicionar(a.eliminar());
			for (int i = 0; i < k ; i++)
				b.adicionar(b.eliminar());
		}
	}
	private static void Solucion3(CSimpleCadena a) {
		int n=a.nroElem();
		for (int i = 0; i < n; i++) {
			String x=a.eliminar();
			for (int j = i; j < n-1; j++) {
				String y=a.eliminar();
				if(y.compareTo(x)>=1) {
					a.adicionar(x);
					x=y;
				}
				else
					a.adicionar(y);
			}
			a.adicionar(x);
			for (int j = 0; j < i; j++)
				a.adicionar(a.eliminar());
		}
	}

	private static void Solucion2(CSimpleCadena a) {
		CSimpleCadena sinrep=sinRepetidos(a);
		int may=MaximodeRepeticiones(sinrep,a);
		CSimpleCadena aux=new CSimpleCadena();
		while(!sinrep.esvacio()) {
			String x=sinrep.eliminar();
			int cont=0;
			while(!a.esvacio()) {
				String y=a.eliminar();
				if(y.equals(x))
					cont++;
				aux.adicionar(y);
			}
			if(cont==may)
				System.out.println(x);
			a.vaciar(aux);
		}
	}

	private static int MaximodeRepeticiones(CSimpleCadena sinrep, CSimpleCadena a) {
		int may=0,cont;
		CSimpleCadena aux=new CSimpleCadena(),auxs=new CSimpleCadena();
		while(!sinrep.esvacio()) {
			String x=sinrep.eliminar();
			cont=0;
			while(!a.esvacio()) {
				String y=a.eliminar();
				if(x.equals(y))
					cont++;
				aux.adicionar(y);
			}
			a.vaciar(aux);
			if(cont>may)
				may=cont;
			auxs.adicionar(x);
		}
		sinrep.vaciar(auxs);
		return may;
	}

	private static CSimpleCadena sinRepetidos(CSimpleCadena a) {
		CSimpleCadena aux=new CSimpleCadena(),sinrep=new CSimpleCadena();
		while(!a.esvacio()) {
			String x=a.eliminar();
			if(!VerificarCadena(sinrep,x))
				sinrep.adicionar(x);
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return sinrep;
	}
	//x=4
	//e: 1,2,3,4,5,6
	//2,3,4,5,6,1 	i=0
	//3,4,5,6,1,2	i=1
	//4,5,6,1,2,3	i=2
	//,1,2,3,4,5,6	i=3
	
	private static boolean VerificarCadena(CSimpleCadena sinrep, String cx) {
		int n=sinrep.nroElem();
		for (int i = 0; i < n; i++) {
			String x=sinrep.eliminar();
			sinrep.adicionar(x);
			if(x.equals(cx)) {
				for (int j = 1; j < (n-i); j++) 
					sinrep.adicionar(sinrep.eliminar());
				return true;
			}
				
		}
		return false;
	}

	private static void Solucion1(CSimpleCadena a, char charx, int y) {
		int n=a.nroElem();
		for (int i = 0; i < n; i++) {
			String x=a.eliminar();
			if(VerificarCadenaCaraceter(x,charx,y))
				a.adicionar(x);
		}
	}

	private static boolean VerificarCadenaCaraceter(String x, char charx, int y) {
		int cont=0;
		for (int i = 0; i < x.length(); i++) {
			if(x.charAt(i)==charx)
				cont++;
			if(cont>y)
				return false;
		}
		return true;
	}

}
