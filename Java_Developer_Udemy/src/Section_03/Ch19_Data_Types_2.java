package Section_03;

public class Ch19_Data_Types_2 {

	public static void main(String[] args) {
		
		byte b_min=Byte.MIN_VALUE; 
		byte b_max=Byte.MAX_VALUE;
		System.out.println("Intervalul pt Byte este: " + " < " + b_min + " , " + b_max + " > " );
		
		long l_min=Long.MIN_VALUE; 
		long l_max=Long.MAX_VALUE;
		System.out.println("Intervalul pt Long este: " + " < " + l_min + " , " + l_max + " > " );
		
		short s_min=Short.MIN_VALUE; 
		short s_max=Short.MAX_VALUE;
		System.out.println("Intervalul pt Short este: " + " < " + s_min + " , " + s_max + " > " );
		
		
		double d_min=Double.MIN_VALUE; 
		double d_max=Double.MAX_VALUE;
		System.out.println("Intervalul pt Double este: " + " < " + d_min + " , " + d_max + " > " );
		
		float f_min=Float.MIN_VALUE; 
		float f_max=Float.MAX_VALUE;
		System.out.println("Intervalul pt Float este: " + " < " + f_min + " , " + f_max + " > " );
		
		if(d_max>f_max) {
			System.out.println("Double este mai mare ca Float");
		} else {
			System.out.println("Double NU este mai mare ca Float");
		}
		
		if(d_max>l_max) {
			System.out.println("Double este mai mare ca Long");
		} else {
			System.out.println("Double NU este mai mare ca long");
		}
		
		if(l_max>f_max) {
			System.out.println("Long este mai mare ca Float");
		} else {
			System.out.println("Long NU este mai mare ca Float");
		}
		
		byte b_size=Byte.SIZE; 
		System.out.println("Marimea lui Byte este: " + b_size + " digiti");
		
		short s_size=Short.SIZE; 
		System.out.println("Marimea lui Short este: " + s_size + " digiti");
		
		float f_size=Float.SIZE; 
		System.out.println("Marimea lui Float este: " + f_size + " digiti");
		
		long l_size=Long.SIZE;		
		System.out.println("Marimea lui Long este: " + l_size + " digiti");
		
		double d_size=Double.SIZE; 
		System.out.println("Marimea lui Double este: " + d_size + " digiti");
		
	}
}
