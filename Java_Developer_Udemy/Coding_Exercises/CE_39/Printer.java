package CE_39;

public class Printer {

	private int tonerLevel, pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		super();
		this.tonerLevel = (tonerLevel < -1 && tonerLevel>100)  ? tonerLevel: -1;
		this.duplex = duplex;
		this.pagesPrinted=0;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount>0 && tonerAmount<=100) {
			int totalToner=tonerAmount+tonerLevel;
			if(totalToner>100) {
				return -1;
			} else {
				tonerLevel=totalToner;
				return tonerLevel;
			} 
		} return -1;
	}

	public int printPages(int pages) {
		int pagesToPrint=pages;
		if(duplex==true) {
			  pagesToPrint = (pages / 2) + (pages % 2);
	            System.out.println("Printing in duplex mode");
		}
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

	}
	
	public int getPagesPrinted() {
        return pagesPrinted;
	}
}