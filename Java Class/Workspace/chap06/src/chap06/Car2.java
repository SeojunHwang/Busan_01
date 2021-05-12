package chap06;

public class Car2 {
//	클래스의 멤버인 필드
//	객체화 시 객체(인스턴스) 필드
//	클래스의 전체에서 사용이 가능함
	
//	클래스의 멤버인 필드에 데이터를 저장하는 방법 2가지
//	1. 객체화된 인스턴스를 이용하여 직접 인스턴스 필드에 접근하는 방식
//	2. 메서드를 호출할때 매개변수로 데이터를 넘겨서 메서드 내부에서 인스턴스 필드로 접근
	String model;
	int speed;
	
	int color;
	int type;
	int price;
	
//	생성자
//	클래스명과 동일한 이름을 사용하는 일종의 메서드
//	필드 및 메서드를 초기화하여 사용할 수 있는 준비 상태로 만듬
//	생성자는 객체 생성 시 호출하여 실행
	Car2(String model) {
		this.model = model;
	}
	
//	클래스의 멤버인 메서드
//	객체화 시 객체(인스턴스)의 멤버인 메서드
	void setSpeed(int a) {
//		setSpeed 메서드가 필드인 speed를 가져다가 사용할 수 있음
//		setSpeed는 매개변수 speed를 가지고 있음
//		필드인 speed와 매개변수인 speed가 이름이 동일함
//		이 상황에서 자바는 speed 라는 변수가 필드인지 매개변수인지 정확히 알 수 없기 때문에 오류가 발생함
//		자바에서는 이 상황에서는 매개변수인 speed에 우선순위를 둬서 사용하게 됨
//		이때 필드인 speed를 사용하고자 하면 this 키워드를 사용해야 함
		this.speed = a;
	}
	
	void printSpeed() {
//		printSpeed() 메서드 내에서는 speed라는 변수를 선언한 적이 없음
//		클래스의 멤버인 speed 필드를 사용하여 화면에 출력
//		printSpeed() 메서드가 필드인 speed를 가져다가 사용할 수 있는 이유는 둘 다 Car2클래스의 멤버이기 때문임
		System.out.println(speed);
	}
	
//	클래스의 멤버인 메서드
//	객체화 시 객체(인스턴스)의 멤버인 메서드
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
}
