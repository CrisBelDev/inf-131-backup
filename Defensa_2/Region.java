package Defensa_2;

public class Region {
	private String idRegion,nombre;
	private int departamentos;
	public Region() {
		super();
	}
	public Region(String idRegion, String nombre, int departamentos) {
		super();
		this.idRegion = idRegion;
		this.nombre = nombre;
		this.departamentos = departamentos;
	}
	public String getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(String idRegion) {
		this.idRegion = idRegion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(int departamentos) {
		this.departamentos = departamentos;
	}
	public void leer() {
		idRegion=Leer.dato();
		nombre=Leer.dato();
		departamentos=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Region [idRegion=" + idRegion + ", nombre=" + nombre + ", departamentos=" + departamentos + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	

}
