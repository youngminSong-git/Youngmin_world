package package03;

import java.util.*;

public class Ex18Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "이름1");	
		map.put(2, "이름2");	
		map.put(3, "이름3");	
		map.put(4, "이름4");
		System.out.println(map.keySet());

		
		map.remove(3);//키값이 3인 요소 삭제 ==> list와 달리 맵은 요소를 삭제해도 인덱스가 땡겨지지 않음
		System.out.println(map.keySet());
	}
}
