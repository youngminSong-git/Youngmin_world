
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ���� ���
		int i [] = {1,2,3,4,5};
		int i1 []; // stack   i1 : null
		i1 = new int[] {1,2,3,4}; // heap  : �迭�� ������� : 
		                          // i1 = heap������ �ּ�
		    // new ������ : heap������ �����Ҵ� 
		int i2[] = new int[5]; // �迭�� ũ�� 5 : index 0,1,2,3,4
		                       // heap������ ������ �Ҵ� ����
		// heap������ �ִ� �迭�� �����͸� ����
		i2[0] = 1;
		i2[1] = 2;
		i2[2] = 3;
		i2[3] = 4;
		i2[4] = 5;
		//i2[5] = 6;(x)
		for(int j = 0; j <= 4; j++) {
			System.out.println(i2[j]);
		}
		System.out.println("�迭 i2�� ũ�� : " + i2.length); // 5
		// �迭��.length : �迭�� ũ�� 
		int i3[];
		i3 = new int[4];
		i3[0] = 1;
		i3[1] = 2;
		i3[2] = 3;
		i3[3] = 4;
		/// �迭�� ũ�� Ȯ��
		System.out.println(i3.length); // 4
		for(int j = 0; j < i3.length; j++) {
			System.out.println(i3[j]);
		}	
	}
}
