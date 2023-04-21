package Ejercicio_6;

public class Estudiante {
	private String nombre;
	private int ci;
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estudiante(String nombre, int ci) {
		super();
		this.nombre = nombre;
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", ci=" + ci + "]";
	}
	public void leer() {
		nombre=Leer.dato();
		ci=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
