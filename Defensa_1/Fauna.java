package Defensa_1;

public class Fauna {
	private String idAreaP, nombreComun, clasetipo, descripcion;

	public Fauna() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fauna(String idAreaP, String nombreComun, String clasetipo, String descripcion) {
		super();
		this.idAreaP = idAreaP;
		this.nombreComun = nombreComun;
		this.clasetipo = clasetipo;
		this.descripcion = descripcion;
	}
	public String getIdAreaP() {
		return idAreaP;
	}
	public void setIdAreaP(String idAreaP) {
		this.idAreaP = idAreaP;
	}
	public String getNombreComun() {
		return nombreComun;
	}
	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	public String getClasetipo() {
		return clasetipo;
	}
	public void setClasetipo(String clasetipo) {
		this.clasetipo = clasetipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Fauna [idAreaP=" + idAreaP + ", nombreComun=" + nombreComun + ", clasetipo=" + clasetipo
				+ ", descripcion=" + descripcion + "]";
	}
	public void leer() {
		idAreaP=Leer.dato();
		nombreComun=Leer.dato();
		clasetipo=Leer.dato();
		descripcion=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
