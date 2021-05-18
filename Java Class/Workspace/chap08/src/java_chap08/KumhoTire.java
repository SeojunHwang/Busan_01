package java_chap08;

// 인터페이스 Tire를 구현하는 KumhoTire 클래스
public class KumhoTire implements Tire {

//	Tire 인터페이스의 roll()을 오버라이딩하여 구현
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
