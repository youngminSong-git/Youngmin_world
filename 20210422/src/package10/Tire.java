package package10;

public class Tire {
	public int maxRotation; 
	public int accumulatedRotation;
	public String location; // �տ� �տ� �ڿ� �ڿ�
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	public boolean roll() {
		accumulatedRotation ++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " tire ���� " + (maxRotation - accumulatedRotation));
			return true; // return�� ��ȯ���� ��� �Լ��� ���� ���� ��ų ���� �ִ�.
		}else {
			System.out.println(location + "Tire ��ü�ϼ���");
			return false;
		}
	}	
}