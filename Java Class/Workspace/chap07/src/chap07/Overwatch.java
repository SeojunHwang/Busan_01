package chap07;

public class Overwatch {

	public static void main(String[] args) {
		Games game = new Games();
		
		McCree mc = new McCree();
		Gengi gj = new Gengi();
		
		
		game.play(mc);
		game.play(gj);
		
		gj.attack();
		gj.stop();
		gj.specialSkill();
	}

}
