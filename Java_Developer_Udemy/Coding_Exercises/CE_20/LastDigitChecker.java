package CE_20;

public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int a, int b, int c) {
		
		int ultimaCifraA=a%10;
		int ultimaCifraB=b%10;
		int ultimaCifraC=c%10;
		
		if(a<10 || a>1000 || b<10 || b>1000 || c<10 || c>1000) {
			return false;
		} else if(ultimaCifraA==ultimaCifraB || ultimaCifraA==ultimaCifraC || ultimaCifraB==ultimaCifraC) {
			return true;
		}
		
		return false;
		
	}

	public static boolean isValid(int x) {
		
		if(x<10 || x>1000) {
			return false;
		}
		
		return true;
	}
	
	
}
