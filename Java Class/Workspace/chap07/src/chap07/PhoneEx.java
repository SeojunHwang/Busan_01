package chap07;

public class PhoneEx {

	public static void main(String[] args) {
//		추상 클래스는 객체를 생성할 수 없음
//		Phone phone = new Phone("홍길동");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
