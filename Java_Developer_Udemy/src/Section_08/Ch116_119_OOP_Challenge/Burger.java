package Section_08.Ch116_119_OOP_Challenge;

public class Burger extends Item{

	private Item extra1, extra2, extra3;

	public Burger(String nume, double pret) {
		super("Burger", nume, pret);
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return super.getNume() + " Burger";
	}

	@Override
	public double getPretAjustat() {
		// TODO Auto-generated method stub
		return super.getPretDeBaza() + 
				((extra1==null) ? 0  : extra1.getPretAjustat()) +
				((extra2==null) ? 0 : extra2.getPretAjustat()) + 
				((extra3==null) ? 0 : extra3.getPretAjustat());
	}
	
	public double getPretExtra(String numeTopping) {
			return switch (numeTopping) {
				case "Cartofi","Branza" -> 15;
				case "Sunca","Salam","Pui" -> 25;
				default -> 0.0;
			};
	}
	
	public void adaugaTopping(String extra1, String extra2, String extra3) {
		this.extra1 = new Item("Topping",extra1, getPretExtra(extra1));
		this.extra2 = new Item("Topping",extra2, getPretExtra(extra2));
		this.extra3 = new Item("Topping",extra3, getPretExtra(extra3));
	}
	
	public void printListaItems() {
		printItem("Burger de baza", getPretDeBaza());
		if(extra1!=null) {
			extra1.printItem();
		}
		if(extra2!=null) {
			extra2.printItem();
		}
		if(extra3!=null) {
			extra3.printItem();
		}
	}

	@Override
	public void printItem() {
		// TODO Auto-generated method stub
		printListaItems();
		System.out.println("-".repeat(33));
		super.printItem();
	}
	
	
}
