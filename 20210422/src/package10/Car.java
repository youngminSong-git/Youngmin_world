package package10;

public class Car  {
	Tire frontLeftTire = new Tire(6, "�տ���"); //1
	Tire frontRightTire = new Tire(2, "�տ�����");  //2
	Tire backLeftTire = new Tire(3, "�ڿ���");  // 3
	Tire backRightTire = new Tire(4, "�ڿ�����"); //4
	
	public int run() {
		System.out.println("����~~~ �޷���.");
		if(frontLeftTire.roll() == false ) {stop();return 1;}
		if(frontRightTire.roll() == false ) {stop();return 2;}
		if(backLeftTire.roll() == false ) {	stop();	return 3;}
		if(backRightTire.roll() == false ) {stop();	return 4;}
		return 0; 
	}
	void stop() {
		System.out.println("�ڵ��� ����ϴ�.");
	}
}
