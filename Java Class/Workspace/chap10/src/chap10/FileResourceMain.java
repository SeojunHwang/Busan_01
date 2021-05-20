package java_chap10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileResourceMain {

	public static void main(String[] args) {
		File file = null; // 파일 객체 생성
		FileReader fr = null; // 파일의 내용을 읽기위한 클래스
		
//		파일의 사용하는 도중 오류가 발생하게 되면 그 즉시 실행을 멈추고 catch 부분으로 이동하여 catch쪽 처리를 진행하게 됨
//		이 때 만약 외부 리소스를 사용하던 도중이라면 외부 리소스를 닫아주는 소스코드 부분도 try 영역에서 실행되는 부분이었으나 오류로 인하여 catch 영역이 실행되며, 외부 리소스를 닫아주는 부분이 실행되지 않는 상황이 발생할 수 있음
//		외부 리소스를 닫아주지 않으면 메모리 누수 현상이 발생할 수 있음
		try {
//			파일 위치 지정
			file = new File("C:\\java602\\resource.txt");
//			지정된 파일의 내용을 읽어옴
			fr = new FileReader(file);
			int cur = 0; // 현재 파일의 커서 위치
			
//			read() : 파일 중 문자 1개를 읽어옴, 문자가 없을 경우 -1을 출력
			while ((cur = fr.read()) != -1) {
				System.out.print((char)cur);
			}
			
//			파일 내용을 읽기 위한 클래스 객체를 닫는 메서드
//			파일이라는 외부 리소스를 사용했기 때문에 사용자가 직접 파일을 닫아줘야 함
//			GC가 자동으로 파일 리소스를 삭제하지 못함
//			fr.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		catch (IOException e) {
			System.out.println("파일 사용 시 오류가 발생했습니다.");
		}
		catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
//		이러한 메모리 누수 현상을 방지하기 위해서 기존에는 finally 를 사용하여 외부 리소스를 사용한 부분을 직접 제거해줬음
		finally {
			if (fr != null) {
				try {
					fr.close();
				}
				catch (IOException e) {
					
				}
			}
		}
	}

}







