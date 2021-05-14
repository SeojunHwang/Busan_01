package chap07;

public class ComputerEx {

	public static void main(String[] args) {
		double r = 10.0;
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));
	}

}
