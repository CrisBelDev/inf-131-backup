package Defensa_2;

public class TIOC {
	private String idRegion, idTIOC,nombre,ubicacion;
	private int superficie,poblacion;
	public TIOC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TIOC(String idRegion, String idTIOC, String nombre, String ubicacion, int superficie, int poblacion) {
		super();
		this.idRegion = idRegion;
		this.idTIOC = idTIOC;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.superficie = superficie;
		this.poblacion = poblacion;
	}
	public String getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(String idRegion) {
		this.idRegion = idRegion;
	}
	public String getIdTIOC() {
		return idTIOC;
	}
	public void setIdTIOC(String idTIOC) {
		this.idTIOC = idTIOC;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public String toString() {
		return "TIOC [idRegion=" + idRegion + ", idTIOC=" + idTIOC + ", nombre=" + nombre + ", ubicacion=" + ubicacion
				+ ", superficie=" + superficie + ", poblacion=" + poblacion + "]";
	}
	public void leer() {
		idRegion=Leer.dato();
		idTIOC=Leer.dato();
		nombre=Leer.dato();
		ubicacion=Leer.dato();
		superficie=Leer.datoInt();
		poblacion=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
