
public class Ex8 {
	public static void main(String[] args) {
		// �������� : ����(boolean)�� ���� : ���� ������ ���� ���� 
		// and ������
		// ��  and ��  = ��
		// �� and ���� = ����
		// ���� and �� = ����
		// ���� and ���� = ����
		// or
		// �� or �� = ��
		// �� or ���� = ��
		// ���� or �� = ��
		// ���� or ���� = ����
		int i = 65;
		int j = 70;
		int z = 80;
		boolean b = i < j; // �������� ������� �޾ƿ�.
		boolean b1 = i > z;
		
		boolean result = b && b1; // true and false
		System.out.println(result);
		result = i < j && i > z;
		System.out.println(result);	
	}
}