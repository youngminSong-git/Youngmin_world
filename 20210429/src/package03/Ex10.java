package package03;

import java.util.HashMap;

public class Ex10 {
	public static void main(String[] args) {
		HashMap<String, Ex09> map = new HashMap<String, Ex09>();
		
		Ex09 ex = new Ex09("ID1", "蜡历1", "皋老1");
		map.put(Ex09.userId, ex);
		
		ex = new Ex09("ID2", "蜡历2", "皋老2");
		map.put(Ex09.userId, ex);
		
		ex = new Ex09("ID3", "蜡历3", "皋老3");
		map.put(Ex09.userId, ex);
		
		ex = new Ex09("ID4", "蜡历4", "皋老4");
		map.put(Ex09.userId, ex);
		
		System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			Ex09 ex1 = map.get(key);
			System.out.println(ex1.getUserId() + " " +  ex1.getUserEmail() + " " + ex1.getUserName());
		}
	}
}

