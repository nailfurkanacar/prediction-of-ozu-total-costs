package cs102project01;

public class Flight extends AviandAeroSciences {
	private double FlightLicenseEUR; // This will be paid with the Euro

	public Flight(String name) {
		super(name);
		this.setFlightLicenseEUR(54000);
	}

	public double getFlightLicenseEUR() {
		return FlightLicenseEUR;
	}

	public void setFlightLicenseEUR(double flightLicenseEUR) {
		FlightLicenseEUR = flightLicenseEUR;
	}

	public String toString() {

		return "Department Name: " + getName() + "\n" + "If you pass the Trace and finish " + getName()
				+ " department in 4 years, you will have paid a total of " + getCalcTotalPrice() + "TL and "
				+ FlightLicenseEUR + "EUR for Flight License Training \n" + "If you finish " + getName()
				+ " department in 5 years, you will have paid a total of " + (getCalcTotalPrice() + getPREPPRICE())
				+ "TL and " + FlightLicenseEUR + "EUR for Flight License Training.";

	}

}
