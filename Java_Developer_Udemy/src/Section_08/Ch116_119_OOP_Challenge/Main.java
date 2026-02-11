package Section_08.Ch116_119_OOP_Challenge;

public class Main {
	
	public static void main(String[] args) {
		
		Item cola = new Item("Bautura", "Coca Cola", 15);
		cola.printItem();
		cola.setMarime("mica");
		cola.printItem();
		
		
		Item cartofi = new Item("Garnitura", "Cartofi Prajiti",20);
		cartofi.printItem();
		cartofi.setMarime("mica");
		cartofi.printItem();
		
		Item burgerVivo = new Item("Burger", "Burger Vivo",55);
		burgerVivo.printItem();
		burgerVivo.setMarime("mare");
		burgerVivo.printItem();
		
		Burger burger = new Burger("normal", 35);
		burger.printItem();
		burger.adaugaTopping("Cartofi", "Sunca", "Pui");
		burger.printItem();

		Meniu m = new Meniu();
		m.printListaItems();
	}

}
