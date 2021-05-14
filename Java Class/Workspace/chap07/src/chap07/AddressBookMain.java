package chap07;

public class AddressBookMain {

	public static void main(String[] args) {
//		이름, 전화번호, 이메일, 사용 sns가 무엇인지 출력
		
		PhoneBook p1 = new PhoneBook();
		p1.name = "홍길동";
		p1.phone = "010-1234-5678";
		
		p1.outputPhoneNumber();
		
		System.out.println("-------------------------");
		
		AddressBook ab1 = new AddressBook();
		ab1.name = "아이유";
		ab1.phone = "010-9876-5432";
		ab1.email = "iu@gmail.com";
		ab1.sns = "facebook";
		
		ab1.outputPhoneNumber();
		ab1.outputEmail();
		ab1.outputSns();
		
		ab1.outputAllInfo();
		
		// PhoneBook 클래스에서 private 접근제한자를 사용하여 상속받지 못한 메서드
//		ab1.isPhoneNumber();
	}

}
