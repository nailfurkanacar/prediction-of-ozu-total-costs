package cs102project01;

public class GastAndCuli extends AppliedSciences {
	private double priceofKnifeSet;
	
	public GastAndCuli(String name) {
		super(name);
		this.setPrice(49000);
		this.setPriceUniform(348);
		this.setPriceofKnifeSet(675);
		setCalcTotalPrice(clctoFac(getPrice()));
	}
	
	public double getPriceofKnifeSet() {
		return priceofKnifeSet;
	}

	public void setPriceofKnifeSet(double priceofKnifeSet) {
		this.priceofKnifeSet = priceofKnifeSet;
	}

	public String toString() {
		return "Department Name: " + getName() + "\n"  + super.toString() + 
				" Also, for the knife sets fee is " + this.getPriceofKnifeSet() + " Euro."; 
	}
}
