package hw7_2;

public class SteamMilk extends Decorator {
	public SteamMilk(Beverage base){
		super( base );
	}

	public int getCost(){
		return 50 + this.base.getCost();
	}
}
