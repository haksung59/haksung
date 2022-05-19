package aaa.practiceJava.Object_Oriented_Programming2;

class InnerClass {

	class InstanceInner {
		int iv = 100;
		final static int CONST = 100;	//final static은 상수이므로 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;	//static 클래스만 static멤버 정의 가능
	}
	
	void myMethod() {
		System.out.println("hi");
		class LocalInner {
			int iv = 300;
			final static int CONST = 300;
		}
		
		int i = LocalInner.CONST;
	}
	
	public static void main(String[] args) {
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}

	
	
}
