package starbucks.beverages;

public class Espresso extends AbstractBeverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double getPrice() {
		return 2.99;
	}

}
