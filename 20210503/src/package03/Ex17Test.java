package package03;

import java.util.*;

public class Ex17Test {
	public static void main(String[] args) {
		HashMap<Integer, Board> map = new HashMap<Integer, Board>();
		Board b = new Board("����", "����", "�ۼ���");
		map.put(1, b);
		map.put(2, new Board("����1", "����1", "�ۼ���1"));
		map.put(2, new Board("����2", "����2", "�ۼ���2"));
		System.out.println(map.size());
		
		map.put(3, new Board("����3", "����3", "�ۼ���3"));
		for(Integer i : map.keySet()) {
			Board bd = map.get(i); //Ű�� ����� ���� Board�ϱ� Board�� �������
			System.out.println(bd.content);
		}
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�̸�1");
		map1.put(2, "�̸�2");
		map1.put(3, "�̸�3");
		
		for(Integer i : map.keySet()) {
			map.get(i);
			String str1 = map1.get(i);
			System.out.println(str1);
		}
	}
}
