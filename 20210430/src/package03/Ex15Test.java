package package03;

public class Ex15Test {
	public static void main(String[] args) {
		String oldStr = "나는 xxx가 좋아";
		String newStr = oldStr.replace("xxx", "자바"); //문자열 변경 메서드
		System.out.println(oldStr);
		System.out.println(newStr);
		
		oldStr = oldStr.replace("xxx", "자바");
	}
}
