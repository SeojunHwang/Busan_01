package java_chap07;

public class Child2Main {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.method1();
		p.method2();
		
		System.out.println("---------------------------");
		
		Child2 c = new Child2();
		c.method1();
		c.method2();
		c.method3();
	}

}
