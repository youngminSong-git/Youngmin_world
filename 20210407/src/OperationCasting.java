
public class OperationCasting {
	public static void main(String [] args) {
		short s = 10; //                   00000000 00001010
		int i = 65537;// 00000000 00000001 00000000 00001010
		int i1 = s + i; // 2byte + 4byte
		                // 4byte + 4byte (�ڵ� ����ȯ)
					    //00000000 00000000 00000000 00001010
		                //00000000 00000001 00000000 00000001
		/// ����Ŀ����� �ڵ� ����ȯ
		System.out.println(i1);
		int i2 = 10;
		double d = 170.5;
		double d1 = i2 + d; // 4byte + 8byte
		                    // 8byte(�Ǽ��� ��ȯ) + 8byte 
		System.out.println(d1);
		
		// ������ 4byte�� ����
		System.out.println(10 + 20);
		
		byte b = 10;
		byte b1 = 20; 
		int b2 = b + b1; // 1byte + 1byte(x)
		                 // 4byte + 4byte
                       //  1111111

		System.out.println(b2);
		short s1 = 10;
		short s2 = 20; // 2byte + 2byte => 4byte + 4byte
		int i3 = s1 + s2;
		
		float f1 = 10.5f;
		float f2 = 20.5f;
		float d2 = f1 + f2;
		System.out.println(d2);
		double d3 = f1 + 100.5;   // 4byte + 8byte
		                          // 8byte + 8byte
		System.out.println(d3);
		int x,y,z;
		x = y = z = 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);	
	}
}
//// 2��
/// �ڷ��� : 
///���� : 10  int, long (L) : 4byte
///�Ǽ� : 10.5 float(f), double : 8byte
///���ڿ� : "10", "a", "true" : String
///���� : 'a' : char : unicode char c  = 'A'; c = 65;
///�� : true, false boolean
///����ȯ : �ڵ�����ȯ : byte<short<int<long<float<double
///                ū �ڷ��� = ���� �ڷ���
///       ��������ȯ : ���� �ڷ��� = (���� �ڷ���)ū �ڷ���
///       ����� �ڵ�����ȯ : ������ �ڷ����� ū�ڷ����� ������ �� ��
///                      ���� �ڷ����� ū �ڷ������� ��ȯ






