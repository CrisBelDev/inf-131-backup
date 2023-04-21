package Ejercicio_5;

public class Main {
	public static void main(String[]args) {
		//El servicio de mensajeria ABC otorga servicios de envio de cartas 
		//a sus clientes. 
		//Sea una Pila de Cartas<fecha (DD/MM/AAAA),asunto,contenido,ci> 
		//y Una Pila de Cliente<ci,nom,pat,mat>
		PilaCarta c=new PilaCarta();
		c.llenar(Leer.datoInt());
		c.mostrar();
		
		PilaCliente p=new PilaCliente();
		p.llenar(Leer.datoInt());
		p.mostrar();
		//1. Cuantas cartas tiene cada cliente con fecha Marzo del 2010
		Solucion1a(c,p,"03","2010");
		Solucion1b(c,p,"03","2010");
		//2. Mostrar lo(s) clientes con mas cartas.
		Solucion2(c,p);
		//3. Agrupar las cartas de la pila de cartas de acuerdo al orden 
		//   de los clientes en la Pila de Clientes.
		Solucion3(c,p);
		//4. Eliminar a las cartas que no tienen un cliente asociado a la empresa.
		Solucion4(c,p);
		
	}
	private static void Solucion4(PilaCarta c, PilaCliente p) {
		PilaCarta auxc=new PilaCarta();
		while(!c.esvacia()) {
			Carta x=c.eliminar();
			if(VerificarCartaCliente(x.getCi(),p))
				auxc.adicionar(x);
		}
		c.vaciar(auxc);
	}
	private static boolean VerificarCartaCliente(int ci, PilaCliente p) {
		PilaCliente auxp=new PilaCliente();
		while(!p.esvacia()) {
			Cliente x=p.eliminar();
			auxp.adicionar(x);
			if(x.getCi()==ci) {
				p.vaciar(auxp);
				return true;
			}	
		}
		p.vaciar(auxp);
		return false;
	}
	private static void Solucion3(PilaCarta c, PilaCliente p) {
		PilaCarta auxc=new PilaCarta(),res=new PilaCarta();
		PilaCliente auxp=new PilaCliente();
		while(!p.esvacia()) {
			Cliente x=p.eliminar();
			while(!c.esvacia()) {
				Carta y=c.eliminar();
				if(y.getCi()==x.getCi())
					res.adicionar(y);
				else
					auxc.adicionar(y);
			}
			c.vaciar(auxc);
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
		c.vaciar(res);
	}
	
	private static void Solucion2(PilaCarta c, PilaCliente p) {
		int may=MayorCantidadCartas(c,p);
		PilaCliente auxp=new PilaCliente();
		while(!p.esvacia()) {
			Cliente x=p.eliminar();
			if(ContarCartasCliente(x.getCi(),c)==may)
				x.mostrar();
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
	}
	private static int MayorCantidadCartas(PilaCarta c, PilaCliente p) {
		int may=0;
		PilaCliente auxp=new PilaCliente();
		while(!p.esvacia()) {
			Cliente x=p.eliminar();
			if(ContarCartasCliente(x.getCi(),c)>may)
				may=ContarCartasCliente(x.getCi(),c);
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
		return may;
	}
	private static int ContarCartasCliente(int ci, PilaCarta c) {
		int cont=0;
		PilaCarta auxc=new PilaCarta();
		while(!c.esvacia()) {
			Carta x=c.eliminar();
			if(x.getCi()==ci)
				cont++;
			auxc.adicionar(x);
		}
		c.vaciar(auxc);
		return cont;
	}
	private static void Solucion1b(PilaCarta c, PilaCliente p, String mes, String anio) {
		PilaCliente auxp=new PilaCliente();
		PilaCarta auxc=new PilaCarta();
		while(!p.esvacia()) {
			Cliente x=p.eliminar();
			int cont=0;
			while(!c.esvacia()) {
				Carta y=c.eliminar();
				if(y.getCi()==x.getCi() && y.getFecha().substring(3, 5).equals(mes) && y.getFecha().substring(6).equals(anio))
					cont++;
				auxc.adicionar(y);			
			}
			c.vaciar(auxc);
			System.out.println(x.getNom()+" "+x.getPat()+" "+x.getMat()+" tiene "+cont);
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
	}
	//"hamburger".substring(4, 8) returns "urge"
	//"unhappy".substring(2) returns "happy"
	//DD/MM/AAAA

	private static void Solucion1a(PilaCarta c, PilaCliente p, String mes, String anio) {
		PilaCliente auxp=new PilaCliente();
		while(!p.esvacia()) {
			Cliente x=p.eliminar();
			System.out.println(x.getNom()+" "+x.getPat()+" "+x.getMat()+" tiene "+ContarCartas(x.getCi(),c,mes,anio));
			auxp.adicionar(x);
		}
		p.vaciar(auxp);
	}

	private static int ContarCartas(int ci, PilaCarta c, String mes, String anio) {
		int cont=0;
		PilaCarta auxc=new PilaCarta();
		while(!c.esvacia()) {
			Carta x=c.eliminar();
			if(x.getCi()==ci && x.getFecha().substring(3, 5).equals(mes) && x.getFecha().substring(6).equals(anio))
				cont++;
			auxc.adicionar(x);			
		}
		c.vaciar(auxc);
		return cont;
	}

}
