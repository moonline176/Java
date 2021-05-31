package co.yedam.test;

//클래스 : 필드 + 메소드 + 생성자
public class Calc {

	//on	1. 리턴 x, 매개변수 x
	void turnOn() {
		System.out.println("계산기");
	}
	
	//덧셈 2. 리턴 x, 매개변수 o 
//	void sum(int a, int b) {
//		System.out.println("int 메서드");
//		System.out.println("두수의 합: "+(a+b));
//	}
	void sum(double a, double b) {
		System.out.println("double 메서드");
		System.out.println("두수의 합: "+(a+b));
	}
	
	//3.리턴 o, 매개변수 o
	int sum2(int a, int b) {
		return a+b;
	}
	
	//4.가변인수 
	int sum3(int...arr) {
		int result = 0;
		for (int i=0; i<arr.length; i++) {
			result = result + arr[i];
		}
		return result;
		
	}
}
