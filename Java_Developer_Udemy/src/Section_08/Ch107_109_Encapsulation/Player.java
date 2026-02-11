package Section_08.Ch107_109_Encapsulation;

public class Player {

	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		
		health=health-damage;
		if(health<=0) {
			System.out.println("Playerul a fost scos din joc !");
		}
	}
	
	public int healthRemaining() {
		return health;
	}
	
	public void restoreHealth(int extraHealth) {
		
		health=health+extraHealth;
		if(health>100) {
			System.out.println("Jucatorul are sanatatea restaurata !");
			health=100;
		}
		
		
	}
}
