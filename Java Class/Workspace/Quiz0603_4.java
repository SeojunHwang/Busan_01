package java_chap15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz0603_4 {
	
	final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String DB_URL = "jdbc:mysql://localhost:3306/testdb1?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
	
	private static Connection conn = null;
	
	public static void insertQuery(String id, String pw, String name, String email) {
		Statement stmt = null;
		try {
			String query = "INSERT INTO address (id, pw, userName, email) ";
			query += "VALUES ('"+ id +"', '"+ pw +"', '"+ name +"', '"+ email +"') ";
			
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("정보가 입력되었습니다.");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (stmt != null) { stmt.close(); }
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void updateQuery(String id, String pw, String name, String email) {
		Statement stmt = null;
		try {
			String query = "UPDATE address ";
			query += "SET pw = '" + pw + "', userName = '" + name + "', email = '" + email + "' ";
			query += "WHERE id = '" + id + "' ";
			
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("정보가 수정되었습니다.");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (stmt != null) { stmt.close(); }
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static Map<String, String> selectQuery(String id) {
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> result = new HashMap<String, String>();
		
		try {
			String query = "SELECT num, id, pw, userName, email FROM address ";
			query += "WHERE id = '" + id + "' ";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String num = rs.getString("num");
				String uId  = rs.getString("id");
				String uPw = rs.getString("pw");
				String uName = rs.getString("userName");
				String uEmail = rs.getString("email");
				
				result.put("num", num);
				result.put("id", uId);
				result.put("pw", uPw);
				result.put("name", uName);
				result.put("email", uEmail);
				
				System.out.println("Number : " + num + "\nID : " + uId + "\nPW: " + uPw + "\nName : " + uName + "\nEmail : " + uEmail + "\n");
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (stmt != null) { stmt.close(); }
				if (rs != null) { rs.close(); }
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return result;
	}
	
	public static void deleteQuery(String id) {
		Statement stmt = null;
		try {
			String query = "DELETE FROM address ";
			query += "WHERE id = '" + id + "' ";
			
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("정보가 삭제되었습니다.");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (stmt != null) { stmt.close(); }
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		String userId = "tester1";
		String userPw = "asdf1234";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, userId, userPw);
			
			if (conn.isClosed()) {
				System.out.println("데이터 베이스에 연결되지 않았습니다.");
				System.exit(0);
			}
			
			System.out.println("***** 연락처 프로그램 *****");
			
			while (true) {
				System.out.print("\n실행할 명령을 입력하세요(1:입력, 2:수정, 3:조회, 4:삭제, 0: 종료) ");
				String command = sc.nextLine();
				String id = "";
				String pw = "";
				String name = "";
				String email = "";
				
				if (command.equals("1")) {
					System.out.println("사용자 정보를 입력하세요");
					System.out.print("ID : ");
					id = sc.nextLine();
					
					System.out.print("PW : ");
					pw = sc.nextLine();
					
					System.out.print("NAME : ");
					name = sc.nextLine();
					
					System.out.print("EMAIL : ");
					email = sc.nextLine();
					
					insertQuery(id, pw, name, email);
				}
				else if (command.equals("2")) {
					System.out.println("수정할 ID를 입력하세요");
					System.out.print("ID : ");
					id = sc.nextLine();
					
					Map<String, String> result = selectQuery(id);
					
					System.out.print("PW : " + result.get("pw") + " : ");
					pw = sc.nextLine();
					
					System.out.print("NAME : " + result.get("name") + " : ");
					name = sc.nextLine();
					
					System.out.print("EMAIL : " + result.get("email") + " : ");
					email = sc.nextLine();
					
					updateQuery(id, pw, name, email);
				}
				else if (command.equals("3")) {
					System.out.println("조회할 ID를 입력하세요");
					System.out.print("ID : ");
					id = sc.nextLine();
					
					selectQuery(id);
				}
				else if (command.equals("4")) {
					System.out.println("삭제할 ID를 입력하세요");
					System.out.print("ID : ");
					id = sc.nextLine();
					
					deleteQuery(id);
				}
				else if (command.equals("0")) {
					System.out.println("\n***** 프로그램을 종료합니다 *****\n");
					break;
				}
				else {
					System.out.println("\n잘못 입력하셨습니다.\n0 ~ 4까지의 숫자로 입력해주세요.\n");
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (conn != null) { conn.close(); }
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
