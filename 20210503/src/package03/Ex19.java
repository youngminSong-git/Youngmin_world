package package03;

import java.util.*;

public class Ex19 {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "이름1");
		map.put(2, "이름2");
		map.put(3, "이름3");
		
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
		System.out.println("크기 : " + map.size());
	}
}
