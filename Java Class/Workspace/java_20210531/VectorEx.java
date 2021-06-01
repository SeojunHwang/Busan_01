package java_chap15;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
//		List를 상속받아 사용
//		Vector나 ArrayList나 사용방법이 동일함
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		List<Board> list1 = new ArrayList<Board>();
		list1.add(new Board("제목1", "내용1", "글쓴이1"));
		Board board = list1.get(0);
		System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
	}

}
