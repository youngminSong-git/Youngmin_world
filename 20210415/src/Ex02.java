
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i = new int[3]; // index : 0���� ����
		// �迭�� ũ�� 3�̸� index�� 0,1,2���� �̹Ƿ� index�� �迭�� ũ�⺸�� 1�۴�.
/*		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);*/
		System.out.println(i.length); // �迭�� ũ��
		for(int index = 0; index < i.length; index++) {
			System.out.println(i[index]);
		}
		long l [] = new long [3];
		for(int idx = 0; idx < l.length; idx++) {
			System.out.println(l[idx]);
		}
		float f1[] = new float[3];
		for(int idx = 0; idx < f1.length ; idx++) {
			System.out.println(f1[idx]);
		}
		double d [] = new double[3];
		for(int idx = 0; idx < d.length ; idx++ ) {
			System.out.println(d[idx]);
		}
		boolean [] b = new boolean[3];
		for(int idx = 0; idx < b.length; idx++) {
			System.out.println(b[idx]);
		}
	}

}
