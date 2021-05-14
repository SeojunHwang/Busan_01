package question;

public class Q6ChildEx {

	public static void main(String[] args) {
		Q6Child child = new Q6Child();
		
//		자식 클래스인 Q6Child 클래스의 객체를 생성하면 먼저 Q6Parent 클래스의 기본 생성자가 실행되고, Q6Parent 클래스의 기본 생성자에서 this("대한민국")이 실행되어 Q6Parent(String nation) 생성자가 실행된다.
//		그 이후 Q6Child 클래스의 기본 생성자 내에서 this("홍길동")이 실행되어 Q6Child(String name) 생성자가 실행된다.
	}

}
