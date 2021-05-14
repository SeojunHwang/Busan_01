package java_chap07;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}
	
//	부모 클래스인 Animal이 가지고 있던 추상 메서드 sound()를 상속받아 오버라이딩하여 구현
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
