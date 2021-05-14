package chap07;

public class Child34Main {
	public static void main(String [] args) {
		Parent3 p1 = new Parent3();
		Parent4 p2 = new Parent4();
		
		p1.method1();
		p1.method2();
		
		System.out.println();
		
		p2.method1();
		p2.method2();
		
		System.out.println("----------------------------");
		
		Child3 c1 = new Child3();
		Child4 c2 = new Child4();
		
		c1.method1(); // Parent3에서 상속받은 메서드, final이 사용되지 않아서 오버라이드 가능
		c1.method2(); // Parent3에서 상속받은 메서드, final이 사용되어 오버라이드 불가
		c1.method3(); // Child3에서 작성된 메서드
		
		System.out.println();
		
		 // Parent4 클래스가 상속되지 않기 때문에 직접 구현한 메서드들
		c2.method2();
		c2.method3();
	}
}
