package package03;

import java.util.*;

public class Ex18Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "�̸�1");	
		map.put(2, "�̸�2");	
		map.put(3, "�̸�3");	
		map.put(4, "�̸�4");
		System.out.println(map.keySet());

		
		map.remove(3);//Ű���� 3�� ��� ���� ==> list�� �޸� ���� ��Ҹ� �����ص� �ε����� �������� ����
		System.out.println(map.keySet());
	}
}
