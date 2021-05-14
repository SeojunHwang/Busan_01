package question;

public class Q7SnowTireEx {

	public static void main(String[] args) {
		Q7SnowTire snowTire = new Q7SnowTire();
		Q7Tire tire = snowTire;
		
//		스노우 타이어가 굴러갑니다.
//		SnowTire 클래스의 객체를 생성해서 run() 메서드를 실행하기 때문
		snowTire.run();
//		다형성에 의해서 부모클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 변수를 통해서 자식 객체의 메서드를 실행할 수 있음
		tire.run();
	}

}
