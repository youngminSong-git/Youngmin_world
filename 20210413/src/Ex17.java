
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�� ����� ����
		int i [] = {10,20,30};
		int i1[];
		i1 = new int[] {10,20,30};
		int i2[] = new int[3]; // �迭�� ũ�⸦ ���
		i2[0] = 10;
		i2[1] = 20;
		i2[2] = 30;
		
		int i3[];
		i3 =  new int[3];
		i3[0] = 10;
		i3[1] = 20;
		i3[2] = 30;
		
		int i4[];
		i4 =  new int[3]; // �迭�� ��������� �������� 0���� �ʱ�ȭ�Ǿ� �ִ�.
		System.out.println(i4[0]);
		System.out.println(i4[1]);
		System.out.println(i4[2]);
		
		long i5[];
		i5 =  new long[3];
		System.out.println(i5[0]);
		System.out.println(i5[1]);
		System.out.println(i5[2]);
		
		float i6[];
		i6 =  new float[3];
		System.out.println(i6[0]);
		System.out.println(i6[1]);
		System.out.println(i6[2]);
		
		double i7[];
		i7 =  new double[3];
		System.out.println(i7[0]);
		System.out.println(i7[1]);
		System.out.println(i7[2]);
		
		boolean i8[];
		i8 =  new boolean[3]; // false
		System.out.println(i8[0]);
		System.out.println(i8[1]);
		System.out.println(i8[2]);
		
		int [] i9 = {1,2,3,4,5,6,7,8,9,10};
		/// �迭�� ũ�⸦ Ȯ��		
		System.out.println(i9.length); //10
		// �迭 i9�� �ִ� ����� ���� ���Ͻÿ�.
		int sum = 0;
		for(int j = 0 ; j < 10; j++ ) {
			sum += i9[j];
		}
		System.out.println(sum);
		
		sum = 0;
		for(int j = 0; j < i9.length ;j++ ) {
			sum += i9[j];
		}
		System.out.println(sum);
		
	}

}
