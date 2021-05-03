package package01;

import java.util.Scanner;

public class Ex02 {
	//Api는 자료형임. 기본자료형에서 못쓰기 때문에 만들어 진 것들
	//ex > scanner, list, hashmap 등
	/*
	 * Scanner sc = new Scanner(System.in); //키보드 값을 받아서 저장하기 위한 자료형 int i = 10;
	 * //10이라는 정수값을 받아오기 위한 자료형
	 */
	String id;
	public Ex02(String id) {
		this.id = id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	//사용하고 있는 객체가 현 클래스로 만들어졌는지 비교하고 싶을때 아래와 같이 사용
	@Override //보통 오버라이드는 상속받았을때 가능한데, equals를 사용하면 오버라이드 가능
	public boolean equals(Object obj) {
		if(obj instanceof Ex02) { //내가 만들어진것이 Ex02냐 확인
			Ex02 ex = (Ex02)obj;
			if(this.id.equals(ex.getId())){
				return true; //맞으면 리턴트루
			} else {
				System.out.println("다른 값");
				return false; //틀리면 리턴펄스
			}
		} else {
			return false;
		}
	}
}
