package Section_08.Ch116_119_OOP_Challenge;

public class Meniu {

	private Burger burger;
	private Item bautura;
	private Item garnitura;
	
	public Meniu() {
		this("normal", "pepsi","cartofi prajiti");
	}
	
	public Meniu(String tipBurger, String tipBautura, String tipGarnitura) {
		super();
		this.burger = new Burger(tipBurger,44);
		this.bautura = new Item("bautura",tipBautura,11);
		this.garnitura = new Item("garnitura",tipGarnitura,22);
	}
	
	public double getPretAjustat() {
		return garnitura.getPretAjustat() + bautura.getPretAjustat() + burger.getPretAjustat();
	}
	
	public void printListaItems() {
		burger.printItem();
		bautura.printItem();
		garnitura.printItem();
		System.out.println("-".repeat(33));
		Item.printItem("Pret total ", getPretAjustat());
	}
}
