package Section_06;

public class Ch62_Looping {
	
	public static void main(String[] args) {
		
		for (int counter=1; counter<=5; counter ++) {
			System.out.println(counter);
		}
		
	
		for (double rata=2; rata<5; rata++) {
			double dobanda=calculeazaDobanda(10000, rata);
		
		System.out.println("10000 de Euro la dobanda de "  + rata +  "% inseamna = " + dobanda + " de Euro");
		}
		
		for (double rataB=7.5; rataB<=10; rataB+=0.25) {
			double dobandaB=calculeazaDobanda(10000,rataB);
			System.out.println("10000 de Euro la dobanda de "  + rataB +  "% inseamna = " + dobandaB + " de Euro");
		}

	    }
		public static double calculeazaDobanda(double suma, double rataDobanzii) {
			
			return (suma*(rataDobanzii/100));			
		}
		

}
