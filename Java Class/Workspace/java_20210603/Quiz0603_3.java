package java_chap15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz0603_3 {

	final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String DB_URL = "jdbc:mysql://localhost:3306/testdb1?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
	
	public static void main(String[] args) {
		String userId = "tester1";
		String userPw = "asdf1234";
		
//		사용자 입력을 받기 위한 Scanner 클래스 타입의 객체 생성
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
//		SELECT 명령어 사용 시 결과값을 받아오는 데이터 타입
		ResultSet rs = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, userId, userPw);
			
			if (conn.isClosed()) {
				System.out.println("데이터 베이스에 연결되지 않았습니다.");
				System.exit(0);
			}
			
			System.out.println("데이터 베이스에 연결되었습니다.\n\n");
			
//			사원 번호 입력 부분을 무한 반복함
			while (true) {
				System.out.print("조회할 사원의 사원번호를 입력하세요 : ");
//				사용자에게 사원번호를 입력받음
//				exit 문자열을 입력 받을 경우를 생각하여 nextInt() 가 아닌 nextLine()을 사용
				String strNumber = sc.nextLine();
				
				if (strNumber.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else {
//					Integer 클래스는 기본 데이터 타입인 int의 랩핑 클래스임
//					parseInt() : 매개변수로 입력받은 숫자인 문자열을 정수로 변환
					int empNumber = Integer.parseInt(strNumber);
					String query = "SELECT emp_no, first_name, last_name, gender, hire_date FROM employees ";
//					Statement 를 사용 시 쿼리문에 변수를 직접 입력해야 함
					query += "WHERE emp_no = " + empNumber + " ";
					
					stmt = conn.createStatement();
					rs = stmt.executeQuery(query);

					while (rs.next()) {
						String empNo = rs.getString("emp_no");
						String firstName = rs.getString("first_name");
						String lastName = rs.getString("last_name");
						String gender = rs.getString("gender");
						String hireDate = rs.getString("hire_date");
						
						System.out.println("사원 번호 : " + empNo + "\n사원 이름 : " + firstName + "\n사원 성씨: " + lastName+ "\n사원 성별: " + gender + "\n사원 입사일 : " + hireDate + "\n\n-------------\n");
					}
				}
			}
		}
		catch (SQLException e) {
			System.out.println("데이터 베이스 사용 시 오류가 발생했습니다.");
		}
		catch (Exception e) {
			System.out.println("데이터 베이스 연결시 오류가 발생했습니다.");
		}
		finally {
			try {
				if (stmt != null) { stmt.close(); }
				if (conn != null) { conn.close(); }
				System.out.println("데이터 베이스 연결이 종료되었습니다.");
			}
			catch (Exception e) {
				
			}
		}
	}

}
