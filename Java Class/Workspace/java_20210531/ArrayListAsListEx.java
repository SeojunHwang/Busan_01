package java_chap15;

import java.util.Arrays;
import java.util.List;

public class ArrayListAsListEx {

	public static void main(String[] args) {
//		List<String> : List 타입의 변수 선언
//		Arrays.asList() : Arrays 클래스(Arrays는 배열의 클래스임), asList() 메서드는 Arrays클래스에서 지원하는 메서드로 반환값으로 List 객체를 반환함
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		
		for (String name : list1) {
			System.out.println(name);
		}
		System.out.println();
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		for (int value : list2) {
			System.out.println(value);
		}
	}

}
