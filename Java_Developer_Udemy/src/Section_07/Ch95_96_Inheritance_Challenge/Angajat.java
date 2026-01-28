package Section_07.Ch95_96_Inheritance_Challenge;

public class Angajat extends Muncitor {

	private int idAngajat;
	private String anulAngajarii;
	private static int nrAngajat=1;
	
	public Angajat(String nume, String anulNasterii, String anulAngajarii) {
		super(nume, anulNasterii);
		this.idAngajat = Angajat.nrAngajat++;
		this.anulAngajarii = anulAngajarii;
	}


	@Override
	public String toString() {
		return "Angajat [idAngajat=" + idAngajat + ", anulAngajarii="
				+ anulAngajarii + "]";
	}
	
	
	
}
