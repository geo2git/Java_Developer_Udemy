package Section_06;

public class Ch64_Sum_Challenge {

	 public static void main(String[] args) {
		
		 int count=0;
		 int sum=0;
		 
		 for (int i=1; i<=500;i++) {
			 	
			 	if(i%3==0 &&i%5==0) {
			 		
			 		count++;
			 		sum+=i;
			 		
			 		System.out.println("Nr este: " + i);
									 	
			 		}
			 	if (count==5) {
			 		break;
			 	}
			 	
			 	}
			 	System.out.println("Suma nr in cauza este: " + sum);
		 }
	 }
	

