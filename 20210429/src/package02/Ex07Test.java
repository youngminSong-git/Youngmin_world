package package02;

import java.util.HashMap;

public class Ex07Test {
	public static void main(String[] args) {
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "ㅎㅇ1");
		System.out.println(map.get(1));
		
		HashMap<String, Integer > map1 = new HashMap<String, Integer>();
		map1.put("1", 10);
		System.out.println(map1.get("1"));
		
		HashMap<String, Ex06 > map2 = new HashMap<String, Ex06>();
		Ex06 ex = new Ex06("냉장고", 1000);
		map2.put(Integer.toString(Ex06.idx), ex); //Integer.toString ==> int를 String으로 바꾸고 싶을 때
		
		ex = new Ex06("에어컨", 300);
		map2.put(Integer.toString(Ex06.idx), ex);
		Ex06 ex1 = map2.get("1");
		System.out.println(ex1.getGoodsName());
		System.out.println(map2.get("2").getGoodsName());
	}
}
