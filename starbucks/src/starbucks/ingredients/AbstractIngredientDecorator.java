package starbucks.ingredients;

import starbucks.beverages.AbstractBeverage;

public abstract class AbstractIngredientDecorator extends AbstractBeverage {
	@Override
	public abstract String getDescription();

}