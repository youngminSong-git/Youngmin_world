package package03;

import java.util.*;

public class Ex19 {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "�̸�1");
		map.put(2, "�̸�2");
		map.put(3, "�̸�3");
		
		for(Integer i : map.keySet()) {
			String str = map.get(i);
			System.out.println(str);
		}
		
		map.remove(1);
		for(Integer i : map.keySet()) {
			String str = map.get(i);
			System.out.println(str);
		}

		map.clear();
		System.out.println("ũ�� : " + map.size());
	}
}
