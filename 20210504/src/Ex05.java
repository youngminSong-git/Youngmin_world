import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//filereader == ���� ������ �о���� ��
		FileReader fr = null;
		try {
			fr = new FileReader("d:\\java\\fileWriter.txt");
			int readChar;
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
		} catch(IOException e) {
			e.printStackTrace();//����Ȯ�� �ҽ�;
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				
			}
		}
	}
}