package package03;

import java.util.*;

public class Ex12Test {
	public static void main(String[] args) {
		/*
		  변수의 단점 : 자료를 하나만 저장하는 것, 변수의 단점을 보완하기 위해서 만든것 ==> 배열
		  배열 : 같은 자료형 데이터를 지정된 크기 만큼 저장할수 있게 만든 것
		 class : 여러 유형의 데이터를 저장할 수 있게 만든것 
		 컬렉션 : 크기가 지정되지 않은 자료형. (List, Map, Set, ...),크기를 유동적으로 사용할 수 있게 만든것
		 
		 list와 map의 차이점 :
		 	키 or 인덱스 사용  여부 -->  map => 키, list => 인덱스
		*/
		List<String> list = new ArrayList<String>(); //<String> 문자열 데이터 자료 저장
		list.add("하이1"); //리스트에다가 데이터 저장하고 싶을 때 ==> list.add();
		list.add("하이2");
		list.add("하이3");
		list.add("하이4");
		list.add("하이5");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("리스트의 크기 : " + list.size());
		
		String str = list.get(2);
		System.out.println("2번 index " + str);
		
		list.remove(3);
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		list.add(2, "database");//2번 index에 추가
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove("database"); //value를 이용해서 삭제
		System.out.println(list.get(2));
	}
}
