
public class Ex3 {
	public static void main(String[] args) {
		/// ���׿����� : �ǿ����ڰ� 1���̴�.
		/// ��ȣ������ (+,-)
		int i = -(-10);
		System.out.println(i);
		i = -(10); // ��ȣ������.
		System.out.println(i);
		i = -10;
		System.out.println(i);
		double d = 10.5;
		System.out.println(-d); // ��ȣ������.		
		// boolean Ÿ�԰� char Ÿ���� ������ �⺻ Ÿ�Կ� ��� ����
		
		/// ����������. (++, --)
		i = 10;
		i = i + 1; // ��������
		System.out.println(i); // 11
		i++;
		System.out.println(i); // 12
		i++;
		System.out.println(i); // 13
		
		i = i - 1; // ���� ����
		System.out.println(i);
		i--;
		System.out.println(i);
		i--;
		System.out.println(i); //10
		
		++i; // i = i + 1
		System.out.println(i); //11
		--i; // i = i - 1
		System.out.println(i); // 10
		
		int z = ++i; // i = 11 z = 11
		// i = i + 1 ; z = i; // ���� 1������ �����Ƿ� ����
		System.out.println("i = " + i);
		System.out.println("z = " + z);
		
		i = 10;
		z = i++;
		// z = i; i = i + 1; // ������ �����ϰ� ���߿� 1������ �� : ����
		System.out.println("i = " + i); // 11
		System.out.println("z = " + z); // 10
		
		i = 10;
		System.out.println(i++); // 10
		System.out.println(i); // 11
		
		i = 78;
		/// ���� ������ : �ǿ����ڰ� 3��.
		String result = i >= 60 ? "�հ�" : "���հ�";
		System.out.println(result);
	}
}
