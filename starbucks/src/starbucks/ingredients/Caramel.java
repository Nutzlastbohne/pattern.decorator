package starbucks.ingredients;

import starbucks.beverages.AbstractBeverage;

public class Caramel extends AbstractIngredientDecorator {

	private AbstractBeverage beverage;


	public Caramel(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Caramel-" + beverage.getDescription();
	}

	@Override
	public double getPrice() {
		return 0.42 + beverage.getPrice();
	}

}
