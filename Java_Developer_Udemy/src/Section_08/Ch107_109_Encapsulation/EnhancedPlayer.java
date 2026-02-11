package Section_08.Ch107_109_Encapsulation;

public class EnhancedPlayer {

	private String fullName;
	private int healthPercentage;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		this.fullName = name;
		if(health<=0) {
			this.healthPercentage=1;
		} else if (health>100) {
				this.healthPercentage = 100;
		} else {
				this.healthPercentage=health;
		}
		this.weapon = weapon;
		}
	
	public EnhancedPlayer(String name) {
		this(name, 100,"sabie");
	}
	
public void loseHealth(int damage) {
		
		healthPercentage=healthPercentage-damage;
		if(healthPercentage<=0) {
			System.out.println("Playerul a fost scos din joc !");
		}
	}
	
	public int healthRemaining() {
		return healthPercentage;
	}
	
	public void restoreHealth(int extraHealth) {
		
		healthPercentage=healthPercentage+extraHealth;
		if(healthPercentage>100) {
			System.out.println("Jucatorul are sanatatea restaurata !");
			healthPercentage=100;
		}
		
	}
}
