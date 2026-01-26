package Section_07.Ch80_82_Getters_and_Setters;

public class Ch82_Account {

	private String accountNo;
	private double accountBalance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
	public Ch82_Account() {
		System.out.println("Constructorul gol a fost apelat !");
	}

	public Ch82_Account(String accountNo, double accountBalance, String customerName, String customerEmail, String customerPhone) {
		System.out.println("Constructorul cu parametrii a fost apelat !");
		this.accountBalance=accountBalance;
		this.accountNo=accountNo;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerPhone=customerPhone;
	}
	
	public Ch82_Account( String customerName, String customerEmail, String customerPhone) {
		this("geo20", 2000, customerName, customerEmail, customerPhone);
		System.out.println("Constructorul 2 cu parametrii a fost apelat !");
		
	}
	
	
	public void depositFunds(double sumaDepozitata) {
		accountBalance += sumaDepozitata;
		System.out.println("Depoziteaza suma de: " + sumaDepozitata + " iar noua balanta este: " + accountBalance);
	}
	
	public void redrawFunds(double sumaRetrasa) {
		if(accountBalance-sumaRetrasa<0) {
			System.out.println("Fonduri insuficiente ! In cont aveti doar suma de: " + accountBalance + " EURO");
		} else {
			accountBalance-=sumaRetrasa;
			System.out.println("Retragerea sumei de: " + sumaRetrasa + " EURO s-a facut cu succes, iar suma ramasa este de: " + accountBalance + " EURO");
		}
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
}
