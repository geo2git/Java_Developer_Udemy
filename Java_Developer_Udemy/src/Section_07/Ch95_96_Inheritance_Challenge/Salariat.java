package Section_07.Ch95_96_Inheritance_Challenge;

public class Salariat extends Angajat {

	private int salariuAnual;
	private boolean estePensionat;
	
	public Salariat(String nume, String anulNasterii,
			String anulAngajarii, int salariuAnual) {
		super(nume, anulNasterii, anulAngajarii);
		this.salariuAnual = salariuAnual;
	//	this.estePensionat = estePensionat;
	}
	
	@Override
	
	public int colecteazaPlata() {
		return (int) salariuAnual/12;
	}

	@Override
	public String toString() {
		return "Salariat [salariuAnual=" + salariuAnual + ", estePensionat="
				+ estePensionat + "]";
	}
	
	
}
