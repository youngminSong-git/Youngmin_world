package package10;

public class KumhoTire extends Tire{ // 
	public KumhoTire(String location, int maxRotation) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation ++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " ��ȣ tire ���� " + (maxRotation - accumulatedRotation));
			return true; // return�� ��ȯ���� ��� �Լ��� ���� ���� ��ų ���� �ִ�.
		}else {
			System.out.println(location + "��ȣ Tire ��ü�ϼ���");
			return false;
		}
	}
}
