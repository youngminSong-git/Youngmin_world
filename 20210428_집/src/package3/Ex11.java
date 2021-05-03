package package3;

import package2.Ex07;

public class Ex11 {
	public static void main(String[] args) {
		//Object api 사용
		Object obj = 10;
		Object obj1 = "ㅎㅇ";
		Object obj2 = 10.5;
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		
		//Object타입은 어떤 성향이든 안가린다. 정수 / 실수 / 문자
		//오브젝트는 모든 객체에 최상위 부모.
		
		Object ex = new Ex07();
		
		
	}
}
