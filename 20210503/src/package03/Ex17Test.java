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
			Board bd = map.get(i); //키에 저장된 값이 Board니까 Board로 해줘야함
			System.out.println(bd.content);
		}
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "이름1");
		map1.put(2, "이름2");
		map1.put(3, "이름3");
		
		for(Integer i : map.keySet()) {
			map.get(i);
			String str1 = map1.get(i);
			System.out.println(str1);
		}
	}
}
