
public class Ex14Test {

	public static void main(String[] args) {
		Ex14 ex = new Ex14(); // ��ü �����Ϸ��� ������ ���� ����
		ex.setAddr("����");
		ex.setAge(15);
		ex.setName("�̼���");
		System.out.println(ex.getAddr());
		System.out.println(ex.getAge());
		System.out.println(ex.getName());
		Ex14 ex1 = new Ex14("�̻��", "����", 15); 
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());
		
		ex1.setAddr("����");
		System.out.println(ex1.getAddr());
	}
}
