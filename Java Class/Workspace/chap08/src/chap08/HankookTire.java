package chap08;

// 인터페이스 Tire를 구현하는 HankookTire 클래스
public class HankookTire implements Tire {

//	Tire 인터페이스의 추상메서드 roll()을 오버라이딩하여 구현
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}

}
