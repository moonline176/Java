package 백준;

import java.util.Scanner;

public class 백준10871 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int[] arr = new int[a];
		

		for (int i = 0; i < a; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < b) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}