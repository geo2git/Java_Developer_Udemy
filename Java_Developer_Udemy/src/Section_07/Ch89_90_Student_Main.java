package Section_07;

public class Ch89_90_Student_Main {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			Ch89_90_Student s1 = new Ch89_90_Student("s123"+i, 
												switch(i) {
													case 1 -> "Zizica";
													case 2 -> "Zinel";
													case 3 -> "Pisi"; 
													case 4 -> "Luluta";
													default -> "Garfield";
												},
												"2nov", "Java Learning");
						System.out.println(s1);
					}
			}
}
