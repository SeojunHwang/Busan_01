// A 클래스가 속해있는 pack1 패키지가 아닌 pack2 패키지가 있는 위치임
package pack2;

// 다른 패키지인 pack2에 존재하는 클래스 A를 사용하기 위해서 import로 로드함
import pack1.A;

public class C {
	public void method() {
//		protected 접근제한자를 사용한 A 클래스의 생성자를 호출
//		접근이 불가능함
//		A a = new A();
//		A 클래스의 모든 멤버에 protected 접근 제한자를 사용하여 해당 클래스의 멤버에 접근 불가
//		a.field = "value"; 
//		a.method();
	}
}
