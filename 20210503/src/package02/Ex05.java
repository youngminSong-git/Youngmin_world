package package02;

public class Ex05 {
	public static void main(String[] args) {
		String f = "12.4";
		Float f1 = Float.parseFloat(f); //문자열을 실수인 12.4로 파싱시킬수 있음
		System.out.println(f1 + 20.5);
		
		Float f2 = new Float(f);	
		System.out.println(f2 + 20.5);
		
		//float이 가지고 있는 값을 정수로 가져오기
		System.out.println("byte : " + f1.byteValue()); //12
		System.out.println("byte : " + f1.longValue()); //12
		System.out.println("byte : " + f1.shortValue()); //12
		System.out.println("byte : " + f1.intValue()); //12
		
		System.out.println("MAX 값 " + Float.MAX_VALUE); //3.4028235E38
		System.out.println("MAX 값 " + Float.MIN_VALUE); // 1.4E - 45
	
		
	}
}
