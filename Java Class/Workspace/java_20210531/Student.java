package java_chap15;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
//	Object 클래스는 자바의 모든 클래스의 부모 타입
//	다형성을 통해서 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장할 수 있음
//	Object 클래스 타입의 변수 obj에 Student 클래스 타입의 객체를 저장할 수 있음
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
//			매개변수로 받아온 객체의 멤버변수와 현재 객체의 멤버변수를 단순비교
			return (sno == student.sno) && name.equals(student.name);
		}
		else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}
