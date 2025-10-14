package Section_03;

public class Ch21_to_24_Primitive_Types {
	
	public static void main(String[] args) {
		
		byte b = 111; short s = 222; int i = 123123123;
		
		long loo = (long)(50000L+10L*(b+s+i)); 
				
		System.out.println("Valoarea variabilei long are valoarea: " + loo);
		
		int wq=123123123;
		byte bq = (byte)wq;
	
		System.out.println(bq);
	
	
		int a=5; int b3=5/2;
		
		System.out.println(b);
		
		float pound=23.44F; float kg = (pound*0.45F);
		
		System.out.println(kg);
	char c = 'r', w = '\u0044'; 
		
		System.out.println(w);
	
		char we = 33; System.out.println(we);
		
	}

}
