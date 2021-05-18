package chap08;

public interface MyInterface {
	// MyInterface 에는 method1()만 존재
	public void method1();
//	기존에 사용하던대로 인터페이스에 추상 메서드를 추가
//	public void method2();
	
//	기존의 인터페이스에 디폴트 메서드를 추가하여 해결
//	디폴트 메서드는 기본 메서드로 동작
//	구현 클래스에서 오버라이딩이 필요없이 동작됨
//	필요에 따라서 오버라이딩을 진행하면 됨
	public default void method2() {
		System.out.println("MyInterface - method2() 호출");
	}
}
