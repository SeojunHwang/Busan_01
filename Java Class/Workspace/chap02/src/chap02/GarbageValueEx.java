package chap02;

public class GarbageValueEx {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			
			System.out.println("var1 : " + var1 + "\tvar2 : " + var2);
		}
		
		var1 = -125;
		var2 = -125;
		
		System.out.println("-------------------");
		
		for (int i = 5; i > 0; i--) {
			--var1;
			--var2;
			
			System.out.println("var1 : " + var1 + "\tvar2 : " + var2);
		}
	}

}
