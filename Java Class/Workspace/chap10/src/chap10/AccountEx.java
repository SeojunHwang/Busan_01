package chap10;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(30000);
		}
		catch (BalanceInsufficientException e) {
//			예외 발생 시 사용된 메시지를 가져오기
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
//			예외가 발생된 지점에 대한 정보를 화면에 출력
			e.printStackTrace();
		}
	}

}
