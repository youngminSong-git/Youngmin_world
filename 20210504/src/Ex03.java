import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		FileWriter fw = null; //������ �о���� �ڷ���
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("d:\\java\\bufferwriter1.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter �׽�Ʈ");
			bw.newLine();
			bw.write("�ȳ��ϼ���." + System.getProperty("line.separator"));
			bw.write("������ ���Դϴ�.");
			bw.flush(); //���� ��Ÿ���� ����� �ִ� ��
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch(IOException e) {
					
				}
			}
		}
	}
}
