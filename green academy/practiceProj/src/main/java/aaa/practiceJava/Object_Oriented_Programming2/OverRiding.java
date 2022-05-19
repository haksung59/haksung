package aaa.practiceJava.Object_Oriented_Programming2;

class Point_OverRide{
	int x;
	int y;
	
	Point_OverRide(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int getplus(){
		return x+y;
	}
	
	public String toString() {
		return "x:"+x+"y:"+y;
	}	
	
}

class Point3D extends Point_OverRide {
	
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	int getplus() {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "z:" + z;
	}
	
	
}

public class OverRiding extends Thread{

	public static void main(String[] args) {
		
		Point_OverRide po = new Point_OverRide(1,2);
		System.out.println(po);
		System.out.println(po.getplus());
		
		Point3D p = new Point3D(3,4,5);
		System.out.println(p);
		System.out.println(p.getplus());

	}

	@Override
	public void run() {
		System.out.println("hi");
		for(int i=0; i<10; i++) {
			
			try {
				Thread.sleep(1000+(int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}