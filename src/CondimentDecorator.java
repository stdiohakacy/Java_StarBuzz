
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}

class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}