package Defensa_1;

public class AreaProtegida {
	private String IdAreaP, Categoría, nombre, ubicación, fechaCreacion;
	private int superficie;
	public AreaProtegida() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AreaProtegida(String idAreaP, String categoría, String nombre, String ubicación, String fechaCreacion,
			int superficie) {
		super();
		IdAreaP = idAreaP;
		Categoría = categoría;
		this.nombre = nombre;
		this.ubicación = ubicación;
		this.fechaCreacion = fechaCreacion;
		this.superficie = superficie;
	}
	public String getIdAreaP() {
		return IdAreaP;
	}
	public void setIdAreaP(String idAreaP) {
		IdAreaP = idAreaP;
	}
	public String getCategoría() {
		return Categoría;
	}
	public void setCategoría(String categoría) {
		Categoría = categoría;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicación() {
		return ubicación;
	}
	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	@Override
	public String toString() {
		return "AreaProtegida [IdAreaP=" + IdAreaP + ", Categoría=" + Categoría + ", nombre=" + nombre + ", ubicación="
				+ ubicación + ", fechaCreacion=" + fechaCreacion + ", superficie=" + superficie + "]";
	}
	public void leer() {
		IdAreaP=Leer.dato();
		Categoría=Leer.dato();
		nombre=Leer.dato();
		ubicación=Leer.dato();
		fechaCreacion=Leer.dato();
		superficie=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
