package package01;

import java.util.HashMap;

public class Ex05Test {
	public static void main(String[] args) {
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "����1");
		map.put(2, "����2");
		map.put(3, "����3");
		map.put(4, "����4");
		System.out.println(map.get(1));
		
		HashMap<Double, Integer > map1 = new HashMap<Double, Integer>();
		map1.put(1.0, 1);
		map1.put(2.0, 2);
		map1.put(3.0, 3);
		map1.put(4.0, 4);
		System.out.println(map1.get(1.0)); //1�� ��� �Ǵµ�, map1.get(); ��ü�� �����̹Ƿ� �Ҽ����� ©���� ����.
		
		int i = map1.get(1.0);
		System.out.println(i); //1
		
		HashMap<Integer, Ex03 > map2 = new HashMap<Integer, Ex03>();
		Ex03 ex = new Ex03("high0", "��1");
		map2.put(ex.idx, ex);
		System.out.println(map2.get(1).getEmail());
	}
}
