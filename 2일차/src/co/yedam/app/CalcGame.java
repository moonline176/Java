package co.yedam.app;
/*
 * 계산기 게임
 * 사칙연산, 진수변환, 문자값 검사 
 */

import java.util.Scanner;

public class CalcGame {
	double a;
	double b;
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		String s1 = scanner.next();
		System.out.print("입력:");
		String s2 = scanner.next();
		
		a = Double.parseDouble(s1); //string -> double
		b = Double.parseDouble(s2);
	}
	//정수값 두 수의 합을 계산하는 메서드(함수)
	double add() {
		return a+b;
	}
	// 두수의 몫을 계산 5/2 2 
	int share() {
		return (int)(a/b);
	}
	// 두 수의 나눗셈 계산 5/2 2.5
	double div() {
		return a/(double)b;
	}
	// 두 수의 나머지 연산
	int rest() {
		return (int)(a%b);
	}
	
}