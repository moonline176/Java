package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class BufferTest {

	public static void main(String[] args) {
		try {
			BufferedReader fr = new BufferedReader(new FileReader("E:/temp/score.txt"));
			PrintStream out = System.out;
			String a;
			while(true) {
				a = fr.readLine();
				if(a == null) break;
				String[] score = a.split(" ");
				out.println(Integer.parseInt(score[0])+Integer.parseInt(score[1])); // score 문자열 ==> 상수형으로 변환
				out.println(a);
			}
			fr.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
