package aaa.practiceJava.Object_Oriented_Programming;

public class Constructor_Car {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("blue", "auto", 2);
		
		System.out.println(c1);
		System.out.println(c2);
		c1.door = 100;
		Car c3 = new Car(c1);
		System.out.println(c3);
		
	}

}

class Car {
	String color;
	String gearType;
	int door;
	
	
	
	Car() {
		this("white", "auto", 4);
	}

	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	public Car(String color, String gearType, int door) {
		super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [Color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}