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
		map.put("high1", "ㅎㅇ1"); //key == 0
		map.put("high2", "ㅎㅇ2");
		map.put("high3", "ㅎㅇ3");
		map.put("high4", "ㅎㅇ4");
	
		//map.put값의 키가 몇개가 저장되어 있는지 알수 없을 때,
		System.out.println(map.keySet()); //배열형태로 받아오는걸 확인할 수 있다.
		
		//for each문 통해서도 사용 가능
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}
