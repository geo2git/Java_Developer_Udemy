package CE_17;

public class FirstLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		
		if(number<=0) {
			return -1;
		} else  {
			int primaCifra=number; 
			int ultimaCifra=number%10;
			//int inversat=0;
			//int original=number;
						
			while(primaCifra>=10) {
				
				primaCifra/=10;
				
			} 
			int suma = primaCifra+ultimaCifra;
				 return suma;	
				 //return primaCifra;
		}
	}
}
