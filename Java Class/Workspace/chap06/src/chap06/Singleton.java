package chap06;

// 객체를 프로그램 내에서 단 1개만 생성하여 사용하는 방식을 싱글톤이라 함
// 자기 자신의 클래스 타입을 정적 필드로 가지고 있음
// 클래스 내부에서 객체를 생성
// 클래스 생성자에 private 접근 제한자를 사용하여 외부에서 생성자 호출을 막음
// 외부에서 접근 가능한 메서드를 제공하고 해당 메서드에서 정적 필드를 반환함

// 외부에서는 해당 클래스 내부에서 미리 생성된 객체를 사용할 수만 있고, 객체를 직접 생성하지 못함
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
//	정적 메서드
	static Singleton getInstance() {
		return singleton;
	}
}
