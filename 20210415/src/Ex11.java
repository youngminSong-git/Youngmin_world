
public class Ex11 {
	
	public static void main(String[] args) {
		// ������ �ڷ������� ����Ҽ� �ִ� �޼���
		// name() :  ���ڿ� ������ �޾ƿ��� �޼���
		// ordinal() : ���� ����� ���ڸ� ������ 
		// compareTo() : ���ϴ� ���� �յڷ� �󸶳� �ָ� �ִ� ��
		// valueOf() : �ش� ���ڿ��� �������� �ִ� Ȯ���Ͽ� ����� ������
		// values() : ���� ����� ��� ������
		
		Week today = Week.SUNDAY;
		System.out.println(today);
		String name = today.name(); // �������� ���ڿ� ������
		System.out.println(name);
		
		/// �������� ���� ����� ���ڸ� �������� 
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 6
		
		// compareTo
		Week day1 = Week.TUESDAY;
		Week day2 = Week.THURSDAY;
		//            1              3 : 1 - 3 = -2
		int result = day1.compareTo(day2); // -2
		System.out.println(result); // -2
		     //    3             1 : 3 - 1 : 2 
		result = day2.compareTo(day1);
		System.out.println(result); // 2
		
		String day = "THURSDAY";
		Week weekDay = Week.valueOf(day);
		System.out.println(weekDay);
		/* ���� �߻�
		day = "THURS";
		weekDay = Week.valueOf(day);
		System.out.println(weekDay);
		*/
		
		// values
		Week day3 = Week.FRIDAY;
		Week [] days = Week.values();
		for(Week wk : days) {
			System.out.println(wk);
		}		
	}
}
