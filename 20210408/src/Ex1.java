public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// ���� : 10, �Ǽ� :10.5 , ���� : 'a', ������ "a", ��:true
		int i = 10;
		System.out.println(i); // 10
		String str = "10";
		System.out.println(str); // 10
		char ch = 65; // ������ ������� �Ѵ�.
		char ch1 = 'A';
		System.out.println(ch); // 'A'
		System.out.println(ch1); // 'A'
		int i1 = ch1;
		System.out.println(i1); // 65
		long l = 10; // -2,100,000,000 ~ 2,100,000,000
		System.out.println(l);
		long l1 = 10000000000L;
		System.out.println(l1);
		/// ������ ������ ���� ���� ��
		/// �Ǽ��� ���� : 10.5 // 8byte
		float f = 10.5f ; // 4byte
		double d = 10.5; // 8byte
		System.out.println(f);
		System.out.println(d);
		f = 0.1234567890123456789f;
		d = 0.1234567890123456789;
		System.out.println(f);
		System.out.println(d);
		double d1 = 12345; // 0.12345 * e5 : e�� 10�� �ǹ��Ѵ�.00
		double d2 = 3e5;
		System.out.println(d2);
		d2 = 0.1235;
		//// ���� ������ : true, false
		boolean b = true;
		boolean b1 = false;
		String str1 = "true";
		System.out.println(b); // ����
		System.out.println(str1); // ���ڿ���
		/// ���ͳ� : ����, �Ǽ�, ����, ���ڿ�, ��
		/// �ڷ��� : ���� : int, long, char
		///        �Ǽ� : float, double
		///        ���� : char
		///        ���ڿ� : String
		///        �� : boolean
		/// Promotion : �ڵ�����ȯ 
		/// byte < short < int < long < float < double
		short s = 10;
		int i3 = s; // �ڵ��� ��ȯ
		float f1 = i3; // �ڵ�����ȯ
		int i4 = 1234546780;
		float f2 = i4; // 0.1234546780 * e10
		int i5 = (int)f2;
		System.out.println(i5);
		
		int i6 = 129;
		byte s3 = (byte)i6; // ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ� �� 
		                    // ��������ȯ
		System.out.println(s3);
		int i7 = 2000000000;
		int i8 = 2000000000;
		int i9 = i7 + i8;
		long l3 = i7 + i8; 
		System.out.println(i9);
		System.out.println(l3);
		long l4 = (long) i7 + (long)i8;
		System.out.println(l4);
		long l5 = (long) i7 + i8; // 65��� ���� �ǹ� 
		System.out.println(l5);
	}
}