package package03;

import java.util.*;

public class Ex15Test {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board b = new Board("����", "����", "�ۼ���");
		list.add(b);
		list.add(new Board("����1", "����1", "�ۼ���1"));
		list.add(new Board("����2", "����2", "�ۼ���2"));
		list.add(new Board("����3", "����3", "�ۼ���3"));
		
		for(Board bb : list) {
			System.out.println(bb.content);
		}
		
		List<Board> list1 = Arrays.asList(
			new Board("����1", "����1", "�ۼ���1"),
			new Board("����2", "����2", "�ۼ���2"),
			new Board("����3", "����3", "�ۼ���3")
		);
		
		for(Board bb : list1) {
			System.out.println(bb.content);
		}
		
		//�� �ΰ����ε� list�� ����� ������, �Ʒ� vector�ε� ����� �ִ�.
		List<Board> list2 = new Vector<Board>();
		Board b1 = new Board("����", "����", "�̸�");
		list2.add(b1);
		list2.add(new Board("����1", "����1", "�ۼ���1"));
		list2.add(new Board("����2", "����2", "�ۼ���2"));
		list2.add(new Board("����3", "����3", "�ۼ���3"));
		
		for(Board bb : list2) {
			System.out.println(bb.content);
		}
	}
}

/*
 ����Ʈ�� �����͸� �߰��Ҷ� ����ϴ� ��  : .add("��");
 ����Ʈ�� �ִ� ���� �����ö� ����ϴ� �� : .get(index);
 ����Ʈ�� �ִ� ���� �����Ҷ� ���°� : remove(index), remove("��")
 ����Ʈ�� ũ�� �������� : size();
 ����Ʈ�� �� ���� : add(index, "��");
 ��ü�� ����� ���Ǵ� class : ArrayList, Arrays.asList, vector
 */
