package java_chap08;

public class Car {
//	인터페이스 Tire 타입의 변수 선언
//	인터페이스 Tire를 구현한 클래스는 HankookTire와 KumhoTire 이므로 해당 클래스의 객체를 Tire 인터페이스의 변수에 대입할 수 있음
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
//	Tire backRightTire = new HankookTire();
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
//	Tire[] tires = new Tire[4];
//	
//	public Car() {
//		tires[0] = new HankookTire();
//		tires[1] = new HankookTire();
//		tires[2] = new HankookTire();
//		tires[3] = new HankookTire();
//	}
	
	void run() {
//		인터페이스 변수를 사용하여 구현 객체(자식 객체)의 메서드를 실행
//		실행할 때 실행하는 방법은 동일함
//		하지만 해당 인터페이스 변수에 저장된 구현 객체에 따라서 결과값은 달라짐
//		frontLeftTire.roll();
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
		
//		for (int i = 0; i < tires.length; i++) {
//			tires[i].roll();
//		}
		
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
