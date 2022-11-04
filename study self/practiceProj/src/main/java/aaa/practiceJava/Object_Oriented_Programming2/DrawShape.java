package aaa.practiceJava.Object_Oriented_Programming2;

public class DrawShape {

	public static void main(String[] args) {
		
		Point[] p = {new Point(10,10), new Point(20, 15), new Point(30, 10)};

		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		
		t.draw();
		c.draw();
	}

}

class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0,0);
	}

	String getXY() {
		return "x = " + x + ", " + "y = " + y;
	}
	
}

class Circle extends Shape {
	Point center;
	int r;
	
	Circle(){
		this(new Point(0,0), 100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s", center.x, center.y, r, color);
	}
	
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	
	
	void draw() {
		System.out.printf("[p1=(%s), p2=(%s), p3=(%s), color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
	
}