package Ejercicio_10;


public class Pelicula {
	private String nombre,idPelicula,hora;
	private int nrosala;
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pelicula(String nombre, String idPelicula, String hora, int nrosala) {
		super();
		this.nombre = nombre;
		this.idPelicula = idPelicula;
		this.hora = hora;
		this.nrosala = nrosala;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(String idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getNrosala() {
		return nrosala;
	}
	public void setNrosala(int nrosala) {
		this.nrosala = nrosala;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", idPelicula=" + idPelicula + ", hora=" + hora + ", nrosala=" + nrosala
				+ "]";
	}
	public void leer() {
		nombre=Leer.dato();
		idPelicula=Leer.dato();
		hora=Leer.dato();
		nrosala=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
