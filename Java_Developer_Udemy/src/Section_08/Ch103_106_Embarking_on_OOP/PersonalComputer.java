package Section_08.Ch103_106_Embarking_on_OOP;

public class PersonalComputer extends Product{

	private ComputerCase computerCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PersonalComputer(String model, String manufacturer,
			ComputerCase computerCase, Monitor monitor,
			Motherboard motherboard) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

//	public ComputerCase getComputerCase() {
//		return computerCase;
//	}
//
//	public Monitor getMonitor() {
//		return monitor;
//	}
//
//	public Motherboard getMotherboard() {
//		return motherboard;
//	}

private void drawLogo() {
	monitor.drawPixelAt(111, 222, "Albastru");
}

public void poweUp() {
	computerCase.pressPowerButton();
	drawLogo();
}
	
}
