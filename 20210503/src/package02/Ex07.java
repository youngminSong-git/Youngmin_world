package package02;

public class Ex07 {
	public static void main(String[] args) {
		String str = "100";
		
		Integer i1 = Integer.parseInt(str);
		System.out.println(i1);
	
		Integer i2 = new Integer(str);
		System.out.println(i2);
		
		Integer i3 = Integer.valueOf(str);
		System.out.println(i3);
		//�� ����(i1 ~ i3)�� ���� ��ɾ��̸�, �ڽ��̶�� �Ѵ�.
		
		//��ڽ�(unboxing)
		int ii1 = i1;
		int ii2 = i1.intValue(); //wrapper�ڷ����� �ִ� ���� �⺻�ڷ������� ������ �� = ��ڽ�
		System.out.println(ii1);
		System.out.println(ii2);
		
		String str1 = "true";
		Boolean b = Boolean.parseBoolean(str1);
		if(b) {
			System.out.println("�οﺯȯ");
		}
	}
}
