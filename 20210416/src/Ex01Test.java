
public class Ex01Test {

	public static void main(String[] args) {
		int [] i = new int[5];
		Ex01 ex = new Ex01(); // default ������
		ex.name = "�̼���";
		ex.age = 25;
		ex.height = 175.5;
		ex.addr = "����";
		
		System.out.println(ex.name);
		System.out.println(ex.age);
		System.out.println(ex.height);
		System.out.println(ex.addr);
		
		Ex01 ex1 = new Ex01();
		ex1.name = "������";
		ex1.age = 21;
		ex1.addr = "����";
		ex1.height = 160.5;
		
		Ex01 ex2 = new Ex01();
		ex2.addr = "����";
		ex2.age = 17;
		ex2.height = 173.5;
		ex2.name = "�̻��";
		
			
		
		/// �������� �̿��ؼ� ���� ����� �����͸� �����ϴ� ���
		String name;
		name="�̼���";
		int age;
		age= 25;
		double height;
		height = 172.5;
		String addr;
		addr = "����";
		
		String name1;
		name1= "������";
		int age1;
		age1 = 21;
		double height1;
		height1 = 160.5;
		String addr1;
		addr1="����";
		
		String name2;
		name2= "������";
		int age2;
		age2 = 21;
		double height2;
		height2 = 160.5;
		String addr2;
		addr2="����";
	}
}
