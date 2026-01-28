package Section_07.Ch95_96_Inheritance_Challenge;

public class Muncitor {

	private String nume;
	private String anulNasterii;
	protected String dataPlecarii;
	
	public Muncitor() {
		
	}
	public Muncitor(String nume, String anulNasterii) {
		 this.nume=nume;
		 this.anulNasterii=anulNasterii;
	}
	
	public int getVarsta() {
		int anNastere=Integer.parseInt(anulNasterii);
		int varsta=2026-anNastere;
		return varsta;
	}
	
	public int colecteazaPlata() {
		return 0;
	}
	
	public void terminare(String termina) {
		this.dataPlecarii=dataPlecarii;
	}
	@Override
	public String toString() {
		return "Muncitor [nume=" + nume + ", anulNasterii=" + anulNasterii
				+ ", dataPlecarii=" + dataPlecarii + "]";
	}
	
	
}
