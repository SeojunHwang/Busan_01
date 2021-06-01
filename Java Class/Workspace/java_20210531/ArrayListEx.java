package java_chap15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
//		String 타입의 ArrayList 생성
		List<String> list = new ArrayList<String>();
		
//		list에 데이터 추가
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase"); // index 2번에 Database 를 입력
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
//		get() 메서드는 지정한 인덱스의 데이터를 가져옴
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println();
		
//		list에 저장된 데이터를 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS"); // 저장된 데이터 중 매개변수와 동일한 데이터를 삭제
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
