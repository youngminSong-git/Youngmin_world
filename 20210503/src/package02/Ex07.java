package package02;

public class Ex07 {
	public static void main(String[] args) {
		String str = "100";
		
		Integer i1 = Integer.parseInt(str);
		System.out.println(i1);
	
		Integer i2 = new Integer(str);
		System.out.println(i2);
		
		Integer i3 = Integer.valueOf(str);
		System.out.println(i3);
		//위 세개(i1 ~ i3)는 같은 명령어이며, 박싱이라고도 한다.
		
		//언박싱(unboxing)
		int ii1 = i1;
		int ii2 = i1.intValue(); //wrapper자료형에 있는 값을 기본자료형으로 보내는 것 = 언박싱
		System.out.println(ii1);
		System.out.println(ii2);
		
		String str1 = "true";
		Boolean b = Boolean.parseBoolean(str1);
		if(b) {
			System.out.println("부울변환");
		}
	}
}
