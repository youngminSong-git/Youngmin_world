package package11;

public class Ex11 {
	int period;
	int minus;
	
	public Ex11(int period) {
		this.period = period;
	}
	
	public boolean roll() {
		minus ++;
		if( minus < period ) {
			System.out.println(" ��� �Ⱓ ���Դϴ�.");
			return true;
		}else{
			System.out.println(" ���Ⱓ�� ����Ǿ����ϴ�.");
			return false;
		}
	}
	
	
	
}
