package package03;

public class Ex13Test {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		char ch = subject.charAt(3); //subject에 저장한 3번째 단어 가져오기
		System.out.println(ch); //프
		
		int idx = subject.indexOf('프'); //프가 인덱스 어디인지 가져와라
		System.out.println(idx);//3
		
		idx = subject.indexOf("그래밍");
		System.out.println(idx); //5
		
		
		int count = subject.length();
		System.out.println(count);
		
		int i[] = new int[3];
		count = i.length; //배열의 크기
		System.out.println(count);
		
		System.out.println("");
	}
}
