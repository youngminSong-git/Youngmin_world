
public class Ex02Test {
	public static void main(String [] args) {
		Ex02 ex = new Ex02(); // default �����ڸ� ���ؼ� ��ü ����
		ex.setAddr("����");
		ex.setAge(10);
		ex.setName("�̼���");
		System.out.println(ex.getAddr());
		System.out.println(ex.getAge());
		System.out.println(ex.getName());
		
		Ex02 ex1 = new Ex02(15, "�̼���", "����");
		// �����ڴ� ��ü�� �����Ǿ��� �� ����ʵ忡 ���� �ʱ�ȭ������
		// ���� �� ���� ���� ������ �� �� ����.
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());
	
		// �Էµ� ������ �ٸ� ������ �����ؾ� �ϴ� ��� setter
		ex1.setAddr("����");
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());			
	}
}
