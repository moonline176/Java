package co.yedam.app.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFileCopy { //p.597 ~ 613

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:/temp/data.txt");
			FileWriter fw = new FileWriter("E:/temp/data2.txt");
//			int c;
//			while(true) {
//				c = fr.read();
//				if(c == -1) break;
//				fw.write(c);
//			}
			char[] c = new char[100];
			while(true) {
				int cnt = fr.read(c);
				if(cnt == -1) break;
				fw.write(c);
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
