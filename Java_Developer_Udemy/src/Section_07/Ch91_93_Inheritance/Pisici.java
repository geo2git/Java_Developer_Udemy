package Section_07.Ch91_93_Inheritance;

public class Pisici extends Animale {

	private String nume;
	private String rasa;
	private String culoare;
	private String greutate;
	
	public Pisici(String nume, String rasa, String culoare, String greutate) {
		super();
		this.nume = nume;
		this.rasa = rasa;
		this.culoare = culoare;
		this.greutate = greutate;
	}
	
	public Pisici(String specie, String denumire, String habitat, String nume, String rasa, String culoare, String greutate) {
	//	super(specie, denumire, habitat);
		this.nume=nume;
		this.rasa=rasa;
		this.culoare=culoare;
		this.greutate=greutate;
	}
	
	@Override
	
	public String toString() {
		return "Pisici [nume= " + nume +", rasa=" + rasa +", culoare=" + culoare + ", greutate=" + greutate + "]";
	}
	
	
	public void ceFacPisicile(String nume) {
		System.out.println(nume + " miauna si mananca !");
	}
}
