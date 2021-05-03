package package02;

import java.util.*;

public class Ex09Test {
	//로또만들기
	public static void main(String[] args) { 
		List<Integer> map = new ArrayList<Integer>(); //리스트 생성

		for(int i = 1; i <= 45; i++) {
			map.add(i); //1~45까지 맵에 저장
		} //맵 사이즈 크기 생성 == 45
		
		int lotto[] = new int[6]; //6개 배열생성
	
		for(int i = 0; i < lotto.length; i++) {
			//리스트의 index를 랜덤값으로 가져온 것
			int num = (int)(Math.random() * map.size()); //45중에 하나 랜덤생성
			lotto[i] = map.get(num); //lotto 배열에 list값 저장
			map.remove(num); //그후 중복 방지를 위해 num 삭제, value key값 동시 삭제
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
