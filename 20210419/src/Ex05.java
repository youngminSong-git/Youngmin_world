
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2. �Ű������� �ְ� ��ȯ���� ���� �޼���");
		add(4, 5);
		fullName("����","��");
		area(3, 3.14);
		rangleArea(3, 4);
	}
	// 2. �Ű������� ������ ��ȯ���� ���� �޼��� 
	// ��ȯ���� void�� �����ָ� ��ȯ���� ���� �޼��尡 �ȴ�.
	// ��ȯ���� ���� ��쿡�� �޼��峻���� ����� Ȯ���� �� �־�� �Ѵ�.
	public static void rangleArea(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	public static void area(int radius, double pi) {
		double result = radius * radius * pi;
		System.out.println(result);
	}
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void fullName(String firstName, 
			String lastName) {
		String fullName = lastName + firstName;
		System.out.println(fullName);
	}
}
