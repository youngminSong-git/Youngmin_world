import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//�����͸� �����ϴ� ���
		/*
		 1. ������ �̿��ϴ� ��� (�⺻ �ڷ����� �̿��� ����) 
		 2. ���� �ڷ����� ������ ������ �� �ִ� �迭 / �迭�� ���� : ũ�Ⱑ ������ �־�� ��.(ũ�Ⱑ ���� ��� �Ұ���)
		 3. �ٸ� ������ �����͸� ������ �� �ִ� Ŭ���� / class �迭 ��������
		 */
		//2�� ex)
		//int i[] = new int[]; //X
		int i[] = new int[3]; //O
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		
		//ũ�Ⱑ ������ ���� ���� �迭�� ���� ������� �����ϰ� ���� ��, ũ�Ⱑ ���� ������ �ڷ��� ����  ==> Map
		//map
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "����"); //key, value �Է�. ���� �Է��� Int, String �ڷ����� �ش��ϴ� �͵� �־��ָ� ��.
		map.put(2, "����1"); 
		map.put(3, "����2"); 
		map.put(4, "����3"); 
		map.put(5, "����4");
		map.put(5, "����4");
		map.put(5, "����4");
		map.put(5, "����5");
		
		System.out.println(map.get(2)); //2,����1
		System.out.println(map.size()); //5���ϱ� 5
		System.out.println(map.get(5)); //5,����5 ==> Ű�� �ߺ����� �ʴ´�. ����Ű�� ���� ���� 5���� ���޾� �� ������ ���� ���´�.
		
		
		//map�� ������ �ִ� ��� Ű�� �˰� ������.
		Iterator<Integer> keys = map.keySet().iterator(); //key���� �������� ������ ����ϴ°� ==> keyset(); ����� iterator()���·� ������ �־�� ��.
		
		//key�� ������������ �ݺ��ض�
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
	}
}
