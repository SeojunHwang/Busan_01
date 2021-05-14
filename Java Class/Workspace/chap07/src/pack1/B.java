package pack1;

// A 클래스와 동일한 패키지에 있는 B 클래스는 A 클래스의 멤버를 마음대로 접근할 수 있음
public class B {
	public void method() {
		A a = new A(); // A 클래스의 생성자는 protected 접근제한자 사용, 객체 생성 잘 됨
//		protected 접근제한자를 사용한 멤버에 아무런 제한없이 접근이 가능함
		a.field = "value";
		a.method();
	}
}
