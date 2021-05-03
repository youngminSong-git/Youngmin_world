package package03;

import java.util.*;

public class Ex16Test {
	public static void main(String[] args) {
		//hashmap list 차이 : 키사용유무
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("이름1", 27);
		map.put("이름2", 25);
		map.put("이름3", 21);
		
		System.out.println("map의 크기 : " + map.size()); //3
		System.out.println("데이터 출력 : " + map.get("이름1")); //27
		
		//map 데이터 삭제
		map.remove("이름1");
 	}
}
