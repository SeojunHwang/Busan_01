package java_chap06;

public class Car4Ex {

	public static void main(String[] args) {
		Car4 car1 = new Car4();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car4 car2 = new Car4("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car4 car3 = new Car4("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car4 car4 = new Car4("자가용", "빨강", 250);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		System.out.println("\n----- this() 단계적으로 실행 -----\n");
		
		Car41 car11 = new Car41();
		System.out.println("car11.company : " + car11.company);
		System.out.println();
		
		Car41 car21 = new Car41("자가용");
		System.out.println("car21.company : " + car21.company);
		System.out.println("car21.model : " + car21.model);
		System.out.println();
		
		Car41 car31 = new Car41("자가용", "빨강");
		System.out.println("car31.company : " + car31.company);
		System.out.println("car31.model : " + car31.model);
		System.out.println("car31.color : " + car31.color);
		System.out.println();
		
		Car41 car41 = new Car41("자가용", "빨강", 250);
		System.out.println("car41.company : " + car41.company);
		System.out.println("car41.model : " + car41.model);
		System.out.println("car41.color : " + car41.color);
		System.out.println("car41.maxSpeed : " + car41.maxSpeed);
		System.out.println();
		
//		print();
	}
	
//	static 키워드를 사용하면 해당 메서드 및 필드가 정적 멤버로 변경됨
//	정적 멤버는 정적 멤버만 사용할 수 있음
	public void print() {
		System.out.println("화면 출력");
	}

}
