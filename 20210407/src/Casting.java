public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����ȯ
		int i = 10; 
		// 00000000 00000000 00000000 00001010
		//              65536
		short s  = (short)i; // 00000000 00001010
		System.out.println(s);
		// 00000000 00000001 00000000 00000001 :65537 
		i = 65537;
		s = (short)i; // 00000000 00000001
		System.out.println(s);
		// ũ�� ū ���� ���� ũ��� ��ȯ�ϴ� ���� ��������ȯ�̶�� �Ѵ�.
		// ���� �߸��� ��찡 �߻��Ͽ� �ٸ� ���� ������ �� �ִ�.
		
		float f = 15.5f;
		int  i1 =  (int)f; 
		// �Ǽ��� ������ ��������ȯ�� �ϸ� �������� ������ �ȴ�.
		System.out.println(i1);
		
	}
}
