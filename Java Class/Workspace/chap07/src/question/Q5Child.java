package question;

public class Q5Child extends Q5Parent {
	private int studentNo;
	
	public Q5Child(String name, int studentNo) {
//		부모 클래스에 기본 생성자가 없으므로 컴파일러가 자동으로 부모 생성자를 호출하는 super()를 사용할 수 없음
//		사용자가 super(매개변수...) 을 직접 실행해야 함
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
