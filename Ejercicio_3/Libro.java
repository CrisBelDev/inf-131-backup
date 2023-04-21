package Ejercicio_3;

public class Libro {
	private String nombre, autor;
	private int edicion,aniopublicacion;
	
	public Libro() {
		super();
	}
	public Libro(String nombre, String autor, int edicion, int aniopublicacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.edicion = edicion;
		this.aniopublicacion = aniopublicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public int getAniopublicacion() {
		return aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		this.aniopublicacion = aniopublicacion;
	}
	public void leer() {
		nombre=Leer.dato();
		autor=Leer.dato();
		edicion=Leer.datoInt();
		aniopublicacion=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", edicion=" + edicion + ", aniopublicacion="
				+ aniopublicacion + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	
}
