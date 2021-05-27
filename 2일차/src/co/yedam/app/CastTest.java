package co.yedam.app;

import java.util.Scanner;

/*
 * 형변환
 * byte < short < int < long
 * 
 * 스트링 <---> byte        Byte.parseByte(변수)
 * 			  short	      Short.parseShort
 * 			  int         Integer.parseInt
 *            long        ....
 *            float       ....
 *            double      .... 
 *            char        ....
 *            boolean     ....
 *       <---- 
 * String.valueOf      
 */


public class CastTest {
	
	public static void main(String[] args) {
		// 자동형변환
//		int a = 10;
//		long b = a;
//		
//		// 강제형변환
//		a = (int)b;
//		
//		//char(문자) <-> int(코드)
//		char c = 'Z';
//		System.out.println((int)c);
//		int d = 97;
//		System.out.println((char)d);
//		
//		//실수 -> 정수
//		double e = 10.5;
//		int f = (int)e;
//		System.out.println(f);
//		
//		//()구분 짓지 않은경우 좌측 계산 먼저
//		double g = 5 + 10.5;
//		String h = "hi" + 5;
//		System.out.println("hi" + 5 + 10 );
//		System.out.println( 5 + 10 + "hi");
//		
//		//정수 끼리의 연산결과 = 정수
//		//정수 하나의 타입을 실수형으로 바꾼경우 결과 값은 실수형
//		double i = 5/ (double)2;
//		System.out.println(i);
//		
//		//스트링 -> int 
//		String s1 = "123";
//		int j = Integer.parseInt(s1);
//		
//		//int -> 스트링
//		String s2 = String.valueOf(10.5);
//		System.out.println(s2);
//		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		String greet = scanner.next();
		System.out.println(greet);
		
		
	}

}
