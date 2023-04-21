package Ejercicio_5;
public class Cliente {
	private int ci;
	private String nom,pat,mat;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int ci, String nom, String pat, String mat) {
		super();
		this.ci = ci;
		this.nom = nom;
		this.pat = pat;
		this.mat = mat;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Persona [ci=" + ci + ", nom=" + nom + ", pat=" + pat + ", mat=" + mat + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer() {
		ci=Leer.datoInt();
		nom=Leer.dato();
		pat=Leer.dato();
		mat=Leer.dato();
	}
}
