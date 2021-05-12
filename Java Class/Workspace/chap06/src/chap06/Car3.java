package chap06;

public class Car3 {
//	클래스의 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
//	생성자 오버로딩
//	하나의 생성자 명으로 여러개의 생성자를 선언하는 것을 생성자 오버로딩
//	메서드 오버로딩과 동일, 매개변수의 개수, 타입, 순서가 다르면 오버로딩이 가능
	
//	생성자
//	클래스명과 동일한 이름을 가지고 있는 일종의 메서드
//	생성자는 반환값을 가지고 있지 않음
//	접근 제한자는 필요에 따라서 입력하거나 입력하지 않아도 상관없음
//	클래스에 어떠한 생성자도 작성하지 않았을 경우 컴파일러가 자동으로 기본 생성자를 생성함
//	사용자가 생성자를 1개 이상 작성했을 경우 기본 생성자는 자동으로 생성되지 않음
//	사용자가 생성자를 작성했을 경우 기본 생성자를 사용하고자 하면, 사용자가 기본 생성자를 직접 작성해야 함
//	생성자는 객체가 생성될 때 호출될 뿐 외부에서 따로 호출하여 사용할 수 없음
	
//	기본 생성자
	public Car3() {
		
	}
	
//	생성자
	public Car3(String model) {
		this.model = model;
	}
	
	public Car3(int maxSpeed) {
		
	}
	
//	생성자
	public Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car3(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
//	생성자
	public Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
