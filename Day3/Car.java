package Day3;

public class Car {

	private String name;
	private String colour;
	private int speed;
	
	
	
	public Car(String name, String colour, int speed) {
		super();
		this.name = name;
		this.colour = colour;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void startCar()
	{
	    this.speed += 10;	
	}
	
	
	public void moveCar(Car car)
	{
		
		System.out.println("Car is moving");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + ", speed=" + speed + ", getName()=" + getName()
				+ ", getColour()=" + getColour() + ", getSpeed()=" + getSpeed() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
