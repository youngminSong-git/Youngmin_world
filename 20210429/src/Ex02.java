import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		int i[] = new int[3]; //�Ϲ������� ũ�Ⱑ ������ �ִ� �迭.
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		//i[3] = 4; ������ �ѹ� ���س����� �迭�� ũ�⸦ Ȯ���� �� ����.
		/*
		 ũ�⸦ ������� Ȯ���� �� �ִ� �ڷ����� �ʿ� ==> HashMap
		*/
		HashMap<String, String > map = new HashMap<String, String>();
		map.put("high1", "����1"); //key == 0
		map.put("high2", "����2");
		map.put("high3", "����3");
		map.put("high4", "����4");
	
		//map.put���� Ű�� ��� ����Ǿ� �ִ��� �˼� ���� ��,
		System.out.println(map.keySet()); //�迭���·� �޾ƿ��°� Ȯ���� �� �ִ�.
		
		//for each�� ���ؼ��� ��� ����
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}
