
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		//i = "10"; ���ڿ��� �ν��ϹǷ� int ������ ������ �� ����.
		String s  = "10";
		System.out.println(i); // ���� 10�� ���
		System.out.println(s); // ���ڿ� 10�� ���
		char c = 65;// 0~65535 , unicode : ���ڸ� ������ ��ȯ�� ��
		System.out.println(c);
		c = 'D';
		System.out.println(c);
		int i1 = c;
		System.out.println(i1);
		i1 = 'D'; //(X)
		/// 'F'���ڸ� ������ ���� i2�� �����ϰ� �ʹ�.
		char c1 = 'F';
		int i2 = c1;
		System.out.println(i2);
	}
}