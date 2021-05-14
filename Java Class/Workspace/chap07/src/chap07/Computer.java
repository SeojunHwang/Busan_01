package java_chap07;

public class Computer extends Calculator {
//	어노테이션 : 컴파일러에게 추가 확인을 위해서 지시하기 위한 명령어
//	@Override : 해당 메서드가 오버라이드되는 메서드라는 것을 컴파일러에게 알려줌
//	@Override 어노테이션이 없어도 오버라이드가 정상적으로 동작하지만 사용자의 실수에 의해서 접근제한자, 반환타입, 매개변수가 상속받은 부모클래스의 메서드와 달라질 수 있으므로 컴파일러에게 한번 더 확인하라고 명령하여 오류가 없도록 하기 위한 안전장치임
//	@Override 어노테이션이 없는 상태로 접근제한자, 반환타입, 매개변수가 실수로 달라질 경우 오버라이드가 아닌 오버로드로 동작할 수 있음
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
