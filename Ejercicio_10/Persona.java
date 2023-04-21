package Ejercicio_10;

public class Persona {
	private String nombre;
	private int edad,ci;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, int edad, int ci) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", ci=" + ci + "]";
	}
	public void leer() {
		nombre=Leer.dato();
		edad=Leer.datoInt();
		ci=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
