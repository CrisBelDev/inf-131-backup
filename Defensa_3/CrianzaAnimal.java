package Defensa_3;

public class CrianzaAnimal {
	private String idEst, nombre, variedad;
	private int cantidad, edad;
	public CrianzaAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CrianzaAnimal(String idEst, String nombre, String variedad, int cantidad, int edad) {
		super();
		this.idEst = idEst;
		this.nombre = nombre;
		this.variedad = variedad;
		this.cantidad = cantidad;
		this.edad = edad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Animal [idEst=" + idEst + ", nombre=" + nombre + ", variedad=" + variedad + ", cantidad=" + cantidad
				+ ", edad=" + edad + "]";
	}
	public void leer() {
		idEst=Leer.dato();
		nombre=Leer.dato();
		variedad=Leer.dato();
		cantidad=Leer.datoInt();
		edad=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
