package java_chap07;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
//		Vehicle v = new Vehicle();
//		v.run();
//		bus.run();
//		taxi.run();
		
//		부모 클래스 타입의 변수에는 자식 클래스 타입의 객체를 저장할 수 있음
		driver.drive(bus);
		driver.drive(taxi);
	}

}
