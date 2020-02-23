
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();
}

class Espresso extends Beverage {
	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}

class HouseBlend extends Beverage {
	public HouseBlend() {
		this.description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}


