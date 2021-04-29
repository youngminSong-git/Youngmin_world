package package01;

import java.util.HashMap;

public class Ex05Test {
	public static void main(String[] args) {
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "순서1");
		map.put(2, "순서2");
		map.put(3, "순서3");
		map.put(4, "순서4");
		System.out.println(map.get(1));
		
		HashMap<Double, Integer > map1 = new HashMap<Double, Integer>();
		map1.put(1.0, 1);
		map1.put(2.0, 2);
		map1.put(3.0, 3);
		map1.put(4.0, 4);
		System.out.println(map1.get(1.0)); //1이 출력 되는데, map1.get(); 자체가 정수이므로 소수점은 짤려서 나옴.
	}
}
