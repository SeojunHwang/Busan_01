package java_chap15;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
//		Map 타입의 변수에 put을 통해서 key 및 value를 저장 시 동일한 key가 입력이 되었는지 확인하기 위해서 비교를 함
//		클래스의 객체끼리 비교하려면 equals() 메서드를 사용하고 현재 Student 클래스의 equals() 메서드는 오버라이딩되었기 때문에 Student 클래스의 멤버 변수값만 같으면 같은 데이터로 인식함
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길동"), 80);
		map.put(new Student(1, "아이유"), 95);
		map.put(new Student(1, "홍길동"), 80);
		
//		객체를 생성하기 위해서 new 키워드를 사용했기 때문에 서로 다른 메모리 공간에 객체가 생성됨
		Student stu1 = new Student(1, "아이유");
		Student stu2 = new Student(1, "아이유");
		
//		두 객체를 비교 시 같다라고 출력됨
//		Student 클래스에서 equals() 메서드를 오버라이딩하여 단순 비교함
		if (stu1.equals(stu2)) {
			System.out.println("stu1과 stu2는 같다");
		}
		else {
			System.out.println("stu1과 stu2는 다르다");
		}
		
		System.out.println("총 Entry 수 : " + map.size());
	}

}
