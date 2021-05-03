package package03;

import java.util.*;

public class Ex12Test {
	public static void main(String[] args) {
		/*
		  ������ ���� : �ڷḦ �ϳ��� �����ϴ� ��, ������ ������ �����ϱ� ���ؼ� ����� ==> �迭
		  �迭 : ���� �ڷ��� �����͸� ������ ũ�� ��ŭ �����Ҽ� �ְ� ���� ��
		 class : ���� ������ �����͸� ������ �� �ְ� ����� 
		 �÷��� : ũ�Ⱑ �������� ���� �ڷ���. (List, Map, Set, ...),ũ�⸦ ���������� ����� �� �ְ� �����
		 
		 list�� map�� ������ :
		 	Ű or �ε��� ���  ���� -->  map => Ű, list => �ε���
		*/
		List<String> list = new ArrayList<String>(); //<String> ���ڿ� ������ �ڷ� ����
		list.add("����1"); //����Ʈ���ٰ� ������ �����ϰ� ���� �� ==> list.add();
		list.add("����2");
		list.add("����3");
		list.add("����4");
		list.add("����5");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("����Ʈ�� ũ�� : " + list.size());
		
		String str = list.get(2);
		System.out.println("2�� index " + str);
		
		list.remove(3);
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		list.add(2, "database");//2�� index�� �߰�
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove("database"); //value�� �̿��ؼ� ����
		System.out.println(list.get(2));
	}
}
