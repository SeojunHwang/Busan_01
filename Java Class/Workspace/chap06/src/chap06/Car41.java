package java_chap06;

public class Car41 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car41() {
		this("자가용");
	}
	
	public Car41(String model) {
		this(model, "검정");
	}
	
	public Car41(String model, String color) {
		this(model, color, 250);
	}
	
	public Car41(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
