package di.model;

public class Phone {
	
	String company, name;
	int price;
	
	Camera cam;
	Battery bat;
	Screen scrn;
	
	public Camera getCam() {
		return cam;
	}


	public void setCam(Camera cam) {
		this.cam = cam;
	}


	public Battery getBat() {
		return bat;
	}


	public void setBat(Battery bat) {
		this.bat = bat;
	}


	public Screen getScrn() {
		return scrn;
	}


	public void setScrn(Screen scrn) {
		this.scrn = scrn;
	}


	public Phone() {
		
	}
	
	
	public Phone(String company, String name, int price, Camera cam, Battery bat, Screen scrn) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
		this.cam = cam;
		this.bat = bat;
		this.scrn = scrn;
	}


	public Phone(String company, String name, int price) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
	}


	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Phone [company=" + company + ", name=" + name + ", price=" + price + ", cam=" + cam + ", bat=" + bat
				+ ", scrn=" + scrn + "]";
	}
	
	
	
	
}

class Camera {
	
	String kind;
	int scope;
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		return "Camera [kind=" + kind + ", scope=" + scope + "]";
	}
	
}

class Battery {
	
	int charge;

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "battery [charge=" + charge + "]";
	}
	
}

class Screen {
	
	int size, kind;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "screen [size=" + size + ", kind=" + kind + "]";
	}
	
	
}
