package java_chap15;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {

	public static void main(String[] args) {
//		HashMap과 Hashtable은 동일함
//		Hashtable은 스레드 동기화가 되어 있어 스레드에 안전함
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
//		사용자 콘솔 입력을 받기 위한 클래스
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
//			nextLine() : Scanner 를 사용하여 사용자의 입력 내용을 하나의 라인씩 문자열로 가져옴
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.println();
			
//			containsKey() : Map 타입의 변수에 해당 key가 존재하는지 여부 확인
			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}

}
