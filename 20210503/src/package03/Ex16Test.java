package package03;

import java.util.*;

public class Ex16Test {
	public static void main(String[] args) {
		//hashmap list ���� : Ű�������
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("�̸�1", 27);
		map.put("�̸�2", 25);
		map.put("�̸�3", 21);
		
		System.out.println("map�� ũ�� : " + map.size()); //3
		System.out.println("������ ��� : " + map.get("�̸�1")); //27
		
		//map ������ ����
		map.remove("�̸�1");
 	}
}
