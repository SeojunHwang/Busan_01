package java_chap07;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
//		super() : 부모 클래스의 생성자를 호출하는 명령어
//		부모 클래스의 기본 생성자는 컴파일러가 자동으로 super()를 실행
//		부모 클래스에 기본 생성자가 없을 경우 사용자가 직접 필요한 부모 생성자를 호출해야함
//		super(매개변수...) 를 사용
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
