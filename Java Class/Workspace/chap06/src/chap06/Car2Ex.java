package chap06;

public class Car2Ex {

	public static void main(String[] args) {
		Car2 myCar = new Car2("포르쉐");
		Car2 yourCar = new Car2("벤츠");
		
//		myCar.printSpeed();
		
		myCar.run();
		yourCar.run();
	}

}
