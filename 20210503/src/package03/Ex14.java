package package03;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		
		//����Ʈ�� ���带 �ֱ� ���ؼ� board ��ü���� �ʿ�
		Board b = new Board("����", "����", "�ۼ���");
		list.add(b);
	
		b = new Board("����1", "����1", "�ۼ���1");
		list.add(b);

		b = new Board("����2", "����2", "�ۼ���2");
		list.add(b);
		
		for(Board bd : list) { //bd�� list�� ��´�
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
