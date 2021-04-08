package Day3;

public class CarApp {

	public static void main(String[] args) {
		
		Car c = new Car("KIA", "Red", 150);
		
		c.moveCar(c);
		
		System.out.println("Car colour is " +c.getColour());
		System.out.println(c.getName());
		System.out.println(c.getSpeed());
	}
}
