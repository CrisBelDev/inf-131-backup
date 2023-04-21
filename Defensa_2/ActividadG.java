package Defensa_2;

public class ActividadG {
	private String idTIOC, nomGanado;
	private int numCabezas;
	public ActividadG() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActividadG(String idTIOC, String nomGanado, int numCabezas) {
		super();
		this.idTIOC = idTIOC;
		this.nomGanado = nomGanado;
		this.numCabezas = numCabezas;
	}
	@Override
	public String toString() {
		return "ActividadG [idTIOC=" + idTIOC + ", nomGanado=" + nomGanado + ", numCabezas=" + numCabezas + "]";
	}
	public String getIdTIOC() {
		return idTIOC;
	}
	public void setIdTIOC(String idTIOC) {
		this.idTIOC = idTIOC;
	}
	public String getNomGanado() {
		return nomGanado;
	}
	public void setNomGanado(String nomGanado) {
		this.nomGanado = nomGanado;
	}
	public int getNumCabezas() {
		return numCabezas;
	}
	public void setNumCabezas(int numCabezas) {
		this.numCabezas = numCabezas;
	}
	public void leer() {
		idTIOC=Leer.dato();
		nomGanado=Leer.dato();
		numCabezas=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
