
public class Ex9 {
	public static void main(String[] args) {
		int i = 10;
		int i1 = 3;
		int result = i % i1; // ������ ������
		System.out.println(result);
	
		i = 10;
		i1 = 20;
		double d = i / i1; // 0.0
		System.out.println(d);
		d = (double) i / i1; // 8byte(�Ǽ�) / 8byte(�Ǽ�)
		System.out.println(d); //0.5  
		
		byte b1 = 127;
		byte b2 = 2;
		//byte b3 = b1 + b2; // ���� 1byte = 4byte + 4byte
		int result1 = b1 + b2; // 4byte = 4byte + 4byte : 129
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3); // -127 :�����÷ο� �߻�
		
		i = 2000000000;
		i1 = 2000000000;
		result1 = i + i1; // �����÷ο�
		System.out.println(result1);
		long l = (long)i + (long) i1;
		System.out.println(l);
		
		char ch1 = 'A' + 1; 
		//������ ���ͳ� ���� ������ ��� ũ�⸦ ����� ������ ������ ���� ����.
		char ch2 = 'A';
		//char ch3 = ch2 + 1; // 2byte =  4byte + 4byte
		int i2 = ch2 + 1;
		System.out.println(i2);
		char ch3 = (char)(ch2 + 1);
		System.out.println(ch3);
		
		short s1 = -10;
		short s2 = 10;
		System.out.println(-s1);//10
		//short s3 = -s1; // 2byte = -4byte
		int result2 = -s1; // 4byte = -4byte
		System.out.println(result2);
		
		// byte b4 = 127 + 2; 
		// ���ͳ� ���� ������ ��� ũ�⸦ ������ �ȵ� 
		char ch5 = 'A' + 5;
		System.out.println(ch5);
		char ch6 = 'D';
		int i6 = ch6;
		System.out.println(i6);
		char ch7 = (char)(ch6 + 10);
		System.out.println(ch7);
		
		byte b4 = (byte)(b1+b2); // (2byte)(4byte + 4byte)
		// ������ ����ȯ
		long i5 = i + i1; // 8byte = 4byte + 4byte(-294967296)
		System.out.println(result1);
        // 2000000000 + 2000000000 = 4000000000(8byte)
		i5 = (long)i + i1; // 8byte = 8byte + 8byte
		// ����ȯ �� ����
		System.out.println(i5);
	}
}
