package java_chap07;

public class Tire {
	public int maxRotation; // 최대 수명
	public int accumulatedRotation; // 내구도
	public String location; // 위치
	
//	생성자 / 기본 생성자는 없음
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
//	바퀴가 굴러가는 메서드
//	내구성 감소
	public boolean roll() {
		++accumulatedRotation;
		
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
