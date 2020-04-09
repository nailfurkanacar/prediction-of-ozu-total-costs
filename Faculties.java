package cs102project01;

public class Faculties extends Department {

	public Faculties(String name) {
		super(name);
		setPrice(72000);
		setCalcTotalPrice(clctoFac(getPrice()));
	}

	public String toString() {
		if (this instanceof Flight) {
			return "In " + getName()
					+ " department, there is no way to apply with scholarship as 25%, 50%.  You can get only 100% scholarship or %0.";

		} else {
			return "If you pass the Trace and finish " + getName()
					+ " department in 4 years, you will have paid a total of " + (getCalcTotalPrice()) + " TL. \n"
					+ "If you finish " + getName() + " department in 5 years, you will have paid a total of "
					+ (getCalcTotalPrice() + getPREPPRICE()) + " TL." + "\n\n" +

					"If you get 25% scholarship and If you pass the Trace and finish " + getName()
					+ " department in 4 years, you will have paid a total of " + (getCalcTotalPrice() * (3 / 4))
					+ " TL. \n" + "If you finish " + getName()
					+ " department in 5 years, you will have paid a total of "
					+ ((getCalcTotalPrice() + getPREPPRICE()) * (3 / 4)) + " TL." + "\n\n" +

					"If you get 50% scholarship and If you pass the Trace and finish " + getName()
					+ " department in 4 years, you will have paid a total of " + ((getCalcTotalPrice()) * (1 / 2))
					+ " TL. \n" + "If you finish " + getName()
					+ " department in 5 years, you will have paid a total of "
					+ ((getCalcTotalPrice() + getPREPPRICE()) * (1 / 2)) + " TL." + "\n\n"
					+ "If you get 100% scholarship, you will not pay the fees.";

		}
	}
}