package package5;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		while(true) {
			int tireChange = car.run(); // tire��ġ ��ȣ
			switch(tireChange) {
			case 1:
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�� ������ Ÿ�̾ ��ü");
				car.frontRightTire = new HankookTire("�� ������", 13);
				break;
			case 3:
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.backLeftTire = new KumhoTire("�� ����" , 14);
				break;
			case 4:
				System.out.println("�� ������  Ÿ�̾ ��ü");
				car.backRightTire = new KumhoTire("�� ������" , 12);
				break;			
			}
			if (tireChange != 0) break;
		}
	}
}