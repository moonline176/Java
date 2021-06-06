package co.yedam.app.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBallApp {
/*
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라익, 볼 카운터 
 */
	
	int s;
	int b;
	int c1,c2,c3;
	int u1,u2,u3;
	Random random = new Random();
	
	void makeRnd() { // 난수 중복제거 필요!!
		c1 = (int)(Math.random()*9)+1; //랜덤생성
		c2 = (int)(Math.random()*9)+1;
		while(c1==c2) {
			c2 = (int)(Math.random()*9)+1;
			}//랜덤생성
		c3 = (int)Math.random()*9+1;
		while(c3==c2||c3==c1) {
			c3 = (int)(Math.random()*9)+1;
		}//랜덤생성
		
	}
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("user:");
		u1 = scanner.nextInt();//입력
		u2 = scanner.nextInt();//입력
		u3 = scanner.nextInt();//입력
	}
	void count() {
		
		if (c1 == u1){
			s += 1;
		} else if (c1 == u3 || c1 == u2) {
				b += 1;//s,b 카운터 if구문 이용
		}
		if (c2 == u2){
			s += 1;
		} else if (c2 == u3 || c2 == u1) {
			b += 1;//s,b 카운터 if구문 이용
		}
		if (c3 == u3){
			s += 1;
		} else if (c3 == u1 || c3 == u2) {
			b += 1;//s,b 카운터 if구문 이용
		}

	}
	void start() {
		
		makeRnd();
		while(s<3) {
			s=b=0;
			input();
			count();
			System.out.println(s+"S"+b+"b");
		}
		System.out.println("3스트라이크! 아웃!!");
		
	}
	
}
