public class Ex19 {
	// ����� ���ϴ� �ʴ� ��
	int i = 10;
	final int i1 = 10; // ���
	public void setValue(int i) {
		this.i = i;
		//this.i1 = i1; finalŰ���带 ������ ������ ���� �������� ���Ѵ�.
	}
	public void print() {
		System.out.println(i);
		System.out.println(i1);
	}
}