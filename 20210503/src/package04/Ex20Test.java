package package04;

import java.util.*;

public class Ex20Test {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
	
		Student std = new Student("123456", "이름1");
		map.put("high1", std);
		
		std = new Student("1234567", "이름2");
		map.put("high2", std);

		std = new Student("12345678", "이름3");
		map.put("high3", std);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호 입력");
			
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String pw = sc.nextLine();
			
			//맵에 키가 존재 하는지 확인
			if(map.containsKey(id) == true) {
				Student std1 = map.get(id);
				if(std1.sno.equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("아이디가 없다");
			}
		}
		
		
		
//		while(true) {
//			
//			
//		}
	}
}
