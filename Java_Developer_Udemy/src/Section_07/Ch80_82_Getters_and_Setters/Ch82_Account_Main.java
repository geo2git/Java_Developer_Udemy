package Section_07.Ch80_82_Getters_and_Setters;

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
		
		Ch82_Account a1 = new Ch82_Account("geo11",  2222, "Geo E", "geo@yh.ro", "0722");
		
		System.out.println(a1.getAccountNo());
		System.out.println(a1.getAccountBalance());
		
		Ch82_Account a2 = new Ch82_Account("Emigeo", "fdsafds@sdfd.er", "321432");
		
		System.out.println(a2.getAccountNo());
		System.out.println(a2.getAccountBalance());
		System.out.println(a2.getCustomerName());
		
	}
}
