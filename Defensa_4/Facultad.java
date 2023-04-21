package Defensa_4;

public class Facultad {
	private String idFacultad,nombre,direccion;
	private int telefono;
	public Facultad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facultad(String idFacultad, String nombre, String direccion, int telefono) {
		super();
		this.idFacultad = idFacultad;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public String getIdFacultad() {
		return idFacultad;
	}
	public void setIdFacultad(String idFacultad) {
		this.idFacultad = idFacultad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void leer() {
		idFacultad=Leer.dato();
		nombre=Leer.dato();
		direccion=Leer.dato();
		telefono=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Facultad [idFacultad=" + idFacultad + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
