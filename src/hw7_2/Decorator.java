package hw7_2;

public abstract class Decorator implements Beverage {
	protected Beverage base;
	public Decorator(Beverage base){
		this.base = base;
	}
}
