package package01;

import java.util.HashMap;

public class Ex04Test {
	public static void main(String[] args) {
		HashMap<String, Ex03 > map = new HashMap<String, Ex03>();
		
		Ex03 ex = new Ex03("high1", "����");
		map.put(ex.getEmail(), ex);
		
		//�� ��ü�� �ְ� ���� ��, ��ü���� ���־�� ��.
		ex = new Ex03("high2", "�̻�");
		map.put(ex.getEmail(), ex);
		
		ex = new Ex03("high3", "����");
		map.put(ex.getEmail(), ex);
		
		System.out.println(map.keySet());
		
		//ȸ������ ���� ��, ȸ�� data�� �������� �迭�� ũ�Ⱑ ������ ������ �ȵǱ� ������, map�� ���� ����Ѵ�
	}
}
