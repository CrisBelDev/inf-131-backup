package Defensa_3;

import Ejercicio_6.Leer;

public class EstExperimental {
	private String idEst, nombre, direccion;

	public EstExperimental() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstExperimental(String idEst, String nombre, String direccion) {
		super();
		this.idEst = idEst;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getIdEst() {
		return idEst;
	}
	public void setIdEst(String idEst) {
		this.idEst = idEst;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "EstExperimental [idEst=" + idEst + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	public void leer() {
		idEst=Leer.dato();
		nombre=Leer.dato();
		direccion=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
