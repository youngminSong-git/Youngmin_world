
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ͳ� : �ڿ��� , �ѱ���, �Ϻ���, ����,..., ����
		// ���ͳ� ���� ���� �ϱ� ���ؼ� �ڷ���.
		// ������ ���ͳ�: 10, 1, 2,... 
		//            ���� �ڷ��� : int , long
		// �Ǽ��� ���ͳ� : 0.5, 168.5
		//            �Ǽ��� �ڷ��� : float, double
		// ���� ���ͳ� : true, false
		//            ���� �ڷ��� : boolean
		
		/////// �⺻ �ڷ���: ���� ���� �����ϰ� �ִ� �ڷ���
		/// stack���� �����Ͱ� ����
		// stack ������ �ִ� �����ʹ� ������ ������ �񱳰� �����ϴ�.
		int i = 10; 
		double d = 10.5;
		boolean b = true;
		int j = 10;
		int k = 10;
		int l = 10;
		if(i == j) {
			System.out.println("����.");
		}
		double d1 = 10.5;
		
		/// ����� ������ ��� stack ������ ���������.
		/// ������ �ڷ��� : ���� ���� �����ϰ� ���� �ʴ�.
		/// �ּҸ� �����ϰ� �ȴ�. �ּ� ����
 		// ���ڿ� ���ͳ� : "�̼���"
		//            ���ڿ� �ڷ��� : String		
		String name1 = "�ſ��";
		String name2 = "�ſ��";
		/// ���ڿ� �����ʹ� heap������ ������ ����.
		/// ������ stack 
		if(name1 == name2) {
			System.out.println("�ּҰ� ����.");
		}
		// ������ �ڷ��� : ���ڿ� �ڷ���
		//             �迭 �ڷ���
		//             ���� �ڷ���
		if(name1.equals(name2)) {
			System.out.println("�����Ͱ� ����.");
		}
		
	}
}
