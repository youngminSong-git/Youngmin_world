package package02;

public class Ex06Test {
	public static void main(String[] args) {
		String str = "123.5";
		Double d = new Double(str); //���ڿ� �Ǽ��� �ٲٰڴ�
		System.out.println(d); //���ڿ� �ƴ� 123.5 ���
		System.out.println(d.intValue());
		System.out.println(d.longValue());
		System.out.println(d.floatValue());
		
		
	}
}
