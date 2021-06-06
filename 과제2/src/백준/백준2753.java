package 백준;

import java.util.Scanner;

public class 백준2753 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
