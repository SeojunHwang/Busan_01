package java_chap07;

public class Child2 extends Parent2 {
	
	@Override
	void method2() {
		System.out.println("Child2 클래스의 method2() 호출");
	}
	
	void method3() {
//		오버라이드된 Child2 클래스의 객체 자신의 method2() 를 호출
		method2();
		
//		super를 사용하여 부모 클래스의 method2()를 호출
		super.method2();
	}
}
