package Ejercicio_4;

public class Mascota {
	private String nombre,tipo;
	private int edad;
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mascota(String nombre, String tipo, int edad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void leer() {
		nombre=Leer.dato();
		tipo=Leer.dato();
		edad=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
