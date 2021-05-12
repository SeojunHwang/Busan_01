package chap06;

public class Car4 {
	String company = "현대자동차";
	String model ;
	String color;
	int maxSpeed;
	
	public Car4() {
		this("자가용", "은색", 250);
	}
	
	public Car4(String model) {
		this(model, "은색", 250);
	}
	
	public Car4(String model, String color) {
		this(model, color, 250);
	}
	
	public Car4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
