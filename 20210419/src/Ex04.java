
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �⺻�� : �Ű������� �ְ� ��ȯ���� �ִ� �޼���
		int result = add(4, 5);
		System.out.println(result);
		String fullName = name("����","��");
		System.out.println(fullName);
		double circle = area(3, 3.14);
		System.out.println(circle);
		int rangle = rangleArea(4, 3);
		System.out.println(rangle);
		System.out.println("2.�Ű������� �ְ� ������� ���� �޼���");
	}
	// static�޼��忡��  �޼��带 ȣ���Ϸ��� �޼��尡 static�޼��忩�� �Ѵ�.
	// �޼����� ������ 4���� ����
	// 1. �⺻ �޼��� : �Ű������� �ְ� ��ȯ ���� �ִ� �޼���
	// return type�� return�� �ڿ� �ִ� ������� type�� �����ش�.
	public static int rangleArea(int num1 , int num2) {
		return num1 * num2;
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static String name(String firstName, String lastName) {
		return lastName+firstName;
	}
	public static double area(int radius, double pi) {
		return radius*radius * pi;
	}
}








