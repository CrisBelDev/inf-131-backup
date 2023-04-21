package Ejercicio_9;
public class Estudiante {
	private String nom;
	private int ci;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	@Override
	public String toString() {
		return "Estudiante [nom=" + nom + ", ci=" + ci + "]";
	}
	void leer() {
		nom=Leer.dato();
		ci=Leer.datoInt();
	}
	void mostrar() {
		System.out.println(toString());
	}
}
