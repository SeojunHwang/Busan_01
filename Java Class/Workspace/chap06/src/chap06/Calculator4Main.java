package java_chap06;

public class Calculator4Main {

	public static void main(String[] args) {
		Calculator4 cal1 = new Calculator4();
		Calculator4 cal2 = new Calculator4();
		
		cal1.x = 10;
		cal1.y = 20;
		
		cal2.x = 100;
		cal2.y = 200;
		
		cal1.plus();
		cal2.plus();
		
		System.out.println("\n ----- 메서드 오버로딩 ----- \n");
		Calculator5 cal3 = new Calculator5();
		
		cal3.plusInteger(10, 20);
		cal3.plusDouble(10.5, 20.3);
	}

}
