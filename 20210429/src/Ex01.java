import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//데이터를 저장하는 방식
		/*
		 1. 변수를 이용하는 방식 (기본 자료형을 이용한 변수) 
		 2. 같은 자료형을 여러개 저장할 수 있는 배열 / 배열의 단점 : 크기가 정해져 있어야 함.(크기가 없이 사용 불가능)
		 3. 다른 유형의 데이터를 저장할 수 있는 클래스 / class 배열 생성가능
		 */
		//2번 ex)
		//int i[] = new int[]; //X
		int i[] = new int[3]; //O
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		
		//크기가 정해져 있지 않은 배열과 같은 저장공간 생성하고 싶을 때, 크기가 변경 가능한 자료형 생성  ==> Map
		//map
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "ㅎㅇ"); //key, value 입력. 위에 입력한 Int, String 자료형에 해당하는 것들 넣어주면 됨.
		map.put(2, "ㅎㅇ1"); 
		map.put(3, "ㅎㅇ2"); 
		map.put(4, "ㅎㅇ3"); 
		map.put(5, "ㅎㅇ4");
		map.put(5, "ㅎㅇ4");
		map.put(5, "ㅎㅇ4");
		map.put(5, "ㅎㅇ5");
		
		System.out.println(map.get(2)); //2,ㅎㅇ1
		System.out.println(map.size()); //5개니까 5
		System.out.println(map.get(5)); //5,ㅎㅇ5 ==> 키가 중복되지 않는다. 같은키를 가진 것을 5개를 연달아 썼어도 마지막 값만 나온다.
		
		Iterator<Integer> keys = map.keySet().iterator();
		
		//map2
		HashMap<Integer, String > map2 = new HashMap<Integer, String>();
	}
}
