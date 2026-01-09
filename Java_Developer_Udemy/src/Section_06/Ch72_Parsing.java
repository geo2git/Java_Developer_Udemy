package Section_06;

public class Ch72_Parsing {

	public static void main(String[] args) {
		
		int a = 2000;
		String s = "1990";
		int b = Integer.parseInt(s);
		
		System.out.println(a + b);
		System.out.println(getConsoleInput(123));
		System.out.println(getScannerInput(444));
	}
	
	public static String getConsoleInput(int an) {
		
		String nume = System.console().readLine("Salut, care este numele tau ?");
		System.out.println("Salut " + nume + " !");
		
		return "";
	}
	
	public static String getScannerInput(int an) {
		
		return "";
	}
	
}
