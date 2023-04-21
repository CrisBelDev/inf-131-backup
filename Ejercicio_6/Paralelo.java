package Ejercicio_6;

public class Paralelo {
	private String paralelo,codM;
	private int ci,nrocoupos;
	public Paralelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paralelo(String paralelo, String codM, int ci, int nrocoupos) {
		super();
		this.paralelo = paralelo;
		this.codM = codM;
		this.ci = ci;
		this.nrocoupos = nrocoupos;
	}
	public String getParalelo() {
		return paralelo;
	}
	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}
	public String getCodM() {
		return codM;
	}
	public void setCodM(String codM) {
		this.codM = codM;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getNrocoupos() {
		return nrocoupos;
	}
	public void setNrocoupos(int nrocoupos) {
		this.nrocoupos = nrocoupos;
	}
	@Override
	public String toString() {
		return "Paralelo [paralelo=" + paralelo + ", codM=" + codM + ", ci=" + ci + ", nrocoupos=" + nrocoupos + "]";
	}
	public void leer() {
		paralelo=Leer.dato();
		codM=Leer.dato();
		ci=Leer.datoInt();
		nrocoupos=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
