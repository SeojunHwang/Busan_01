package java_chap07;

// Vehicle 클래스를 상속받은 Bus 클래스
public class Bus extends Vehicle {
//	Vehicle 클래스의 run 메서드를 오버라이딩함
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
