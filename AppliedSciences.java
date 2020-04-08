package cs102project01;

public class AppliedSciences extends Department {
	private double priceUniform;

	public AppliedSciences(String name) {
		super(name);
	}

	public double getPriceUniform() {
		return priceUniform;
	}

	public void setPriceUniform(double priceUniform) {
		this.priceUniform = priceUniform;
	}

	public String toString() {

		return "If you pass the Trace and finish " + getName()
				+ " department in 4 years, you will have paid a total of " + (getCalcTotalPrice()) + "TL. \n"
				+ "If you finish " + getName() + " department in 5 years, you will have paid a total of "
				+ (getCalcTotalPrice() + getPREPPRICE()) + "TL and " + this.getPriceUniform() + "TL for the uniform.";

	}
}