package chap07;

public class Child5Ex {

	public static void main(String[] args) {
//		Child5 c = new Child5();
//		c.field1 = "data1";
//		c.field2 = "data2";
//		System.out.println(c.field1);
//		System.out.println(c.field2);
//		c.method1();
//		c.method2();
//		c.method3();
		
//		부모 클래스인 Parent5 클래스 타입의 변수에 자식클래스인 Child5의 객체를 대입
		Parent5 p = new Child5();
//		부모 클래스인 Parent5가 가지고 있는 멤버는 정상적으로 사용이 가능함
		p.field1 = "data1";
		p.method1();
		p.method2();
		
//		자식 클래스 타입인 Child5 클래스의 전용 멤버인 field2와 method3()은 부모 클래스 타입의 멤버가 아니므로 현재 사용할 수 없음
//		p.field2 = "data2";
//		p.method3();
		
//		자식 클래스 타입의 전용 멤버를 사용하기 위해서는 다시 자식 클래스 타입의 객체로 타입 변환을 해야 함
//		부모 클래스 타입의 객체를 다시 자식 클래스 타입의 객체로 타입 변환할 경우 자동 타입 변환이 불가능하므로 강제 타입변환을 해야 함
		Child5 ch = (Child5) p;
		ch.field2 = "yyy";
		ch.method3();
	}

}
