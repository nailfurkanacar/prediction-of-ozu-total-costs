package cs102project01;

public class HotelManagement extends AppliedSciences {

	public HotelManagement(String name) {
		super(name);
		this.setPrice(46000);
		this.setPriceUniform(300);
		setCalcTotalPrice(clctoFac(getPrice()));
	}

	public String toString() {
		return "Department Name: " + getName() + "\n" + super.toString();
	}

}
