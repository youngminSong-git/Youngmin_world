package package10;
// ��ü������ 3���� : ĸ��ȭ , ���, ���⼺
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		Car car = new Car();
		boolean stop = false;
		while (!stop) { 
			int num = car.run(); // Ÿ�̾��� ��ġ
			switch(num) {
			case 1: // �տ���
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.frontLeftTire = new KumhoTire( "�տ���", 15);
				/// ��ü ���⼺
				break;
			case 2: // �տ�����
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.frontRightTire = new KumhoTire( "�տ�����", 15);
				//    tire �θ�                 // tire �ڽ�
				break;
			case 3: // �ڿ���
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.backLeftTire = new HankookTire ( "�ڿ���", 15);
				break;
			case 4: // �ڿ�����
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.backRightTire = new HankookTire( "�ڿ�����", 15);
				break;
			}
			number --; // 5,4,3,2,1,0
			if(number == 0) stop = true;
		}
	}
}
