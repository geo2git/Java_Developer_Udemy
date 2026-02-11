package Section_08.Ch107_109_Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Player p = new Player();
		
		p.name="Geo";
		p.health=33;
		p.weapon="Carja";
		
		int damage=11;
		p.loseHealth(damage);
		
		System.out.println("Playerul mai are sanatate de= " + p.healthRemaining());
		
		p.health=201;
		p.loseHealth(11);
		System.out.println("Playerul mai are sanatate de= " + p.healthRemaining());
		
		EnhancedPlayer p1 = new EnhancedPlayer("Geo2",222,"pistol");
		System.out.println("Sanatatea initiala este= " + p1.healthRemaining());
		
		Printer pr = new Printer(44,false);
		System.out.println("Nr de pagini initial este=" + pr.getPagesPrinted());
	}
}
