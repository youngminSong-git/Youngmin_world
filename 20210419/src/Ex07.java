
public class Ex07 {
	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "����";
	static String lastName = "��";
	static int radius = 3;
	static double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4. �Ű������� ���� ��ȯ���� ����.");
		add();
		name();
		area();
		rangleArea();
	}
	//  ��ȯ���� ���� ��쿡�� return type���� void�� �����ش�.
	public static void rangleArea() {
		System.out.println(num1 * num2);
	}
	public static void add() {
		System.out.println(num1 + num2);
	}
	public static void name() {
		System.out.println(firstName + lastName);
	}
	public static void area() {
		System.out.println(radius * radius * pi);
	}
	
	/*    �Ű�����                 ��ȯ��
	 *       o             o
	 *       o             x
	 *       x             o
	 *       x             x
	 */
	// �Ű������� ���ٴ� ���� ������ ���� ����ؼ� ����� ��´ٴ� ���� ����.
}
