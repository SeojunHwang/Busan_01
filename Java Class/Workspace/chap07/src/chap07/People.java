package java_chap07;

public class People {
	public String name;
	public String ssn;
	
//	자식 클래스에서 컴파일러가 자동으로 호출할 수 있도록 기본 생성자를 작성함
	public People() {
		this("홍길동", "987654-9876543");
//		name = "홍길동";
//		ssn = "123456-9876543";
	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
