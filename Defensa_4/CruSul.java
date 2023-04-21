package Defensa_4;

public class CruSul {
	private String idCruSul,nombre,provincia;
	private int telefono;
	public CruSul() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CruSul(String idCruSul, String nombre, String provincia, int telefono) {
		super();
		this.idCruSul = idCruSul;
		this.nombre = nombre;
		this.provincia = provincia;
		this.telefono = telefono;
	}
	public String getIdCruSul() {
		return idCruSul;
	}
	public void setIdCruSul(String idCruSul) {
		this.idCruSul = idCruSul;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void leer() {
		idCruSul=Leer.dato();
		nombre=Leer.dato();
		provincia=Leer.dato();
		telefono=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "CRUSUL [idCruSul=" + idCruSul + ", nombre=" + nombre + ", provincia=" + provincia + ", telefono="
				+ telefono + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
