package inheritance;

public class Ex22Test {

	public static void main(String[] args) {
		Ex22 ex = new Ex22(20, 10, "�׽�Ʈ");
		System.out.println(ex.subject);
		int result = ex.add();
		System.out.println(result);
		result = ex.div();
		System.out.println(result);
		
		Ex22 ex1 = new Ex22(0, 20,"�׽�Ʈ1");
		System.out.println(ex1.subject);
		result = ex1.add();
		System.out.println(result);
		result = ex1.div(); // 0 / 20 : ����
		System.out.println(result); 
		
		Ex22 ex2 = new Ex22(20, 0 ,"�׽�Ʈ2");
		System.out.println(ex1.subject);
		result = ex2.add();
		System.out.println(result);
		result = ex2.div(); // 20 / 0 : �Ҵ�
		System.out.println(result);
		
		
		
	}

}
