package java_chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<String, String> hash = new HashMap<String, String>();

		hash.put("key1", "value1");
		hash.put("key2", "value2");
		hash.put("key3", "value3");
		hash.put("key4", "value4");
		hash.put("key5", "value5");
		
		System.out.println(hash.get("key1"));
		
//		Map 타입에 저장된 데이터를 출력하는 방식은 크게 3가지
//		1. get() 메서드를 사용하여 직접 데이터를 출력
//			- 데이터를 가져오기 위한 키를 알고 있을 경우
//		2. keySet() 메서드를 사용하여 Map 타입에 저장된 모든 키를 가져와서 출력하기
//			- Map 타입에 저장된 모든 데이터를 출력할 경우
//			- 사용자가 출력하고자 하는 데이터의 키를 모를 경우
//		3. entrySet() 메서드를 사용하여 모든 key와 valu를 출력
//			- Map 타입에 저장된 모든 데이터를 출력할 경우
//			- 사용자가 출력하고자 하는 데이터의 키를 모를 경우
		
		Set<String> kyes = hash.keySet();
		Iterator<String> iter = kyes.iterator();
		
		while (iter.hasNext()) {
			String key = iter.next();
			String value = hash.get(key);
			System.out.println("key : " + key + "\nvalue : " + value);
			System.out.println("---------------------");
		}
		
		System.out.println("=======================");
		
		
		Set<Map.Entry<String, String>> entryData = hash.entrySet();
		Iterator<Map.Entry<String, String>> iterData = entryData.iterator();
		
		while (iterData.hasNext()) {
			Map.Entry<String, String> entry = iterData.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key : " + key + "\nvalue : " + value);
			System.out.println("---------------------");
		}
		
	}

}



