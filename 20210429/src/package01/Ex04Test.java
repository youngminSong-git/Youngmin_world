package package01;

import java.util.HashMap;

public class Ex04Test {
	public static void main(String[] args) {
		HashMap<String, Ex03 > map = new HashMap<String, Ex03>();
		
		Ex03 ex = new Ex03("high1", "영민");
		map.put(ex.getEmail(), ex);
		
		//또 객체를 넣고 싶을 때, 객체생성 해주어야 함.
		ex = new Ex03("high2", "이상");
		map.put(ex.getEmail(), ex);
		
		ex = new Ex03("high3", "하하");
		map.put(ex.getEmail(), ex);
		
		System.out.println(map.keySet());
		
		//회원가입 만들 때, 회원 data를 담으려면 배열의 크기가 정해져 있으면 안되기 때문에, map은 자주 사용한다
	}
}
