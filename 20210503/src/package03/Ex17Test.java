package package03;

import java.util.*;

public class Ex17Test {
	public static void main(String[] args) {
		HashMap<Integer, Board> map = new HashMap<Integer, Board>();
		Board b = new Board("제목", "내용", "작성자");
		map.put(1, b);
		map.put(2, new Board("제목1", "내용1", "작성자1"));
		map.put(2, new Board("제목2", "내용2", "작성자2"));
		System.out.println(map.size());
		
		map.put(3, new Board("제목3", "내용3", "작성자3"));
		for(Integer i : map.keySet()) {
			Board bd = map.get(i);
			System.out.println(bd.content);
		}
	}
}
