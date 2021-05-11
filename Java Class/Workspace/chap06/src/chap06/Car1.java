package chap06;

public class Car1 {
	String color;
	int cc;
	String model;

//	사용자 생성자
//	생성자의 매개변수 개수에 따라 생성자를 여러개 사용할 수 있음
//	사용자 생성자를 하나도 작성하지 않았을 경우 컴파일러는 내용과 매개변수가 없는 기본생성자를 생성하여 사용함
//	기본 생성자는 매개변수 없는 형태의 생성자를 말함
//	사용자가 사용자 생성자를 생성하고 기본 형태의 생성자를 작성하지 않으면 객체 생성 시 기본 생성자를 사용할 수 없음
//	사용자 생성자가 1개라도 존재하면 컴파일러는 기본 생성자를 생성하지 않음
		
//	public Car1() { // 기본 생성자에 사용자가 내용을 입력한 형태
//		color = "검정";
//		cc = 1600;
//		model = "아반테";
//	}
	
	public Car1(String color) {
		cc = 1600;
		this.model = "아반테";
//		this : 객체 자기 자신을 뜻하는 키워드
		this.color = color;
	}
	
	public Car1(String color, int cc) {
		model = "아반테";
		this.cc = cc;
		this.color = color;
	}
}
