
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3���� ����
		// stack, heap, method 
		// stack : ���� , ��
		// heap : ��
		int i = 10; // stack����  i : 10
		int j = 20; // stack���� j : 20
		double d = 10.5; // stack���� d : 10.5
		String str = "�̼���"; // stack���� str : 1000�ּ�
		                     //  heap���� : �̼��� : �޸� �ּ�(��, 1000)
		String str1 = "�̼���"; // stack���� str1 : 1000�ּ�
		// �ּҰ� ����Ǵ� ������ �ּҺ��� : ��������
		// �������� : ���ڿ�, �迭, ������
		int [] i1 = {1,2,3,4,5}; // stack����  i1 : 2000�ּ�
		                         // heap 1,2,3,4,5 : 2000
		System.out.println(i1);
		System.out.println(i1[0]); // 2000[0]
		System.out.println(i1[1]); // 2000[1]
		System.out.println(i1[2]); // 2000[2]
		
		
	}
}
