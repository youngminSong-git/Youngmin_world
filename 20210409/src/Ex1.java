public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ϻ�, ���� , �߱���, �ѱ�, ���� : �ڿ��� : 
		// ���ͳ� : ���� : 10, 20, 30, 1, 2
		//	           �Ǽ�  : 10.5, 0.0 
		//        ���� : 'A' , 'a', ABC'(x)
		//        ���ڿ� : "a", "abcd"
		
		System.out.println("10"); // ȭ�鿡 ���ͳ��� ���
		System.out.println(10);
		System.out.println("Hello java");
		
		// ���� : ���ͳ� ���� ���� �� �ִ� ��
		// �ڷ��� : ���ͳ� ���� ������ ����� �ֱ� ���ؼ� .
		// ������ ���ͳ� �����ϱ� ���� �ڷ��� : ������ �ڷ���
		// ������ �ڷ��� : byte, char, short, int, long
		// ������ ���ͳ� : 1,2,3,4,5,6,7,8,10,....
		byte b = 1;
		char c = 1; // char�� ���� ���ͳ��� ���������� ���ڸ� ���
		short s = 1;
		int i = 1;
		long l = 1;
		// l = 10.5;(x)
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		// �Ǽ��� ���ͳ�(0.0, 1.5, 175.3) �����ϱ� ���� �ڷ���  : �Ǽ��� �ڷ���
		// �Ǽ��� �ڷ��� : float, double
		float f = 10.5f;
		double d = 10.5;
		System.out.println(f);
		System.out.println(d);
		
		// ������ ���ͳ� : 'A', 'B','c', 'v';
		// ������ ���ͳ��� �����ϱ� ���� �ڷ��� : ������ �ڷ��� char
		char c1 = 65;
		char c2 = 'A';
		System.out.println(c1);
		System.out.println(c2);
		
		// ���ڿ��� ���ͳ� : "abcdef", "�̼���" : �ѱ��� �Ϲ������� �� �����̾ ���ڿ��� ���
		// ���ڿ��� ���ͳ��� �����ϱ� ���� �ڷ��� : ���ڿ� �ڷ��� String
		String str = "hello java";
		String name = "�̼���";
		System.out.println(str);
		System.out.println(name);
		// �ʿ�� �ϴ� ���� ���ͳ��̶�� �ϰ� �̷��� ���ͳ��� �����ϱ� ���ؼ� �ڷ����� ����� 
		// �ڷ����� �̿��ؼ� ���ͳ��� ������ �� �ְ� ���� �� ���� ����

	// �ڷ��� ������ = ���ͳ�	
		int   i1  = 10; // ��������
		                //  ���� ����� ���ÿ� ���� �ʱ�ȭ
		int i2; // ���� ����
		i2 = 10;
		System.out.println(i1);
		System.out.println(i2);
		// i1, i2 : ������
		System.out.println(10);
		System.out.println("i3"); // 10, 0.0, 'A', "A"
		// System.out.println(i3); //  ""�� ������ ���ڴ� ������� �ν� 
		                           // ������ �ν��ϱ� ���ؼ��� ���� ������ �ؾ� �Ѵ�.
		// ������ �����
		int i4;
		// int 1a; �������� ���鶧 ù ���ڰ� �����̸� �ȵȴ�.
		//int #i; �������� ���� �� ù ���ڿ� Ư�����ڰ� �� �� ����.
		int _i;
		int i_;
		int $i;
		int i$;
		//int if; // if, else ,...  �����
		           // ������ ����� �� ���� 
		String firstName; // ���δٸ� ����
		String FirstName; // ���δٸ� ���� 
		// �������� ��ҹ��ڸ� �����Ѵ�.
		// ��, �������� ù���ڴ� �ҹ����̾�� �Ѵ�.
		// �ܾ �ΰ� �̻� �پ� �ִ� ��쿡�� ���� �ܾ��� ù���ڴ� �빮���̾�� �Ѵ�.
		char ch1 = '��';  // �ѱ� 2byte 
		System.out.println(ch1);
		// ""�� ���� ���ڴ� ��� ������ �ν��Ѵ�.
		int value;
		//int result = value + 1; // value�� ���� ��� ����
		value = 10;
		int result = value + 1;
		System.out.println(result);
		
		// ���� ���ͳ� : true, false
		// ���� ���ͳ��� �����ϱ� ���� �ڷ��� :boolean
		boolean bl = true; // ���� ����
		System.out.println(bl);
		
		/// ���ͳ�, �ڷ���, ����, ��������

		/// �ڵ� ����ȯ
		// ���� �ڷ����� ū�ڷ����� �����ϴ� ���� ���Ѵ�.
		// ������ ����Ǿ� ������ ��𼭵� ����� �����ϴ�.
		b = 100;
		System.out.println(b);
		s = b;
		System.out.println(s);
		// short : 2byte  = byte : 1byte
		i = s; // �ڵ�����ȯ
		// int : 4byte = short : 2byte
		System.out.println(i);
		// byte < short < int < long < float < double : �ڵ�����ȯ
		
		// ��������ȯ
		// ū �ڷ����� ���� ���� �ڷ����� ����
		i = 100;
		b = (byte)i; // ū �ڷ����� ���� �ڷ����� �����ִ� ���� ��������ȯ�̶�� �Ѵ�.
	}

}
