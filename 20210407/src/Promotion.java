public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڵ� ����ȯ 
		byte b = 10;      // 00001010
		short s = b;      // 00000000 00001010
		int i = s;        // 00000000 00000000 
		                  // 00000000 00001010              
		long l = i;   
		// ���� ũ���� �����͸� ū ������ ������ �� �߻�
		float f = 0.5f;
		double d = f;    // �ڵ� ����ȯ
		f = i; 
		System.out.println(f);
		f = l;
		System.out.println();
		/// �Ǽ��� �������� ũ��.
		// byte < short < int < long < float < double
		double e = 3e2; // ������ �Ǽ������θ� ������ �� �ִ�.
		System.out.println(e);	
		// int i1 = 3e2;	
	}
}