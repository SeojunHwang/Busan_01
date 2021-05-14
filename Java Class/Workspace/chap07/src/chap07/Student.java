package chap07;

public class Student extends People {

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
//		자식 클래스의 생성자에서 부모 클래스의 생성자를 호출함
//		컴파일러는 부모 클래스의 기본 생성자를 호출하는 super() 만 자동으로 생성함
//		부모 클래스에 기본 생성자를 작성하여 처리하거나 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출할 수 있도록 매개변수가 있는 super(...) 를 입력해야 함
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
