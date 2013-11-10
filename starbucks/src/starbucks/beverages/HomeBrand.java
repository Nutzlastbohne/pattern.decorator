package starbucks.beverages;

public class HomeBrand extends AbstractBeverage {

	public HomeBrand() {
		description = "HomeBrand";
	}

	@Override
	public double getPrice() {
		return 2.50;
	}

}
