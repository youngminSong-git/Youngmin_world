package package01;

import java.util.HashMap;

public class Ex04Test {
	public static void main(String[] args) {
		HashMap<String, Ex03 > map = new HashMap<String, Ex03>();
		
		Ex03 ex = new Ex03("high1", "����");
		map.put(ex.getEmail(), ex);
		
		//�� �ٸ� ��ü�� �ְ� ���� ��, ��ü���� ���־�� ��.
		ex = new Ex03("high2", "�̻�");
		map.put(ex.getEmail(), ex);
		
		ex = new Ex03("high3", "����");
		map.put(ex.getEmail(), ex);
		
		System.out.println(map.get(1).getName());
		System.out.println(map.get(2).getName());
		System.out.println(map.get(3).getName());
		System.out.println(map.keySet()); //map�� ����ִ� ��ü Ű
		
		//ȸ������ ���� ��, ȸ�� data�� �������� �迭�� ũ�Ⱑ ������ ������ �ȵǱ� ������, map�� ���� ����Ѵ�
	}
}
