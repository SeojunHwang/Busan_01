package java_chap15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStream2Main {

	public static void main(String[] args) {
//		사용자 입력을 받아서 파일로 생성
		
//		1. 파일명 입력받기
//		2. 파일 내용 입력받기
//		3. 파일 쓰기
		Scanner sc = new Scanner(System.in);
		
		String filePath = "c:\\java602\\";
		File file = null;
		FileOutputStream fos = null;
		
		System.out.print("생성할 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		
		try {
			file = new File(filePath + fileName + ".txt");
			fos = new FileOutputStream(file, true);
			
			while (true) {
				System.out.print("내용을 입력하세요 : ");
				String msg = sc.nextLine();
				
				if (msg.equals("exit")) {
					System.out.println("입력을 종료합니다.");
					break;
				}
				msg += "\n";
				byte[] buff = msg.getBytes();
				fos.write(buff);
				System.out.println("입력한 내용 : " + msg);
			}
			
			fos.flush();
		}
		catch (IOException e) {
			System.out.println("파일을 쓰는 도중 오류가 발생했습니다.");
			e.printStackTrace();
		}
		finally {
			if (fos != null) {
				try {
					fos.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
//		문제 1) FileInputStream과 FileOutputStream 클래스를 사용하여 FileStream.txt 파일을 생성하고 사용자가 입력한 내용을 화면에 출력 후 'exit' 명령이 입력되면 사용자의 입력이 중지되고, 파일에 저장된 내용을 모두 화면에 출력하는 프로그램을 작성하세요
//		파일명 : FileStream.txt
//		파일 위치 : c:\\java602\\
//		출력 형식 : 파일에 쓸 내용 : ~~~~
//					파일에 쓴 내용 : ~~~~
//					입력을 종료합니다.
//					---------- 파일의 내용 ----------
//					~~~~~~
//					~~~~~~

	}

}
