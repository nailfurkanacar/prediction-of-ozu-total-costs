package cs102project01;

public class Department {

	private String name;
	private double price;
	private double inflationRate;
	private double calcTotalPrice;
	private double total = 0;
	private double PREPPRICE = 72000;

	public Department(String name) {
		this.name = name;
		this.setInflationRate(12.37); // from TUFE
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getInflationRate() {
		return inflationRate;
	}

	public void setInflationRate(double inflationRate) {
		this.inflationRate = inflationRate;
	}

	public double getCalcTotalPrice() {
		return calcTotalPrice;
	}

	public void setCalcTotalPrice(double calcTotalPrice) {
		this.calcTotalPrice = calcTotalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPREPPRICE() {
		return PREPPRICE;
	}

	public void setPREPPRICE(double pREPPRICE) {
		PREPPRICE = pREPPRICE;
	}

	public double clctoFac(double total) {
		double tmp = 0;
		double tmp1 = 0;
		
		for (int i = 0; i < 4; i++) {
			tmp1 += this.getPrice();
			tmp = this.getPrice() * (1 + this.getInflationRate() / 100);
			this.setPrice(tmp);
		}

		this.setTotal(tmp1);
		return getTotal();

	}
}
