package Section_04;

public class Ch_35_Ternary_Operator {

	public static void main(String[] args) {
			
		String makeOfCar="Dacia";
		String masina = ((makeOfCar=="Dacia") ? "Logan" : "Nu este o marca Dacia");
		System.out.println(masina);
		
		
		double var1=20.0, var2=80.0;
		
		double res=(var1+var2)*100.00; double rem=res%44;
		
		System.out.println("res este: " + res + " iar rem este: " + rem);
		boolean b = rem==0 ? true : false;
		
		System.out.println(b);
		
		if (b!=true) {
			System.out.println("Avem ceva rest: " + rem);
		}
	}
}
