package java_chap07;

public class Child extends Parent {
//	부모 클래스에서 상속받은 메서드와 접근제한자, 반환타입, 매개변수까지 동일하게 입력하고 메서드의 내부 실행코드만 변경하는 것을 오버라이드라고 함
//	오버라이드 조건 : 상속받은 메서드의 접근제한자, 반환타입, 매개변수 까지 동일해야 함
	void method2() {
		System.out.println("Child 클래스의 method2");
	}
	
	void method3() {
		System.out.println("Child 클래스의 mehtod3");
	}
}
