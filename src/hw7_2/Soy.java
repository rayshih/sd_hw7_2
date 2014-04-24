package hw7_2;

public class Soy extends Decorator {
	public Soy(Beverage base){
		super( base );
	}

	public int getCost(){
		return 40 + this.base.getCost();
	}
}
