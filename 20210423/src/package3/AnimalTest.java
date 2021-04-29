package package3;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Bird bird = new Bird();
		cat.breathe();
		cat.sound();
		
		bird.breathe();
		bird.sound();
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null ; // new Animal(); // �θ�  Ŭ����
		animal = new Cat();
		animal.breathe();
		animal.sound();
		
		animal = new Bird();
		animal.breathe();
		animal.sound();
		
		animalSound(new Cat()); // �߿�
		animalSound(new Bird()); // ±±
		
		print(1);
		print(100);
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	public static void print(int i) {
		System.out.println(i);
	}

}
