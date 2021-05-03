package package02;

import java.util.*;

public class Ex09Test {
	//�ζǸ����
	public static void main(String[] args) { 
		List<Integer> map = new ArrayList<Integer>(); //����Ʈ ����

		for(int i = 1; i <= 45; i++) {
			map.add(i); //1~45���� �ʿ� ����
		} //�� ������ ũ�� ���� == 45
		
		int lotto[] = new int[6]; //6�� �迭����
	
		for(int i = 0; i < lotto.length; i++) {
			//����Ʈ�� index�� ���������� ������ ��
			int num = (int)(Math.random() * map.size()); //45�߿� �ϳ� ��������
			lotto[i] = map.get(num); //lotto �迭�� list�� ����
			map.remove(num); //���� �ߺ� ������ ���� num ����, value key�� ���� ����
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
