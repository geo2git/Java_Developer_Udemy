package Section_08.Ch103_106_Embarking_on_OOP;

public class Product {
	
	private String model;
	private String manufacturer;
	private int width;
	private int height;
	private int depth;
	
	public Product(String model, String manufacturer) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
	}
}

class Monitor extends Product {

	private int size;
	private String resolution;
	
	public Monitor(String model, String manufacturer) {
		super(model, manufacturer);
	}

	public Monitor(String model, String manufacturer, int size,
			String resolution) {
		super(model, manufacturer);
		this.size = size;
		this.resolution = resolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println(String.format("Desenand pixeli la %d, %d, in culoarea %s ", x, y, color));
	}
}

class Motherboard extends Product{
	
	private int ramSlots;
	private int usbPorts;
	private String bios;
	
	public Motherboard(String model, String manufacturer) {
		super(model, manufacturer);
	}

	public Motherboard(String model, String manufacturer, int ramSlots,
			int usbPorts, String bios) {
		super(model, manufacturer);
		this.ramSlots = ramSlots;
		this.usbPorts = usbPorts;
		this.bios = bios;
	}
	
		public void loadProgram(String programName) {
		System.out.println("Programul " + programName + " se incarca ... ");
	}
}

class ComputerCase extends Product{
	
	private String powerSuply;
	
	public ComputerCase(String model, String manufacturer) {
		super(model, manufacturer);
	}

	public ComputerCase(String model, String manufacturer, String powerSuply) {
		super(model, manufacturer);
		this.powerSuply = powerSuply;
	}
		
	public void pressPowerButton() {
		System.out.println("Butonul de pornire a fost apasat !!");
	}
	
	public ComputerCase getComputerCase() {
		return computerCase;
	}
}