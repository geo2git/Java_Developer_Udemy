package Section_07.Ch91_93_Inheritance;

public class Animale {

	private String specie;
	private String denumire;
	private String tipLocomotie;
	private String tipHrana;
	private String habitat;
	
	public Animale() {
		
	}

	public Animale(String specie, String denumire, String tipLocomotie,
			String tipHrana, String habitat) {
		super();
		this.specie = specie;
		this.denumire = denumire;
		this.tipLocomotie = tipLocomotie;
		this.tipHrana = tipHrana;
		this.habitat = habitat;
	}
	
	public Animale(String specie, String denumire, String habitat) {
		super();
		this.specie=specie;
		this.denumire=denumire;
		this.habitat=habitat;
	}

	@Override
	public String toString() {
		return "Animale [specie=" + specie + ", denumire=" + denumire
				+ ", tipLocomotie=" + tipLocomotie + ", tipHrana=" + tipHrana
				+ ", habitat=" + habitat + "]";
	}
	
	
	
}
