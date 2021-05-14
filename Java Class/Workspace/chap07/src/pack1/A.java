package pack1;

public class A {
//	protected 접근제한자는 기본적으로 default와 동일함
//	같은 패키지 내에서는 default 접근제한자와 차이가 없음
//	다른 패키지 내에서는 default 접근제한자는 외부의 접근을 막음
//	다른 패키지 내에서 protected 접근제한자는 기본적으로 외부의 접근을 막으나, 해당 클래스를 상속받은 자식 클래스에서의 접근은 허용함
	protected String field;
	
	protected A() {
		
	}
	
	protected void method() {
		
	}
}
