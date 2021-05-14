package java_chap07;

// 추상 클래스 Animal
public abstract class Animal {
	public String kind;
	
//	클래스의 멤버 메서드
//	일반 메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
//	추상 메서드
//	메서드의 실행 코드블럭이 없고, 접근제한자, 반환타입, 메서드명, 매개변수와 같은 메서드의 선언부만 존재하는 메서드
//	해당 메서드를 자식 클래스에서 반드시 구현하도록 강제하는 역할을 함
//	추상 클래스를 상속받은 자식 클래스가 부모 클래스의 멤버 중 추상 메서드를 오버라이딩하여 구현하지 않으면 자식 클래스도 추상 클래스가 됨
	public abstract void sound();
}












