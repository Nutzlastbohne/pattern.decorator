package starbucks.beverages;

public class Cappuccino extends AbstractBeverage {

	public Cappuccino() {
		description = "Cappuccino";
	}

	@Override
	public double getPrice() {
		return 2.75;
	}

}
