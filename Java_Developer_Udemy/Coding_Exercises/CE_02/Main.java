package CE_02;

public class Main {

	public static void main(String[] args) {
		
		long conv = (long)SpeedConverter.toMilesPerHour(1.5);
		
		System.out.println(conv);
		
		SpeedConverter.printConversion(1.5);
		
		
	}
}
