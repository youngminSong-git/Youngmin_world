package package02;

public class Ex04Test {
	public static void main(String[] args) {
		String s1 = "123";
		
		Integer i1 = Integer.parseInt(s1); //�Ľ�, �̹�� �ַ� �����
		Integer i2 = new Integer(s1);
		System.out.println(i1);
		System.out.println(i2);
		
		/*
		 * String s2 = "10.5"; 
		 * Integer i3 = Integer.parseInt(s2); //s2�� �Ľ��Ѵ�
		 * System.out.println(i3); //10.5�� �Ǽ��� int�� ��ȯ�� �����ٶ�� ����. ����
		 */	
		
		String s2 = "10.5";
		int i4 = 123;
		
		if(i4 == i1) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(i1.equals(i4)) { //�Ϲ��ڷ����� Wrapper�ڷ����� equals�� ��
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		System.out.println("Max �� : " + Integer.MAX_VALUE); //2147483647
		System.out.println("Max �� : " + Integer.MIN_VALUE); //-2147483648
	}
}
