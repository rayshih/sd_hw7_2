package hw7_2;

public class Mocha extends Decorator {
	public Mocha(Beverage base){
		super( base );
	}

	public int getCost(){
		return 20 + this.base.getCost();
	}
}
