package chap08;

public class Driver {
//	매개변수로 인터페이스 타입의 변수를 받음
//	해당 인터페이스를 구현하는 클래스의 객체를 매개변수로 받을 수 있음
	public void drive(Vehicle vehicle) {
//		인터페이스 타입의 변수로 구현 객체의 메서드를 실행할 수 있음
//		vehicle.run();
		
//		instanceof는 해당 객체 타입이 맞는지 확인하는 연산자
//		매개변수인 vehicle 가 원래 Bus 클래스 타입인지 확인
		if (vehicle instanceof Bus) {
//			Bus 클래스 타입이 맞으면 Bus클래스 타입으로 강제 타입 변환
			Bus bus = (Bus) vehicle;
//			Bus 클래스 타입의 메서드 checkFare() 메서드 추가 실행
			bus.checkFare();
		}
		
//		아닐 경우 인터페이스 타입의 멤버인 run() 메서드만 실행
		vehicle.run();
	}
}
