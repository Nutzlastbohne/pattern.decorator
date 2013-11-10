package starbucks.beverages;

public abstract class AbstractBeverage {
	public enum CUPSIZE {
		BUCKET("Bucket", 2.5),
		FISTFUL("Fistful", 1.0),
		SPOONFUL("Spoon", 0.75);

		String label;
		double costFactor;


		CUPSIZE(String label, double costFactor) {
			this.label = label;
			this.costFactor = costFactor;
		}

		public String getLabel() {
			return label;
		}

		public double getCostFactor() {
			return costFactor;
		}
	}


	protected String description = "Unknown beverage";
	protected CUPSIZE size = CUPSIZE.FISTFUL;


	public String getDescription() {
		return description;
	}

	public abstract double getPrice();

	public void setSize(CUPSIZE size) {
		this.size = size;
	}

	public CUPSIZE getSize() {
		return size;
	}
}
