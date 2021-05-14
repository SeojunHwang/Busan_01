package java_chap07;

// 부모 클래스인 Parent4에 final이 사용되었기 때문에 상속이 불가능함
// Parent4의 기능을 사용하고자 할 경우 Child4 클래스에서 Parent4의 메서드를 직접 구현해야 함
//public class Child4 extends Parent4 {
public class Child4 {
//	상속을 받는 클래스가 없기 때문에 @Override를 사용할 수 없음
//	@Override
	public void method2() {
		System.out.println("Child4 클래스의 method2() 호출");
	}
	
	public void method3() {
		System.out.println("Child4 클래스의 method3() 호출");
	}
}
