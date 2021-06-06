package 백준;

import java.util.Scanner;

public class 백준2839 {

	public static void main(String[] args) {
		int cnt = 0;
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		while (true) {
			if (a % 5 == 0) {
				System.out.println(a / 5 + cnt);
				break;
			} else if (a<=0) { //백준은 a<=0을 해야 정답
				System.out.println(-1);
				break;
			}
			a -= 3;
			cnt += 1;

		}

	}

}
