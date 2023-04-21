package Ejercicio_5;
public class Carta {
	private String fecha,asunto,contenido;
	private int ci;
	
	public Carta() {
		super();
	}
	public Carta(String fecha, String asunto, String contenido, int ci) {
		super();
		this.fecha = fecha;
		this.asunto = asunto;
		this.contenido = contenido;
		this.ci = ci;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", asunto=" + asunto + ", contenido=" + contenido + ", ci=" + ci + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer(){
		fecha=Leer.dato();
		ci=Leer.datoInt();
		asunto=Leer.dato();
		contenido=Leer.dato();
	}
}
