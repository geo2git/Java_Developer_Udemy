package Section_07.Ch91_93_Inheritance;

public class Caini extends Animale {

	private String nume;
	private String rasa;
	private String culoare;
	private String greutate;
	
	public Caini(String nume, String rasa, String culoare, String greutate) {
		super();
		this.nume = nume;
		this.rasa = rasa;
		this.culoare = culoare;
		this.greutate = greutate;
	}

	@Override
	public String toString() {
		return "Caini [nume=" + nume + ", rasa=" + rasa + ", culoare=" + culoare
				+ ", greutate=" + greutate + "]";
	}
	
	public void ceFacCainii(String nume) {
		System.out.println(nume + " latra !");
	}
	
}
