
public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 ex = new Ex08("�̼���", 25, 175.5);
		System.out.println(ex.getName());
		System.out.println(ex.getAge());

		// �����ڸ� ���ؼ� �Ϻ� ����ʵ� ���� �ʱ�ȭ ��Ű�� ���߿� �������� ���� ����
		Ex08 ex1 = new Ex08("�̻��", 17);
		ex1.setHeight(178.5);
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
		System.out.println(ex1.name);
	}

}
