package aaa.practiceJava.Object_Oriented_Programming2;

class Point_OverRide {
	int x;
	int y;
	
	Point_OverRide(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x:"+x+"y:"+y;
	}
}

class Point3D extends Point_OverRide {
	
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "z:" + z;
	}
	
	
}

public class OverRiding {

	public static void main(String[] args) {
		
		Point_OverRide po = new Point_OverRide(1,2);
		System.out.println(po);
		
		Point3D p = new Point3D(3,4,5);
		System.out.println(p);

	}

}