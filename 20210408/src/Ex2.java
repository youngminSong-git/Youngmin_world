
public class Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 3;
		int k = i % j ;
		System.out.println(k); // ������
		k = i / j;
		System.out.println(k);
		double d = (double)i / j ;
		System.out.println(d);
		
		char ch = 'A' + 1;// ���ͳΰ��� ������ ������ ��� ũ�⸦ ���� ������ ��
		System.out.println(ch);
		char ch1 = 'B';
		///char ch2 = ch1 + 1;  // 4byte + 4byte
		int ch2 = ch1 + 1;
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);
		System.out.println(ch3);
		//ch3 = (char)ch1 + 1; // 2byte + 4byte => 4byte + 4byte
		//ch3 = ch1 + (char)1;
	}
}
