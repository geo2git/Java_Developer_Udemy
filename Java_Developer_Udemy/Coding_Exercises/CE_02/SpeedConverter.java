package CE_02;

public class SpeedConverter {

	public static long toMilesPerHour(double kilometersPerHour) {
		
		if(kilometersPerHour<0) {
			return -1;
		}  else {
			double km =  kilometersPerHour/1.609;
			
			long round = (long)Math.round(km);
			return round;
		} 
	}


public static void printConversion(double kilometersPerHour) {
	
	if(kilometersPerHour<0) {
		System.out.println("Invalid Value");
	} else {
		long mph = (long)Math.round( kilometersPerHour/1.609);
		System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
	}
	
}

}
