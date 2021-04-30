package package01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex01Test {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "사람1");
		map.put("2", "사람2");
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		List<String> list = new ArrayList<String>();
		list.add("사람1");
		list.add("사람2");
		
		for(String val : list) {
			System.out.println(val);
		}
	}
}
