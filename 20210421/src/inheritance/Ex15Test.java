package inheritance;

public class Ex15Test {
  // ��� �ʵ�� �⺻ ���� �����ڰ� protected
  // �������� �⺻ ���������ڴ� default�� �Ҵ�ȴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex16 ex = new Ex16();
		//ex.num1 = 10;
		//ex.num2 = 20;
		ex.setNum1(10);
		ex.setNum2(20);
		System.out.println(ex.num1);
		System.out.println(ex.num2);
		int i = ex.sub(); // Ex15�ִ� ����  Ex16�� �̿��ؼ� ������
		System.out.println(i);
		i = ex.div(); // Ex16
		System.out.println(i);
	}

}
