
public class Ex14Test {
	// static �޼���� Ŭ���������� ȣ���ϴ� �޼����̹Ƿ�
	// ��ü�� ���� ȣ������ �ʴ´�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex14 ex = new Ex14();
		ex.test();
		ex.staticTest();
		Ex14.staticTest(); // Ŭ���� �޼���
		int result = ex.plus(10, 20);
		System.out.println(result);
		result = Ex14.plus(10 ,  40);
		System.out.println(result);
	}
}
