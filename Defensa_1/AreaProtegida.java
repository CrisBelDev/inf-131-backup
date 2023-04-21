package Defensa_1;

public class AreaProtegida {
	private String IdAreaP, Categor�a, nombre, ubicaci�n, fechaCreacion;
	private int superficie;
	public AreaProtegida() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AreaProtegida(String idAreaP, String categor�a, String nombre, String ubicaci�n, String fechaCreacion,
			int superficie) {
		super();
		IdAreaP = idAreaP;
		Categor�a = categor�a;
		this.nombre = nombre;
		this.ubicaci�n = ubicaci�n;
		this.fechaCreacion = fechaCreacion;
		this.superficie = superficie;
	}
	public String getIdAreaP() {
		return IdAreaP;
	}
	public void setIdAreaP(String idAreaP) {
		IdAreaP = idAreaP;
	}
	public String getCategor�a() {
		return Categor�a;
	}
	public void setCategor�a(String categor�a) {
		Categor�a = categor�a;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicaci�n() {
		return ubicaci�n;
	}
	public void setUbicaci�n(String ubicaci�n) {
		this.ubicaci�n = ubicaci�n;
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
		return "AreaProtegida [IdAreaP=" + IdAreaP + ", Categor�a=" + Categor�a + ", nombre=" + nombre + ", ubicaci�n="
				+ ubicaci�n + ", fechaCreacion=" + fechaCreacion + ", superficie=" + superficie + "]";
	}
	public void leer() {
		IdAreaP=Leer.dato();
		Categor�a=Leer.dato();
		nombre=Leer.dato();
		ubicaci�n=Leer.dato();
		fechaCreacion=Leer.dato();
		superficie=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
