package package5;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println(" KumhoTire�� ��ü");
			return false;
		}else {
			System.out.println(
		" KumhoTire�� ������ : " + (maxRotation-accumulatedRotation));
			return true;
		}
	}
}
