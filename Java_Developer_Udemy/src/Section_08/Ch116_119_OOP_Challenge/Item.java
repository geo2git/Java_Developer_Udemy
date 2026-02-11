package Section_08.Ch116_119_OOP_Challenge;

public class Item {

	private String tip;
	private String nume;
	private double pret;
	private String marime="medie";
	
	public Item(String tip, String nume, double pret) {
		super();
		this.tip = tip;
		this.nume = nume;
		this.pret = pret;
	}

	public double getPretDeBaza() {
		return pret;
	}

	public String getNume() {
		if(tip.equals("Garnitura") || tip.equals("Bautura")) {
			return marime + " " + nume;
		} return nume;
	}
	
	public double getPretAjustat() {
		return switch (marime) {
			case "mica" -> getPretDeBaza()-10;
		//	case "medie" -> getPretDeBaza();
			case "mare" -> getPretDeBaza()+10;
			default -> getPretDeBaza();
		};
	}
	
	public void setMarime(String marime) {
		this.marime=marime;
	}
	
	public static void printItem(String nume, double pret) {
		System.out.printf("%20s:%6.2f%n",nume,pret);
	}
	
	public void printItem() {
		printItem(getNume(), getPretAjustat());
		
	}
}
