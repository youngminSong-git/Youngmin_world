package package3;

public class StudentTest {

	public static void main(String[] args) {
		
		// �ڽ� �����ڿ��� �θ� �����ڸ� ������ ��Ű�� �ڽ� �����ڰ� �޾ƿ� ���� 
		// �θ� �����ڿ� ����  super()
		Student ex =  new Student("�̼���", "123456-1234567",1);
		System.out.println(ex.name);
		System.out.println(ex.ssn);
		System.out.println(ex.studentNo);
	}

}
