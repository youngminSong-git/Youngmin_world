
public class Ex7 {
	public static void main(String [] args) {
		// + : ��ȣ������, ������� , ���ڿ� ���Ῥ����
		int i =10;
		System.out.println(+i);
		int j = 10;
		System.out.println(i + j);		
		String str ="�̼���" + 1;
		System.out.println(str);
		System.out.println("i + j = " + (i+j));
		String str1 = "java version : " + 1.8;
		System.out.println(str1);
		
		// �񱳿����� *****if , for (���)
		i = 10;
		j = 20;
		boolean b = i > j; // �񱳿������� ������� boolean���� ������
		System.out.println("i > j : " + b);
		b = i == j;
		System.out.println("i == j : " + b);
		b = i < j;
		System.out.println("i < j : " + b);
		b = i <= j;
		System.out.println("i <= j : " + b);
		
		float f = 10.1f;
		double d = 10.1;
		b = f == d;
		System.out.println("f == d : " + b);
		b = (double)f == d;
		System.out.println("f == d : " + b);
		b = f == (float)d;
		System.out.println("f == d : " + b);
		
		i = 1;
		d = 1.0;
		b = i == d; //    4byte == 8byte => 8byte == 8byte
		System.out.println("i == d : " + b);
	}
}
