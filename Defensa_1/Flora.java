package Defensa_1;

public class Flora {
	private String idAreaP, nombre, familia, descripcion;

	public Flora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flora(String idAreaP, String nombre, String familia, String descripcion) {
		super();
		this.idAreaP = idAreaP;
		this.nombre = nombre;
		this.familia = familia;
		this.descripcion = descripcion;
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
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Flora [idAreaP=" + idAreaP + ", nombre=" + nombre + ", familia=" + familia + ", descripcion="
				+ descripcion + "]";
	}
	public void leer() {
		idAreaP=Leer.dato();
		nombre=Leer.dato();
		familia=Leer.dato();
		descripcion=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
