package Section_07;

public class Ch82_Account {

	private String accountNo;
	private double accountBalance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
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
