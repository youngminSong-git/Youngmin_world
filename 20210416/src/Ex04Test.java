
public class Ex04Test {

	public static void main(String[] args) {
		// ��ü ���� �Ŀ� ��� �ʵ忡 ���� ���� 
		Ex04 ex = new Ex04(); // ��ü����
		ex.setName("�̼���"); 
		ex.setHeight(175.5);
		ex.setAge(15);
		Ex04 ex1; // ��ü���� ����
		ex1 =  new Ex04(); // ��ü ����
		// ��ü�� ����� �� �� ����ʵ忡 ���� �����ϰ� �ʹ�.
		Ex04 ex2 = new Ex04("������",21,176.5);
		System.out.println(ex2.getAge());
		System.out.println(ex2.getHeight());
		System.out.println(ex2.getName());
		
		
		
		
		
		
		
		
		
		
	}

}
