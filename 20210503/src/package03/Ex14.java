package package03;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		
		//리스트에 보드를 주기 위해선 board 객체생성 필요
		Board b = new Board("제목", "내용", "작성자");
		list.add(b);
	
		b = new Board("제목1", "내용1", "작성자1");
		list.add(b);

		b = new Board("제목2", "내용2", "작성자2");
		list.add(b);
		
		for(Board bd : list) { //bd에 list를 담는다
			System.out.println(bd.content+" , " + bd.writer);
		}
		
		for(int idx = 0; idx < list.size(); idx++ ) {
			Board bd = list.get(idx);
			System.out.println(bd.content+" , " + bd.writer);
		}
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
	}
}
