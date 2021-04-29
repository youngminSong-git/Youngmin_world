package package10;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation ++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " �ѱ� tire ���� " + (maxRotation - accumulatedRotation));
			return true; // return�� ��ȯ���� ��� �Լ��� ���� ���� ��ų ���� �ִ�.
		}else {
			System.out.println(location + " �ѱ� Tire ��ü�ϼ���");
			return false;
		}
	}
}
