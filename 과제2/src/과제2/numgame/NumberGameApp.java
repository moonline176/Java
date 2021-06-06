
package 과제2.numgame;

import java.util.Random;
import java.util.Scanner;

public class NumberGameApp {
	Random random = new Random();
	// 컴 임의의수
	int com; // 컴퓨터가 만든 수(1~10)
	int user;// 사용자가 입력한 값

	void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("범위 입력:");
		com = (int) (Math.random() * scanner.nextInt()) + 1;
	}

	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("user:"); // 사용자 수를 입력
		user = scanner.nextInt();// scanner를 이용해서 정수값 입력
	}

	// 높다/낮다 정답:true
	void confirm() {
		if (com != user) {
			if (com < user) {
				System.out.println("높다");
				// 다르면 높다/낮다 출력하고 false리턴
			}
			if (com > user) {
				System.out.println("낮다");
			}
		}
	}

	boolean confirmStart() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임다시시작?");
		char re = scanner.next().charAt(0);
		if (re == 'Y' || re == 'y') {
			return true;
		} else {
			System.out.println("끝");
			return false;
		}
	}

	boolean regame() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("다시 하시겠습니까?(y/n)");
			char r = scanner.next().charAt(0);
			if (r == 'Y' || r == 'y') {
				return false;
			} else {
				System.out.println("끝");
				return true;
			}
		}
	}
//	 "게임을 다시 시작하겠습니까?" y/n 작성 ==> 과제

	void start() {
		init();
		while (true) {
			input();
			confirm();
			if (com == user) {
				System.out.println("정답");
				break;
			}

		}

	}

}
