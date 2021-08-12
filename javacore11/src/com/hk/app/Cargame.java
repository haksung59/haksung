package com.hk.app;

public class Cargame {

	public static void main(String[] args) {

		Car pcar = null;
		FireCar cfcar1 = new FireCar();
		FireCar cfcar2 = null;
		
		pcar = cfcar1;
		cfcar2 = (FireCar)pcar;

		cfcar2.water();

	}

}
