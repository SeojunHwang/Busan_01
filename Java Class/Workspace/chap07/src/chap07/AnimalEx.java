package java_chap07;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("--------------");
//		Animal 클래스는 추상 클래스
//		추상 클래스는 객체를 생성할 수 없음
//		추상 클래스의 생성자를 호출할 수 없음
//		Animal 클래스 타입의 변수 animal을 선언하고 null로 초기화
		Animal animal = null;
		
//		다형성을 통해서 부모 클래스인 Animal 타입의 변수 animal에 자식 클래스인 Dog 객체를 저장
		animal = new Dog();
		// 부모 클래스 타입의 변수로 자식 객체의 메서드를 대신 실행
//		실행하는 방법은 동일하지만 결과는 다르게 출력됨
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-----------------");
		
//		매개변수의 다형성을 이용함
		animalSound(new Dog());
		animalSound(new Cat());
		
		animalSound(dog);
		animalSound(cat);
	}
	
//	매개변수가 부모 클래스인 Animal 클래스 타입으로 받음
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
