package java_chap08;

public class VehicleEx {

	public static void main(String[] args) {
//		인터페이스 Vehicle 타입의 변수 vehicle 선언
//		해당 변수에 Vehicle 인터페이스를 구현하는 Bus 클래스의 객체를 대입
		Vehicle vehicle = new Bus();
		
//		vehicle 인터페이스 변수의 알맹이는 Bus 객체임
//		vehicle 인터페이스의 멤버는 run() 하나 뿐이므로 run() 메서드만 사용이 가능
//		알맹이는 Bus 객체이므로 Bus객체의 run() 메서드가 대신 실행됨
		vehicle.run();
//		checkFare() 메서드는 Bus 클래스의 멤버이므로 사용하지 못함
//		vehicle.checkFare();
		
//		Vehicle 인터페이스와 Bus 클래스는 구현관계(상속)에 있으므로 타입변환이 가능함
//		부모인 Vehicle 인터페이스 타입이었다가 강제 타입변환을 통해서 다시 Bus 클래스 타입으로 변환됨
		Bus bus = (Bus)vehicle;
		bus.run();
//		강제 타입 변환으로 Bus 클래스 타입이 되었으므로 Bus 클래스 타입의 메서드인 checkFare()를 사용할 수 있음
		bus.checkFare();
	}

}
