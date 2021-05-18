package chap08;

// 외부 회사에서 우리의 인터페이스를 사용하여 개발한 클래스
public class MyClassA implements MyInterface {

//	외부 회사에서 개발되어 내부 소스를 컴파일할 수 없어서 추가된 추상 메서드를 오버라이딩할 수 없음
	@Override
	public void method1() {
		System.out.println("MyClassA - method1() 호출");
	}

}
