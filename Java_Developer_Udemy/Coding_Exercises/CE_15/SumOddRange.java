package CE_15;

public class SumOddRange {

	public static boolean isOdd(int number) {
		if(number<0) {
			return false;
		} else if (number%2==1){
			return true;
		} else {
			return false;
		}
		
	}
	
	public static int sumOdd(int start, int end) {
		
		if((start<0 || end<0) || end<start) {
			return -1;
		} else {
		//	int count=0;
			int sum=0;
			for(int i=start; i<=end;i++) {
				if(isOdd(i) ) {
			//		count++;
					sum=sum+i;
				}
				
		   }
			
			return sum;
		}
	}
	
}
