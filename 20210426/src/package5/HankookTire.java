package package5;

public class HankookTire extends Tire{
	/// �θ� Ŭ������ �����ڰ� �ִٸ� �ڽ� Ŭ������ �θ� Ŭ������ �����ڸ� ������ �� 
	// �ִ� �����ڸ� ����� �־�� �Ѵ�.
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println(" HankookTire�� ��ü");
			return false;
		}else {
			System.out.println(
		" HankookTire�� ������ : " + (maxRotation-accumulatedRotation));
			return true;
		}
	}
	
}
