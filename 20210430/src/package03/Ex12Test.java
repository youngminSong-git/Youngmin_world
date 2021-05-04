package package03;


/*
 System.out : 출력
 System.in : 입력
 System.exit(0) : 프로그램 종료할 때 사용
 */
public class Ex12Test {
	public static void main(String[] args) {
		String name = "이름1",
			   name1 = new String("이름1"),
			   name2 = "이름1";
		
		//10000 == 100000
		//문자열을 비교하는게 아니라, Stack 영역에 있는 주소를 비교하는것임.
		if(name == name2) {
			System.out.println("주소가 같다.");
		} else {
			System.out.println("주소가 다르다.");
		}

		//10000 == 200000
		if(name == name1) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		System.out.println(name);
		
		Ex11 ex = new Ex11();
		System.out.println(ex);
		
		//문자열 비교할땐 equals 메서드를 사용해서 비교한다.
		if(name.equals(name2)) {
			System.out.println("값이 같다.");
		} else {
			System.out.println("값이 다르다.");
		}

		if(name.equals(name1)) {
			System.out.println("값이 같다.");
		} else {
			System.out.println("값이 다르다.");
		}
	
	}
}
