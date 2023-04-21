package Ejercicio_6;

import Ejercicio_3.Leer;

public class Materia {
	private String codM,materia,sigla;
	private int semestre;

	
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Materia(String codM, String materia, String sigla, int semestre) {
		super();
		this.codM = codM;
		this.materia = materia;
		this.sigla = sigla;
		this.semestre = semestre;
	}
	public String getCodM() {
		return codM;
	}
	public void setCodM(String codM) {
		this.codM = codM;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "Materia [codM=" + codM + ", materia=" + materia + ", sigla=" + sigla + ", semestre=" + semestre + "]";
	}
	public void leer() {
		materia=Leer.dato();
		sigla=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
