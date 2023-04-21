package Defensa_1;

public class Ecorregion {
	private String idAreaP, nombre;

	public Ecorregion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ecorregion(String idAreaP, String nombre) {
		super();
		this.idAreaP = idAreaP;
		this.nombre = nombre;
	}
	public String getIdAreaP() {
		return idAreaP;
	}
	public void setIdAreaP(String idAreaP) {
		this.idAreaP = idAreaP;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Ecorregion [idAreaP=" + idAreaP + ", nombre=" + nombre + "]";
	}
	public void leer() {
		idAreaP=Leer.dato();
		nombre=Leer.dato();
	}
}
