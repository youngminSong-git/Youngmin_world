
public class Ex09Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 ex = new Ex09(); // �����ε��� ������ ����
		ex.setAge(16);
		ex.setHeight(175.5);
		ex.setName("�̼���"); // ��ü �ܺο� �޼��� ȣ��
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getName());
		Ex09 ex1 = new Ex09("�̼���", 25); // �����ε��� ������ ����
		ex1.setHeight(175.5);
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
		System.out.println(ex1.getName());	
	}
}