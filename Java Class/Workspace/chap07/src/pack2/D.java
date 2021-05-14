package pack2;

import pack1.A;

// 다른 패키지에 있는 클래스 A를 import하여 로드
// 다른 패키지에 존재하는 클래스 A를 클래스 D가 상속받음
public class D extends A {
	public D() {
//		protected 접근 제한자를 사용한 A 클래스의 생성자를 호출하는데 제한이 없음
//		protected 접근 제한자는 상속받은 자식 클래스에 한해서 다른 패키지에 존재하더라도 사용이 가능함
//		super() : 부모 클래스의 생성자를 호출
		super();
//		protected 접근 제한자를 사용한 부모 클래스의 모든 멤버에 접근이 가능함
		this.field = "value";
		this.method();
	}
}
