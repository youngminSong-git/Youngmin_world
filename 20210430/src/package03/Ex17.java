package package03;

public class Ex17 {
	public static void main(String[] args) {
		String str = "abcdefghijklmnop";
		System.out.println(str.substring(2, 2+4));
		
		int idx = str.indexOf("l");
		System.out.println(str.substring(idx, idx+4));
		
		//데이터도 대소문자 구별함.
		String str1 = "Java Programming";
		String str2 = "JAVA ProGramming";
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str1.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
	}
}
