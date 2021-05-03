package package02;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 기본 자료형  : byte, char, short, int, long, float, double, boolean
		 단점 : 변환하기 쉽지 않음
		정수를 문자로 변환하고 싶을 때, 기본 자료형에서는 정수를 문자로 변환할 수 없음. 마찬가지로 실수나 부울타입도 문자로 변환 불가능
		그런 단점을 보완하기 위해 만들어 진 것 -> 래퍼클래스(wrapper class) 
		기본 자료형을 문자열로 변환하고 문자열을 기본자료형으로 변환이 가능하게 해야함
		 */
		
		//wrapper class
		int i = 10;
		Integer i1 = 10;
		
		short s = 10;
		Short s1 = 10;

		byte b = 12;
		Byte b1 = 12;
		
		long l = 10L;
		Long l1 = 10L;

		float f = 10.5f;
		Float f1 = 10.5f;
		
		double d = 10.5;
		Double d1 = 10.5;
		
		boolean b2 = true;
		Boolean B1 = true;
		//그냥 자료형 == 앞글자 소문자, 래퍼자료형 == 앞글자 대문자
		
		Integer i2 = 100; //박싱이라고 함
		int i3 = i2; //래퍼자료형을 기본자료형에 주는것 == 언박싱
		
		//int i3 = null; == X//래퍼자료형의 경우 null값도 저장 가능
		//Wrapper자료형은 null값을 저장하기 위해서 사용한다.
		//문자열을 변환하기 위해서 사용
		
	
		
	}
}
