package chap06;

public class CarEx {

	public static void main(String[] args) {
//		Car 클래스를 이용하여 객체를 생성
//		Car() 생성자를 실행하여 객체를 생성하고, new 키워드를 사용하여 힙 메모리 영역에 생성된 객체를 저장하고 그 메모리 주소를 반환함
//		Car 클래스 타입의 변수 myCar에 객체를 생성하고 반환받은 메모리 주소를 대입함
//		myCar는 힙 메모리 영역에 생성된 Car클래스의 객체 주소를 가지고 있음
		Car myCar = new Car();
		
//		Car 클래스 타입의 변수 myCar의 멤버 변수에 접근하기 위해서 ' . ' 기호를 사용하여 원하는 멤버 변수에 접근함
//		Car 클래스의 멤버 변수에 기본적인 데이터가 저장되어 있으므로 객체 생성 후에도 데이터가 존재함
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed); // 0 이 출력
		
//		Car 클래스의 멤버 변수 중 speed 라는 멤버 변수는 저장된 데이터가 없으므로 기본 초기값인 0으로 초기화 되어 있음
		myCar.speed = 60; // myCar라는 객체의 멤버변수에 데이터를 저장하기 위해서 myCar.speed 라고 접근기호를 사용하여 speed 멤버 변수에 접근함
		System.out.println("수정된 속도 : " + myCar.speed);
	}

}
