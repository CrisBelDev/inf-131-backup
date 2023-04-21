package Ejercicio_9;
public class Practica {
	private int ci,nota,nroP;

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getNroP() {
		return nroP;
	}

	public void setNroP(int nroP) {
		this.nroP = nroP;
	}
	void leer() {
		ci=Leer.datoInt();
		nota=Leer.datoInt();
		nroP=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Practica [ci=" + ci + ", nota=" + nota + ", nroP=" + nroP + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
}
