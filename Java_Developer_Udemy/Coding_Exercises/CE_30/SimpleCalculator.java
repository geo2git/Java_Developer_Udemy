package CE_30;

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
			this.firstNumber=firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber=secondNumber;
	}
	
	public double getAdditionResult() {
		double sum = firstNumber+secondNumber;
		return sum;
	}
	
	public double getSubtractionResult() {
		double dif = firstNumber-secondNumber;
		return dif;
	}
	
	public double getMultiplicationResult() {
		double mtp = firstNumber*secondNumber;
		return mtp;
	}
	
	public double getDivisionResult() {
			double div=firstNumber/secondNumber;
			if(secondNumber==0) {
				return 0;
			} else {
			return div;
			}
		}
}
