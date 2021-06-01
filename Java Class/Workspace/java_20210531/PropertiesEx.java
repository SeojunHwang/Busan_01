package java_chap15;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
//		Hashtable의 하위 클래스
//		Hashtable과 기본적으로 비슷하지만 key와 value를 모두 String만 사용 가능
//		Properties는 주로 Propeerties 파일을 읽을 때 사용
		Properties properties = new Properties();
		
//		getResource() : 지정한 파일의 위치를 상대 경로로 반환
//		getPath() : 위치를 절대 경로로 반환
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		System.out.println(path);
		
//		decode() : 경로에 문자셋을 utf-8 방식으로 변환
		path = URLDecoder.decode(path, "utf-8");
//		load() : Properties 파일의 내용을 불러옴
//		FileReader : 파일 읽기 전용 클래스
		properties.load(new FileReader(path));
		
//		getProperty() : 지정한 key의 value를 불러옴
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
	}

}
