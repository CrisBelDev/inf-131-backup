package Defensa_2;
public class ActividadA {
	private String idTIOC,nomActividad;
	private int produccion,superficie;
	public ActividadA(String idTIOC, String nomActividad, int produccion, int superficie) {
		super();
		this.idTIOC = idTIOC;
		this.nomActividad = nomActividad;
		this.produccion = produccion;
		this.superficie = superficie;
	}
	public ActividadA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdTIOC() {
		return idTIOC;
	}
	public void setIdTIOC(String idTIOC) {
		this.idTIOC = idTIOC;
	}
	public String getNomActividad() {
		return nomActividad;
	}
	public void setNomActividad(String nomActividad) {
		this.nomActividad = nomActividad;
	}
	public int getProduccion() {
		return produccion;
	}
	public void setProduccion(int produccion) {
		this.produccion = produccion;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	@Override
	public String toString() {
		return "ActividadA [idTIOC=" + idTIOC + ", nomActividad=" + nomActividad + ", produccion=" + produccion
				+ ", superficie=" + superficie + "]";
	}
	public void leer() {
		idTIOC=Leer.dato();
		nomActividad=Leer.dato();
		produccion=Leer.datoInt();
		superficie=Leer.datoInt();
	}
	public void mostrar() {
		System.err.println(toString());
	}
}
