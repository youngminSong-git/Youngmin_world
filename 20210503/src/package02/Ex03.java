package package02;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 �⺻ �ڷ���  : byte, char, short, int, long, float, double, boolean
		 ���� : ��ȯ�ϱ� ���� ����
		������ ���ڷ� ��ȯ�ϰ� ���� ��, �⺻ �ڷ��������� ������ ���ڷ� ��ȯ�� �� ����. ���������� �Ǽ��� �ο�Ÿ�Ե� ���ڷ� ��ȯ �Ұ���
		�׷� ������ �����ϱ� ���� ����� �� �� -> ����Ŭ����(wrapper class) 
		�⺻ �ڷ����� ���ڿ��� ��ȯ�ϰ� ���ڿ��� �⺻�ڷ������� ��ȯ�� �����ϰ� �ؾ���
		 */
		
		//wrapper class
		int i = 10;
		Integer i1 = 10;
		
		short s = 10;
		Short s1 = 10;

		byte b = 12;
		Byte b1 = 12;
		
		long l = 10L;
		Long l1 = 10L;

		float f = 10.5f;
		Float f1 = 10.5f;
		
		double d = 10.5;
		Double d1 = 10.5;
		
		boolean b2 = true;
		Boolean B1 = true;
		//�׳� �ڷ��� == �ձ��� �ҹ���, �����ڷ��� == �ձ��� �빮��
		
		Integer i2 = 100; //�ڽ��̶�� ��
		int i3 = i2; //�����ڷ����� �⺻�ڷ����� �ִ°� == ��ڽ�
		
		//int i3 = null; == X//�����ڷ����� ��� null���� ���� ����
		//Wrapper�ڷ����� null���� �����ϱ� ���ؼ� ����Ѵ�.
		//���ڿ��� ��ȯ�ϱ� ���ؼ� ���
		
	
		
	}
}
