package starbucks.ingredients;

import starbucks.beverages.AbstractBeverage;

public class Coco extends AbstractIngredientDecorator {

	AbstractBeverage beverage;


	public Coco(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Coco-" + beverage.getDescription();
	}

	@Override
	public double getPrice() {
		return 0.50 + beverage.getPrice();
	}

}
