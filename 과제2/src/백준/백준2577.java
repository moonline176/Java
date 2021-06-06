package 백준;

import java.util.Scanner;

public class 백준2577 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int sum = (a*b*c);
		String str = Integer.toString(sum);//toString복습
		
		for(int i=0; i<9; i++) {
			int cnt = 0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0'==i)) { //charAt복습
					cnt++; //문자열 첫번째 == '0' ? yes => cnt++ 아니면 다음으로넘어감
				}
			}
			System.out.println(cnt);
		}
	}
	
	
	
	
}
