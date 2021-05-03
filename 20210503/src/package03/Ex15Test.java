package package03;

import java.util.*;

public class Ex15Test {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board b = new Board("제목", "내용", "작성자");
		list.add(b);
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		
		for(Board bb : list) {
			System.out.println(bb.content);
		}
		
		List<Board> list1 = Arrays.asList(
			new Board("제목1", "내용1", "작성자1"),
			new Board("제목2", "내용2", "작성자2"),
			new Board("제목3", "내용3", "작성자3")
		);
		
		for(Board bb : list1) {
			System.out.println(bb.content);
		}
		
		//위 두가지로도 list를 만들수 있지만, 아래 vector로도 만들수 있다.
		List<Board> list2 = new Vector<Board>();
		Board b1 = new Board("제목", "내용", "이름");
		list2.add(b1);
		list2.add(new Board("제목1", "내용1", "작성자1"));
		list2.add(new Board("제목2", "내용2", "작성자2"));
		list2.add(new Board("제목3", "내용3", "작성자3"));
		
		for(Board bb : list2) {
			System.out.println(bb.content);
		}
	}
}

/*
 리스트에 데이터를 추가할때 사용하는 것  : .add("값");
 리스트에 있는 값을 가져올때 사용하는 것 : .get(index);
 리스트에 있는 값을 삭제할때 쓰는것 : remove(index), remove("값")
 리스트의 크기 가져오기 : size();
 리스트의 값 삽입 : add(index, "값");
 객체를 만들쌔 사용되는 class : ArrayList, Arrays.asList, vector
 */
