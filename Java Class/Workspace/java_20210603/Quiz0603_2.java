package java_chap15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Quiz0603_2 {
	
	final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String DB_URL = "jdbc:mysql://localhost:3306/testdb1?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";

	public static void main(String[] args) {
		String userId = "tester1";
		String userPw = "asdf1234";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, userId, userPw);
			
			if (conn.isClosed()) {
				System.out.println("데이터 베이스에 연결되지 않았습니다.");
				System.exit(0);
			}
			
			System.out.println("데이터 베이스에 연결되었습니다.\n\n");
			
			String query = "UPDATE address ";
			query += "SET pw = '12345678', userName = 'jdbcTest26', email = 'jdbcTest26@naver.com' ";
			query += "WHERE id = 'test26' ";
			
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(query);
			
			System.out.println("실행 결과 : " + result + "개 실행되었습니다.");
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
