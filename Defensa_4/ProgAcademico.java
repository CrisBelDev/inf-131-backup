package Defensa_4;

public class ProgAcademico {
	private String idCruSul,idFacultad,nombre,estado,fechaInicio, fechaFinalizacion,nivel;
	private int nroestudiantes;
	public ProgAcademico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProgAcademico(String idCruSul, String idFacultad, String nombre, String estado, String fechaInicio,
			String fechaFinalizacion, String nivel, int nroestudiantes) {
		super();
		this.idCruSul = idCruSul;
		this.idFacultad = idFacultad;
		this.nombre = nombre;
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.nivel = nivel;
		this.nroestudiantes = nroestudiantes;
	}
	public String getIdCruSul() {
		return idCruSul;
	}
	public void setIdCruSul(String idCruSul) {
		this.idCruSul = idCruSul;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getNroestudiantes() {
		return nroestudiantes;
	}
	public void setNroestudiantes(int nroestudiantes) {
		this.nroestudiantes = nroestudiantes;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFinalizacion() {
		return fechaFinalizacion;
	}
	public void setFechaFinalizacion(String fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
	public void leer() {
		idCruSul=Leer.dato();
		idFacultad=Leer.dato();
		nivel=Leer.dato();
		estado=Leer.dato();
		nroestudiantes=Leer.datoInt();
		fechaInicio=Leer.dato();
		fechaFinalizacion=Leer.dato();
	}
	
	@Override
	public String toString() {
		return "ProgAcademico [idCruSul=" + idCruSul + ", idFacultad=" + idFacultad + ", nombre=" + nombre + ", estado="
				+ estado + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", nivel="
				+ nivel + ", nroestudiantes=" + nroestudiantes + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
