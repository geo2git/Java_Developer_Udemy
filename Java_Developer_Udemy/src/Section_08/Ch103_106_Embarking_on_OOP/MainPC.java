package Section_08.Ch103_106_Embarking_on_OOP;

public class MainPC {

	public static void main(String[] args) {
		
		ComputerCase cc = new ComputerCase("AMD1234","AMD","220");
		
		Monitor mo = new Monitor("27 inch", "Dell",27,"2K");
		
		Motherboard mb = new Motherboard("Asus k95", "Asus", 4, 4, "Asus Bios");
		
		PersonalComputer pc = new PersonalComputer("Intel Ultra 7i", "Lenovo",cc,mo,mb);
		
		//System.out.println("Carcasa calculatorului este: " + cc.pressPowerButton());
		
//		pc.getMonitor().drawPixelAt(10, 10, "rosu ");
//		pc.getMotherboard().loadProgram("Windows 11");
//		pc.getComputerCase().pressPowerButton();
//		
		pc.poweUp();
		
				}
}
