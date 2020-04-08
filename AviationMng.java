package cs102project01;

public class AviationMng extends AviandAeroSciences {

	public AviationMng(String name) {
		super(name);
		setPrice(48500);
		setCalcTotalPrice(clctoFac(getTotal()));
	}

	public String toString() {
		return "Department Name: " + getName() + "\n" + super.toString();
	}
}