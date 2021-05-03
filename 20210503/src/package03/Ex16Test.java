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
		map.remove("이름1"); //이름1 / 27이 없어졌으니까
		for(String str : map.keySet()) {
			System.out.println(map.get(str)); //21, 25
		}
		
		//map 데이터 수정
		map.put("이름1", 50); //map은 중복키를 허용하지 않기 때문에 키가 같을경우 값을 변경 
		for(String str : map.keySet()) {
			System.out.println("변경 후 : " + map.get(str));
		}
		
		//map 데이터 전체 삭제
		map.clear();
		System.out.println("map의 크기 : " + map.size()); //0
		
		
		
	}
}
/*
맵에서 주로 사용하는 메서드

데이터 저장  : put(키, 값); ==> 중복 키를 허용하지 않음.
데이터를 수정 : put(키, 값); --> 키는 존재하는 키여야 함
키만 가져올 때 : keySet();
값을 가져올 때 : get(키);
모든 데이터 삭제 : clear();
한 데이터만 삭제 : remove(), remove(키, 값);
맵의 크기 : size() //length아님
키의 존재 여부 확인 : containsKey()
 */
 