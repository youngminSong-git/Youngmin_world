package package04;

import java.util.*;

public class Ex20Test {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
	
		Student std = new Student("123456", "�̸�1");
		map.put("high1", std);
		
		std = new Student("1234567", "�̸�2");
		map.put("high2", std);

		std = new Student("12345678", "�̸�3");
		map.put("high3", std);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ �Է�");
			
			System.out.println("���̵� : ");
			String id = sc.nextLine();
			
			System.out.println("��й�ȣ : ");
			String pw = sc.nextLine();
			
			//�ʿ� Ű�� ���� �ϴ��� Ȯ��
			if(map.containsKey(id) == true) {
				Student std1 = map.get(id);
				if(std1.sno.equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else {
				System.out.println("���̵� ����");
			}
		}
		
		
		
//		while(true) {
//			
//			
//		}
	}
}
