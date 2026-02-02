package Section_07.Ch97_102_Diverse;	
import java.util.*;

public class Stringuri {

	public static void main(String[] args) {
		
		String blocText = """
								wrf df b  fdgferf 
									eererrererr 
									ffgfgf""";
							
		System.out.println(blocText);
		
		int a=22, b=33; int s=a+b;
		System.out.printf("Suma celor doua nr a = %d si b= %d este s= %d", a,b,s);
		System.out.println("**********");
		Date data = new Date();
		
		System.out.printf("Data de astazi este: ziua=%td luna= %tm anul= %ty \n",data, data, data);
		
		String s1 = "George se va duce pana in piata de alaturi !";
		
		int lung = s1.length();
		System.out.printf("Lungimea sirului s1 este %d iar primul caracter este= %c \n", lung,s1.charAt(0));
		
		String s2 = "  ";
		System.out.println("S2 este empty ? " + s2.isEmpty());
		System.out.println("Se este blank ?" + s2.isBlank());
	}
}
