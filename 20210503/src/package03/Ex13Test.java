package package03;

import java.util.*;

public class Ex13Test {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ㅎㅇ1", "ㅎㅇ2", "ㅎㅇ3");
		for(String str : list) {
			System.out.println(str);
		}
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		for(Integer i : list1) {
			System.out.println(i);
		}
		
		List<String> list2 = new ArrayList<String>();
		list.add("추가이름");
		
	}
}
