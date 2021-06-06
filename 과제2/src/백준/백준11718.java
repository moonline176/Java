package 백준;

import java.util.Scanner;

public class 백준11718 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine());{ //다음 엔터를 기준으로 문자열이 있는지 확인 후 boolean을 리턴
			String a = scanner.nextLine();  // 라인을 기준으로 문자열 입력받음(줄넘김\n기준)
			System.out.println(a);  // hasNext:다음 공백을 기준으로 문자열이 있는지 확인 후 boolean을 리턴
		}
		scanner.close();
	}
}
