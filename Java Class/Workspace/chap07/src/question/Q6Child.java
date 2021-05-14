package question;

public class Q6Child extends Q6Parent {
	private String name;
	
	public Q6Child() {
		this("홍길동");
		System.out.println("Q6Child() call");
	}
	
	public Q6Child(String name) {
		this.name = name;
		System.out.println("Q6Child(String name) call");
	}
}
