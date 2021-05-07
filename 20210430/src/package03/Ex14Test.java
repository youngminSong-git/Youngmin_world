package package03;

public class Ex14Test {
	public static void main(String[] args) {
		//바이트를 알고 싶을 때
		
		String str = "abcde";
		byte bytes1[] = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
	
		str = new String(bytes1);
		System.out.println("bytes1 -> String:" + str);
			
	}
}
