
public class Ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ǽ��� ���ͳ� : 0.5, 10.6, 0.0
		// �Ҽ����� ������ �ִ� ���� �Ǽ���� �Ѵ�.
		float f; // 4byte : ���е��� ����
		double d; // 8byte : ���е��� ����
		/// �Ǽ��� 8byte�� ����Ѵ�.
		System.out.println(10.5);
		f = 10.5f; // 8����Ʈ �Ǽ��� 4����Ʈ�� ���� 
		d = 10.5;
		System.out.println(f);
		System.out.println(d);
		/// ���е� �׽�Ʈ
		f = 0.1234567890123456789f;
		d = 0.1234567890123456789;
		System.out.println(f);
		System.out.println(d);
		/// ������ int, �Ǽ��� double�� ���� ����Ѵ�.
		/// e : 10, 3e6 3* (10�� 6��): 1000000
		///         3e2 3 * (10�� 2��) 300
		double i = 3e6;
		System.out.println(i);
		i = 3e2;
		System.out.println(i);
	}
}
