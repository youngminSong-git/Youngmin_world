
public class Ex06 {
	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "����";
	static String lastName = "��";
	static int radius = 3;
	static double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3.  �Ű������� ���� ��ȯ ���� �ִ� �޼���");
		int result = add();
		System.out.println(result);
		String fullName = name();
		System.out.println(fullName);
		double circle = area();
		System.out.println(circle);
		result = rangleArea();
		System.out.println(result);
	}
	// �Ű����� ���� ��쿡�� ����ʵ带 �̿��ؼ� ����� ���� �� ���
	public static int rangleArea() {
		return num1 * num2;
	}
	public static double area() {
		return radius*radius*pi;
	}
	public static String name() {
		return lastName + firstName;
	}
	public static int add() {
		return num1 + num2;
	}

}
