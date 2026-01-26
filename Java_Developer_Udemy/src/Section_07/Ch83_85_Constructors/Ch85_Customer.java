package Section_07.Ch83_85_Constructors;

public class Ch85_Customer {

	private String name;
	private int creditLimit;
	private String emailAddress;
	
	public String getName() {
		return name;
	}
	
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public Ch85_Customer(String name, int creditLimit, String emailAddress) {
		this.name=name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAddress;
		System.out.println("A fost apelat constructorul cu toti parametrii !!");
	}
	
	public Ch85_Customer() {
		System.out.println("A fost apelat constructorul default !");
	}
	
	public Ch85_Customer(String name, String customerEmail) {
		this(name, 1111,customerEmail);
		System.out.println("Ai apelat constructorul cu 2 parametrii !");
	}
	
}
