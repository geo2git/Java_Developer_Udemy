package Section_07;

public class Ch82_Account_Main {

	public static void main(String[] args) {
		
		Ch82_Account geo1 = new Ch82_Account();
		
		geo1.redrawFunds(100);
		geo1.depositFunds(111);
		geo1.getAccountBalance();
		geo1.redrawFunds(22);
		
		Ch82_Account geo2 = new Ch82_Account();
		
		geo2.setAccountNo("ge123");
		geo2.setAccountBalance(222);
		geo2.setCustomerName("Geo");
		
		geo2.getAccountNo();
	}
}
