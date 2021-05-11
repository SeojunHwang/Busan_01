package java_chap06;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
//	클래스의 생성자가 정적 멤버에 접근이 가능하지만 생성자는 클래스를 객체화할 때 실행되기 때문에 정적멤버를 초기화할 수 없음
	public Television() {
		info = "삼성 LCD";
	}
	
//	정적블럭은 정적멤버와 같이 클래스가 메모리에 등록될 때 같이 실행되기 때문에 정적 멤버에 접근이 가능하여 정적 멤버의 초기화가 가능함
	static {
		info = company + "-" + model;
	}
}
