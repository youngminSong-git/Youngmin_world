package package1;

public class Ex01 {
	public static void main(String [] args) {
		/// �ڵ� ����ȯ :
		/// byte => short => int =>long =>float => double
		byte b = 1;
		int i = b;
		System.out.println(b);
		// ū �ڷ��� = ���� �ڷ��� // ū�ڷ����� ���� �ڷ����� �����ϴ� ���� �ڵ�����ȯ
		
		/// ���� ����ȯ 
		/// double => float => long => int => short => byte
		/// ���� �ڷ���  = (���� �ڷ���)ū �ڷ���;
		double d = 10.5;
		System.out.println(d);
		i = (int)d; // ��������ȯ
		System.out.println(i);
	}
}