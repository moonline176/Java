package 백준;

import java.util.Scanner;

public class 백준2739 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
}
