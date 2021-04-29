import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		int i[] = new int[3]; //일반적으로 크기가 정해져 있는 배열.
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		//i[3] = 4; 위에서 한번 정해놨으면 배열은 크기를 확장할 수 없다.
		/*
		 크기를 마음대로 확장할 수 있는 자료형이 필요 ==> HashMap
		*/
		HashMap<String, String > map = new HashMap<String, String>();
		map.put("high1", "ㅎㅇ1");
		map.put("high2", "ㅎㅇ1");
		map.put("high3", "ㅎㅇ1");
		map.put("high4", "ㅎㅇ1");
	
		
	}
}
