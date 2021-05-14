package chap07;

// 클래스 Parent4에 final 키워드를 사용
// 해당 클래스는 더이상 상속할 수 없는 클래스가 됨
// 해당 클래스를 통해서 객체를 생성할 수 있지만 해당 클래스를 상속받아 기능 확장을 할 수는 없음
public final class Parent4 {
	public void method1() {
		System.out.println("final Parent4 클래스의 method1() 호출");
	}
	
	public void method2() {
		System.out.println("final Parent4 클래스의 mehtod2() 호출");
	}
}
