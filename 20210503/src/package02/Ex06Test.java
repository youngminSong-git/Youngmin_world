package package02;

public class Ex06Test {
	public static void main(String[] args) {
		String str = "123.5";
		Double d = new Double(str); //문자열 실수로 바꾸겠다
		System.out.println(d); //문자열 아닌 123.5 출력
		System.out.println(d.intValue());
		System.out.println(d.longValue());
		System.out.println(d.floatValue());
		
		
	}
}
