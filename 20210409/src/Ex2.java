
public class Ex2 {

	public static void main(String[] args) {
		int i1 ;
		i1 = 10;
		System.out.println(i1);
		// �ǿ����� : ���ͳ�,  ���ͳΰ��� ������ �ִ� ����
		// ������  : �ǿ����ڸ� �����ϱ� ���� ��ȣ (+,-,*,/,...)
		// ����� : �ǿ����ڿ� �����ڸ� ����ϱ� ���ؼ� ���� ���� ��
		//         10 + 20 : �����
		// ���� ������ :  �ǿ����� + �ǿ����� : �ǿ����ڰ� �ΰ��� �ִ� ���
		//           ��� ������ (+, -, *, /, %)
		// ������ ������ (%)
		int x = 10;
		int y = 3;
		int result = x % y; // x�ǿ����� % y�ǿ�����
		System.out.println(result);	
		// �����������ڷ� �� �� �ִ� ����? ����� �˰� ���� ��
		int z = 12; // 3������� Ȯ�� 
		result = z % 3;
		System.out.println(result); // �������� 0�̸� ����̴�.
		result = z % 4; // 4�� ����̸� �������� 0�̴�.
		System.out.println(result);
		
		///        ���ڿ� ���� ������ (+)
		String str = "hello " + "java";
		System.out.println(str);
		String str1 = "hello";
		String str2 = "java";
		str = str1 + " " + str2; // " " :���鹮��
		System.out.println(str);
		result = z % 3;
		System.out.println("result�� 0�̸� 3�� ����̴�. result = " + result);
		str = "3 * 7 = " + 21;
		System.out.println(str);
		/// ���Կ����� (= , +=, -=, *= , -=, %=)
		int i2, i3, i4, i5;
		i2 = i3 = i4 = i5 = 20;
		System.out.println("i2 = " + i2);
		i2 += 2 ; // i2 = i2 + 2;
		System.out.println("i2 = " + i2);
		i2 -= 1; //i2 = i2 - 1;
		System.out.println("i2 = " + i2);
		i2 *= 2; // i2 = i2 * 2;
		System.out.println("i2 = " + i2);
		i2 /= 2; // i2 = i2 / 2;
		System.out.println("i2 = " + i2);
		i3 %= 3; // i3 = i3 % 3;
		System.out.println("i3 = " + i3);
		
		// �� ������ : <, >, <=, >=, == , != 
		// �񱳿������� ������� true / false
		boolean b = i4 == i5;
		System.out.println(b);
		b = i2 > i3;
		System.out.println(b);
		b = i2 == i3;
		System.out.println(b); 
		b = i3 < i4;
		System.out.println(b);
		b = i3 != i4;
		System.out.println(b);
		/// ��������  : �ǿ������� ���� true/false : &&, || 
		/// �������� ��� ���� boolean
		boolean b1 = true && true; // ��, �ο�
		System.out.println(b1);
		b1 = true && false;
		System.out.println(b1);
		b1 = false  && true;
		System.out.println(b1);
		b1 = false && false;
		System.out.println(b1);
		
		int i11 =  10 + 10;
		double d1 =  10.5 + 10;
		
		b1 = true || true;
		System.out.println(b1);
		b1 = true || false;
		System.out.println(b1);
		b1 = false || true;
		System.out.println(b1);
		b1 = false || false;
		System.out.println(b1);
		
		// �� ������ �񱳿������ ����� �����̹Ƿ� �񱳿����ڸ� 
		//�̿��Ͽ� �������� �Ѵ�.
		b1 = i2 > i3 && i3 == i4;
		System.out.println(b1);
		b1 = i2 > i3 || i3 == i4;
		System.out.println(b1);
	}
}
