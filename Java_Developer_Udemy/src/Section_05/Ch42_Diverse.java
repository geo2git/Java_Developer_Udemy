package Section_05;

public class Ch42_Diverse {

	public static void main(String[] args) {
		
		int a =50, b=22, c=44; 
		
		if(a<50) {
			int r1=a+b+c; 
			System.out.println("Valoarea lui r1 este: " + r1);
		}  else {
			int r2=a*b*c;
			System.out.println("Valoarea lui r2 este: " + r2);
		         }
						
						calc(1,2,3);
						salutare("Geo");
						
		
			}
	
	public static void calc(int a, int b, int c) {
		
		int x=11, y=22, z=33; 
		int sum=x+y+z;
		
		if(sum>100) {
		System.out.println("Suma este mai mare de 100: " + sum);
			} else {
				System.out.println("Suma este mai mica de 100: " + sum);
			}
				
	}
	
	public static void salutare(String nume) {
		System.out.println(nume);
	}
	
}
