package chap06;

public class Person {
//	final 키워드는 해당 필드를 더이상 수정이 불가능하도록 지정함
//	단 한번 수정이 가능한데 생성자에서 값을 초기화하거나, 필드 선언 시 값을 초기화할 경우 가능
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
