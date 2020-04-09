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
				+ " department in 4 years, you will have paid a total of " + (getCalcTotalPrice()) + " TL. \n"
				+ "If you finish " + getName() + " department in 5 years, you will have paid a total of "
				+ (getCalcTotalPrice() + getPREPPRICE()) + " TL and you will have paid a total of "
				+ this.getPriceUniform() + "TL for the uniform." + "\n\n" +

				"If you get 25% scholarship and If you pass the Trace and finish " + getName()
				+ " department in 4 years, you will have paid a total of " + (getCalcTotalPrice() * (3.0 / 4.0)) + " TL. \n"
				+ "If you finish " + getName() + " department in 5 years, you will have paid a total of "
				+ (getCalcTotalPrice() + getPREPPRICE())  * (3.0 / 4.0) + " TL and you will have paid a total of "
				+ this.getPriceUniform() + "TL for the uniform." + "\n\n" +

				"If you get 50% scholarship and If you pass the Trace and finish " + getName()
				+ " department in 4 years, you will have paid a total of " + (getCalcTotalPrice() * (1 / 2)) + " TL. \n"
				+ "If you finish " + getName() + " department in 5 years, you will have paid a total of "
				+ (getCalcTotalPrice() + getPREPPRICE() ) * (1.0 / 2.0) + " TL and " + this.getPriceUniform()
				+ "TL for the uniform." + "\n\n"
				+ "If you get 100% scholarship, you will not pay the fees. However, you will have paid a total of "
				+ this.getPriceUniform() + "TL for the uniform." + "\n\n";

	}
}