package chap06;

public class StudentInfoMain {

	public static void main(String[] args) {
//		사람 정보를 받아서 저장하고 출력하는 프로그램
//		1. 변수를 사용하여 정보 저장
//		2. 배열을 사용하여 정보 저장
//		3. 클래스를 사용하여 정보 저장
		
		String name1 = "유재석";
		String gender1 = "남성";
		String job1 = "예능인";
		
		String name2 = "아이유";
		String gender2 = "여성";
		String job2 = "가수";
		
		String name3 = "정인선";
		String gender3 = "여성";
		String job3 = "배우";
		
		System.out.println(name1);
		System.out.println(gender1);
		System.out.println(job1);
		System.out.println(name2);
		System.out.println(gender2);
		System.out.println(job2);
		System.out.println(name3);
		System.out.println(gender3);
		System.out.println(job3);
		
		System.out.println("\n----- 배열 사용 -----\n");
		
		String[][] person = new String[5][3];
		person[0][0] = "유재석";
		person[0][1] = "남성";
		person[0][2] = "예능인";
		person[1][0] = "아이유";
		person[1][1] = "여성";
		person[1][2] = "가수";
		person[2][0] = "정인선";
		person[2][1] = "여성";
		person[2][2] = "배우";
		
//		String[][] person = {
//				{"유재석", "남성", "예능인"},
//				{"아이유", "여성", "가수"},
//				{"정인선", "여성", "배우"}
//		};
		
//		for (int i = 0; i < person.length; i++) {
//			for (int j = 0; j < person[i].length; j++) {
//				System.out.println(person[i][j]);
//			}
//		}
		
		printPersonInfo(person);
		
		System.out.println("\n----- 클래스 사용 -----\n");
		
	}
	
	public static void printPersonInfo(String[][] person) {
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		}
	}

}











