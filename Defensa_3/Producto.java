package Defensa_3;

import Ejercicio_6.Leer;

public class Producto {
	private String idEst, fecha, producto, tipo, variedad;
	private int cantidad;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String idEst, String fecha, String producto, String tipo, String variedad, int cantidad) {
		super();
		this.idEst = idEst;
		this.fecha = fecha;
		this.producto = producto;
		this.tipo = tipo;
		this.variedad = variedad;
		this.cantidad = cantidad;
	}
	public String getIdEst() {
		return idEst;
	}
	public void setIdEst(String idEst) {
		this.idEst = idEst;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getVariedad() {
		return variedad;
	}
	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [idEst=" + idEst + ", fecha=" + fecha + ", producto=" + producto + ", tipo=" + tipo
				+ ", variedad=" + variedad + ", cantidad=" + cantidad + "]";
	}
	public void leer() {
		idEst=Leer.dato();
		fecha=Leer.dato();
		producto=Leer.dato();
		variedad=Leer.dato();
		cantidad=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
