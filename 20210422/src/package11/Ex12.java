package package11;

public class Ex12 extends Ex11{
	public Ex12(int year) {
		super(year);
	}
	
	public boolean roll() {
		minus ++;
		if( minus < period ) {
			System.out.println(" Ŀ�Ǻ��  ��� �Ⱓ ���Դϴ�.");
			return true;
		}else{
			System.out.println(" Ŀ�Ǻ��  ���Ⱓ�� ����Ǿ����ϴ�.");
			return false;
		}
	}
}
