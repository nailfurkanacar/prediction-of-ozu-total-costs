package cs102project01;

public class Faculties extends Department {

	public Faculties(String name) {
		super(name);
		setPrice(72000);
		setCalcTotalPrice(clctoFac(getPrice()));
	}

	public String toString() {
		if (this instanceof Flight) {
			return 	"If you pass the Trace and finish " + getName() + " department in 4 years, you will have paid a total of "
					+ (getCalcTotalPrice()) + " TL. \n" + "If you finish " + getName()
					+ " department in 5 years, you will have paid a total of " + (getCalcTotalPrice() + getPREPPRICE())
					+ " TL.";

		} else {
			return "If you pass the Trace and finish " + getName() + " department in 4 years, you will have paid a total of "
					+ (getCalcTotalPrice()) + " TL. \n" + "If you finish " + getName()
					+ " department in 5 years, you will have paid a total of " + (getCalcTotalPrice() + getPREPPRICE())
					+ " TL.";

		}
	}
}