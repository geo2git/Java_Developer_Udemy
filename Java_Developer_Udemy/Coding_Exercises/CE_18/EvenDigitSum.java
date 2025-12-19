package CE_18;

public class EvenDigitSum {

	public static int getEvenDigitSum(int number) {
				
			if(number<=0) {
				return -1;
			} 
				
				int suma=0;
							
				while(number>0) {
					
					int ultimaCifra=number%10;
					if(ultimaCifra%2==0) {
					suma+=ultimaCifra;
					}
					
					number/=10;
				} 
					 return suma;	
					 
			
	}
	
}
