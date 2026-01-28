package Section_07.Ch91_93_Inheritance;

public class Gaini extends Animale {

	private String nume;
	private String rasa;
	private String culoare;
	private String greutate;
	
	public Gaini(String nume, String rasa, String culoare, String greutate) {
		super();
		this.nume = nume;
		this.rasa = rasa;
		this.culoare = culoare;
		this.greutate = greutate;
	}
	
	@Override
	
	public String toString() {
		return "Gaini [nume=" + nume + ", rasa=" + rasa + ", culoare=" + culoare + ", greutat=e" + greutate + "]";   
	}
	
	public void ceFacGainile(String cefac) {
		System.out.println("Gainile codcodacesc !");
	}
}

