package question;

public class Q6Parent {
	public String nation;
	
	public Q6Parent() {
		this("대한민국");
		System.out.println("Q6Parent() call");
	}
	
	public Q6Parent(String nation) {
		this.nation = nation;
		System.out.println("Q6Parent(String nation) call");
	}
}
