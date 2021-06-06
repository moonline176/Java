package 백준;

import java.util.Scanner;

public class 백준10818 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] arr = new int[a];
		int max = -1000000;
		int min = 1000000;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
