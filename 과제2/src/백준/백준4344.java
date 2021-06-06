package 백준;

import java.util.Scanner;

public class 백준4344 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double avg = 0;
		int tc = scanner.nextInt();
		
		int[] arr = new int[1000]; //왜 tc로하면 에러가 나는것인가?
		int a = 0;
	
		for (int i = 0; i < tc; i++) {
			int cnt = 0;
			int total = 0;
			a = scanner.nextInt();
			for (int j = 0; j < a; j++) {
				arr[j] = scanner.nextInt();
				total += arr[j];
			}
			avg = (double)total/a;
			for (int j = 0; j < a; j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",100.0*cnt/a);
		}
		scanner.close();
	}
}
