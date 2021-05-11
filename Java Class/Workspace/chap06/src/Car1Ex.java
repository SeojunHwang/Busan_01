package java_chap06;

public class Car1Ex {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1("흰색");
		Car1 myCar2 = new Car1("흰색", 1800);
//		Car1 myCar3 = new Car1(); // Car1 클래스에 기본형 생성자가 없기 때문에 오류 발생
		
		System.out.println(myCar1.cc);
		System.out.println(myCar1.color);
		System.out.println(myCar1.model);
		
	}

}
