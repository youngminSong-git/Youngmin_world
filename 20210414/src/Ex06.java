
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1[] = {1,2,3,4,5};
		int i2[] = {11,22,33,44,55};
		int i3[] = {12, 13, 14, 15, 16};
		// ���� ó�� ǥ���·� �Ǿ� �ִ� ���� 2���� �迭
		// �������迭�̶� 1�����迭�� ���̸� 2�����迭�̵Ǵ� ���� ���Ѵ�.
		int i[][] = new int[3][];
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		System.out.println(i1[0]);
		System.out.println(i[0][0]);
		System.out.println(i2[0]);
		System.out.println(i[1][0]);
		// 15
		System.out.println(i[2][3]);
		
		System.out.println(i1.length);
		System.out.println(i[0].length);
		System.out.println(i2.length);
		System.out.println(i[1].length);
		System.out.println(i.length); // 2���� �迭�� ũ��� 1�����迭�� ����
	}

}
