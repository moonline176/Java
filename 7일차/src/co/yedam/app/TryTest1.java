package co.yedam.app;

import java.util.Scanner;

import sun.tools.tree.ArrayAccessExpression;

public class TryTest1 {

	public static void main(String[] args) {
		/// NullPointerException
		try {
			String s = null;
			System.out.println(s.charAt(0));
		} catch (Exception e) {
			System.out.println(e.getMessage()); //e.getMessage() : 에러의 원인을 간단하게 출력
//			e.printStackTrace();
		}

		System.out.println("the end");
		// ArrayIndexOutOfBoundsException
		try {
			int[] arr = new int[5];
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int a = 0;
		while (true) {
			try {
				System.out.println("입력>");
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
				if (a < 5) // 에러 발상시에 catch로 넘어감
					break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("a: " + a);
		System.out.println("the end");
	}
}
