package java_chap05;

import java.util.HashMap;
import java.util.Map;

public class AdvancedForEx {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
//		javascript의 for ~ in 문
//		javascript는 object 타입에 주로 사용하고 타입변수에 object 가 가지고 있는 key를 가져옴
//		for (var score in scores) {
//			sum = sum + scores[score];
//		}
		
//		향상된 for문
//		java의 향상된 for문은 javascript의 for~in문과 비슷하나 일반 배열에도 사용할 수 있음
//		타입변수가 가지고 오는 데이터가 배열의 요소임
//		가지고 오는 데이터의 순서를 무작위임
//		컬렉션 타입인 HashMap의 데이터를 가지고 오는데 주로 사용 됨
		for (int score : scores) {
			sum = sum + score;
		}
		
//		일반적인 for 문
//		for (int i = 0; i < scores.length; i++) {
//			sum = sum + scores[i];
//		}
		
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("점수 평균 : " + avg);
		
		System.out.println("----- HashMap 타입의 데이터 가져오기 -----");
		
//		HashMap 타입은 javascript의 object 타입과 비슷한 형태를 가지고 있음
		Map<String, String> data = new HashMap<String, String>();
		data.put("a", "java");
		data.put("b", "html");
		data.put("c", "css");
		
		System.out.println("HashMap에서 직접 데이터 출력");
		System.out.println(data.get("a"));
		System.out.println(data.get("b"));
		System.out.println(data.get("c"));
		
		System.out.println("향상된 for문을 사용하여 HashMap에서 데이터 출력");
		for (String key : data.keySet()) {
			System.out.println(data.get(key));
		}
	}

}
