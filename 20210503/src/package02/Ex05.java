package package02;

public class Ex05 {
	public static void main(String[] args) {
		String f = "12.4";
		Float f1 = Float.parseFloat(f); //���ڿ��� �Ǽ��� 12.4�� �Ľ̽�ų�� ����
		System.out.println(f1 + 20.5);
		
		Float f2 = new Float(f);	
		System.out.println(f2 + 20.5);
		
		//float�� ������ �ִ� ���� ������ ��������
		System.out.println("byte : " + f1.byteValue()); //12
		System.out.println("byte : " + f1.longValue()); //12
		System.out.println("byte : " + f1.shortValue()); //12
		System.out.println("byte : " + f1.intValue()); //12
		
		System.out.println("MAX �� " + Float.MAX_VALUE); //3.4028235E38
		System.out.println("MAX �� " + Float.MIN_VALUE); // 1.4E - 45
	
		
	}
}
