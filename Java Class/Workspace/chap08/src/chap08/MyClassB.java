package chap08;

// 우리 회사에서 우리 인터페이스를 사용하여 개발한 클래스
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB - method1() 호출");
	}
	
//	인터페이스에 추상 메서드가 추가되면 오버라이딩부분을 추가하여 사용
//	인터페이스에서 디폴트 메서드를 추가하면 필요에 따라서 오버라이딩을 진행하여 사용
	@Override
	public void method2() {
		System.out.println("MyClassB - method2() 호출");
	}

}
