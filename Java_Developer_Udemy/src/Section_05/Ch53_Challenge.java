package Section_05;

public class Ch53_Challenge {
	
	public static void main(String[] args) {
		
		double val1 =	convertToCm(11);
		System.out.println("Height in cm is = " + val1);
		
		double val2 = convertToCm(123,11);
		System.out.println("Height in cm is = " + val2);
	}
		
	public static double convertToCm(int heightInch) {
		
		double cm = heightInch*2.54;
		
		return cm;
	}

	public static double convertToCm(int heightFeet, int remHeightInch) {
		
		int inch = heightFeet*12 + remHeightInch;
		double cm = inch * 2.54; 
		
		return cm;
	}
	
}
