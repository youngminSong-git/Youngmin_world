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
		map.remove("�̸�1"); //�̸�1 / 27�� ���������ϱ�
		for(String str : map.keySet()) {
			System.out.println(map.get(str)); //21, 25
		}
		
		//map ������ ����
		map.put("�̸�1", 50); //map�� �ߺ�Ű�� ������� �ʱ� ������ Ű�� ������� ���� ���� 
		for(String str : map.keySet()) {
			System.out.println("���� �� : " + map.get(str));
		}
		
		//map ������ ��ü ����
		map.clear();
		System.out.println("map�� ũ�� : " + map.size()); //0
		
		
		
	}
}
/*
�ʿ��� �ַ� ����ϴ� �޼���

������ ����  : put(Ű, ��); ==> �ߺ� Ű�� ������� ����.
�����͸� ���� : put(Ű, ��); --> Ű�� �����ϴ� Ű���� ��
Ű�� ������ �� : keySet();
���� ������ �� : get(Ű);
��� ������ ���� : clear();
�� �����͸� ���� : remove(), remove(Ű, ��);
���� ũ�� : size() //length�ƴ�
Ű�� ���� ���� Ȯ�� : containsKey()
 */
 