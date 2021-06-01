package java_chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		map 타입은 key는 중복불가, value는 중복가능
//		put() 데이터 추가하기
//		get() 데이터 가져오기
		System.out.println("총 Entry 수 : " + map.size());
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		System.out.println("총 Entry 수 : " + map.size());
		map.put("홍길동", 95); // 동일한 키를 사용할 경우 해당 키의 데이터를 변경
//		size() hashmap에 저장된 데이터 수 확인
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
//		keySet() 메서드를 사용 시 해당 hashmap 저장된 모든 키를 다 가져옴
//		Set 타입으로 들고 오는 이유는 map 타입에서는 키가 중복되지 않아야 하기 때문
		Set<String> keySet = map.keySet();
		
//		Iterator : 반복자, 객체의 요소를 반복 실행해 주는 타입
		Iterator<String> keyIterator = keySet.iterator(); // iterator() 반복자
//		hasNext() : Iterator 객체의 다음 요소가 존재하는 여부를 boolean 타입으로 반환
//		next() : Iterrator 객체의 다음 요소를 호출함
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
//		remove() : hashmap에 저장된 데이터 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());

//		entrySet() : hashmap 타입을 구성하는 Entry 타입의 데이터를 모두 Set 타입으로 반환
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
//		clear() : hashmap 타입에 저장된 모든 데이터를 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
