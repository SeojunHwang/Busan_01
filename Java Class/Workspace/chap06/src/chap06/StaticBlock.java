package chap06;

public class StaticBlock {
//	인스턴스 필드
	int field1;
//	인스턴스 메서드
	void method1() {
		System.out.println("인스턴스 필드 field1 : " + field1);
	}
	
//	정적 필드
	static int field2;
//	정적 메서드
	static void method2() {
		System.out.println("정적 필드 field2 : " + field2);
	}
	
//	정적 블럭
	static {
//		정적 블럭은 정적 멤버만 호출하여 사용할 수 있음
//		정적 블럭이 실행되는 상태에서 인스턴스 멤버가 메모리에 로드되어 있는 확인할 수 없음
//		그래서 정적 블럭은 정적 멤버만 사용할 수 있음
//		field1 = 10;
//		method1();
		field2 = 10;
		method2();
	}
	
	static void method3() {
//		정적 메서드에서 this 키워드를 사용할 수 없는 이유는 this 라는 것 자체가 객체화 작업이 이루어졌다는 의미이므로 정적 메서드가 실행되는 순간에 객체가 실제로 메모리에 등록이 되어 있는지 없는지를 확인할 수 없기 때문에 사용할 수 없음
//		this.field1 = 10;
//		this.method1();
		field2 = 10;
		method2();
	}
}
