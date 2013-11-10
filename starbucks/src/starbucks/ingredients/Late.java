package starbucks.ingredients;

import starbucks.beverages.AbstractBeverage;

public class Late extends AbstractIngredientDecorator {

	AbstractBeverage beverage;


	public Late(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Late-" + beverage.getDescription();
	}

	@Override
	public double getPrice() {
		return 0.35 + beverage.getPrice();
	}

}
