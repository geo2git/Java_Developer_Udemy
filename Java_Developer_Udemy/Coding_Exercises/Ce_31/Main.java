package Ce_31;

public class Main {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setFirstName("Geo");
		p1.setLastName("");
		p1.setAge(45);
		
		System.out.println("Prenumele este: " + p1.getFirstName() + 
				" si numele este: " + p1.getLastName());
		System.out.println("Numele complet este: " + p1.getFullName());
		System.out.println("Varsta este: " + p1.getAge() + " si este adolescent ? " + p1.isTeen());
		
		
	}

}
