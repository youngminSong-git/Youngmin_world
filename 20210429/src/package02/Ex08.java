package package02;

import java.util.HashMap;


public class Ex08 {
	public static void main(String[] args) {
		HashMap<Integer, Ex06 > map = new HashMap<Integer, Ex06>(); 
		Ex06 ex = new Ex06("≥√¿Â∞Ì", 50120);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("ºº≈π±‚", 30120);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("∑ª¡ˆ", 10120);
		map.put(Ex06.idx, ex);

		ex = new Ex06("TV", 20120);
		map.put(Ex06.idx, ex);
		
		System.out.println(map.keySet());
		
		for(Integer key : map.keySet()) {
			Ex06 ex1 = map.get(key);
			System.out.println(ex1.getGoodsName() + " : " + ex1.getGoodsPrice());
		}
	}
}
