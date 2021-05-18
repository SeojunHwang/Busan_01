package chap08;

public interface InterfaceC extends InterfaceA, InterfaceB {
//	인터페이스는 인터페이스끼리 상속이 가능함
//	인터페이스는 다중 상속을 지원함
//	인터페이스끼리의 상속 시 extends 키워드를 사용함
	public void methodC();
}
