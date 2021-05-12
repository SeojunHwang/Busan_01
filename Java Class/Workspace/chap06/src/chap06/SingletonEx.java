package java_chap06;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
//		if (obj1 == obj2) {
//			System.out.println("obj1, obj2는 같은 Singleton 객체 입니다.");
//		}
//		else {
//			System.out.println("obj1, obj2는 다른 Singleton 객체 입니다.");
//		}
		
		if (obj3 == obj4) {
			System.out.println("obj3, obj4는 같은 Singleton 객체 입니다.");
		}
		else {
			System.out.println("obj3, obj4는 다른 Singleton 객체 입니다.");
		}
	}

}
