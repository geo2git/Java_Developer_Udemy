package CE_22;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int first, int second) {
		
		if(first<10 || second<10) {
			return -1;
		} 
		while (second!=0) {
			int div=first%second;
			first=second;
			second=div;
			
			}
		return first;
			
		}
	}

