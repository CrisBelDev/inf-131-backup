package Ejercicio_10;

public class Pareja {
	private Persona ph=new Persona(),pm=new Persona();
	private String idpelicula;
	public Pareja(Persona ph, Persona pm, String idpelicula) {
		super();
		this.ph = ph;
		this.pm = pm;
		this.idpelicula = idpelicula;
	}
	public Pareja() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona getPh() {
		return ph;
	}
	public void setPh(Persona ph) {
		this.ph = ph;
	}
	public Persona getPm() {
		return pm;
	}
	public void setPm(Persona pm) {
		this.pm = pm;
	}
	public String getIdpelicula() {
		return idpelicula;
	}
	public void setidpelicula(String idpelicula) {
		this.idpelicula = idpelicula;
	}
	public void leer() {
		ph.leer();
		pm.leer();
		idpelicula=Leer.dato();
	}
	public void mostrar() {
		ph.mostrar();
		pm.mostrar();
		System.out.println(idpelicula);
	}

}
