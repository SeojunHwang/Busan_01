package java_chap06;

public class Calculator6Main {

	public static void main(String[] args) {
		Calculator6 myCalcu = new Calculator6();
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
	}

}
