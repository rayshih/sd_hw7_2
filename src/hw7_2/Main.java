package hw7_2;

public class Main {
	public static void main(String args[] ){
		Beverage b = new HouseBlend();
		b = new Mocha(b);
		System.out.println("mocha houseblend price: " + b.getCost());

		Beverage dme = new Espresso();
		dme = new Mocha( dme );
		dme = new Mocha( dme );
		System.out.println("double mocha Espresso price: " + dme.getCost());
	}
}
