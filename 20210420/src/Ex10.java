
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = add(5, 4); // ȣ�� �޼���
		System.out.println(i);
		sum(43, 5);
		i = add(); // �Ű������� ������ ���� ���� �� �� ����.
		System.out.println(i);
		sum();
	}
	// �����ε� : �Ű������� ������ ���� �Ǵ� Ÿ�Դٸ� ��� 
	//  �޼����� ������ 4������ �ִ�
	// 1. �Ű������� �ְ� ��ȯ���� �ִ� �޼���
	///         ����Ÿ��             �Ű�����
	public static int add(int num1, int num2) { // ��ȣ�� �޼���
		int result;
		result = num1 + num2;
		return result;
	}
	// 2. �Ű������� �ְ� ��ȯ ���� ���� �Լ�
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	// 3. �Ű����� ���� ��ȯ���� �ִ�.
	//          ����Ÿ��    �Ű�����(x)
	public static int add() {
		int  num1 =  10;
		int num2 = 20;
		int result = num1 + num2;
		return result;
	}
	// 4. �Ű��������� ��ȯ���� ���� �޼���
	public static void sum() {
		int  num1 =  10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println(result);
	}

}
