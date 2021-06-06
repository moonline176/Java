package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class 백준15552 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," "); //StringTokenizer 문자열을 분리하는 클래스 / br.readLine()으로 읽은 값들을 " "을 기준으로 나눔
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n"); //출력문
		}
		br.close();
        
		bw.flush(); //FileWriter 사용후 flush()와 close()동시 호출 필요 
		//flush() : FileWriter 내부 버퍼의 내용을 파일에 writer합니다. flush()를 호출하지 않는다면 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황이 나올 수 있습니다.
		bw.close(); //close() : FileWriter는 스트림을 이용하여 파일의 내용을 읽어들입니다. 이때 close()를 호출하여 스트림을 닫으면 그 스트림을 다시 이용하여 파일에 쓰는 것이 불가능합니다.


	}

}
