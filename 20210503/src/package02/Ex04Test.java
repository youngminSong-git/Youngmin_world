package package02;

public class Ex04Test {
	public static void main(String[] args) {
		String s1 = "123";
		
		Integer i1 = Integer.parseInt(s1); //파싱, 이방법 주로 사용함
		Integer i2 = new Integer(s1);
		System.out.println(i1);
		System.out.println(i2);
		
		/*
		 * String s2 = "10.5"; 
		 * Integer i3 = Integer.parseInt(s2); //s2를 파싱한다
		 * System.out.println(i3); //10.5는 실수라서 int로 변환할 수없다라고 나옴. 오류
		 */	
		
		String s2 = "10.5";
		int i4 = 123;
		
		if(i4 == i1) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(i1.equals(i4)) { //일반자료형과 Wrapper자료형을 equals로 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("Max 값 : " + Integer.MAX_VALUE); //2147483647
		System.out.println("Max 값 : " + Integer.MIN_VALUE); //-2147483648
	}
}
