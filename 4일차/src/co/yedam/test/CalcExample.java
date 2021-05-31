package co.yedam.test;

public class CalcExample {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.turnOn();
		calc.sum(10, 20); //int값으로 입력을 해도 메소드를따라
		calc.sum(10.5, 20.4); //메서드명칭이 같아도 객체 타입에 따라 자동 변환됨
		int r = calc.sum2(100,200);
		System.out.println(r);
		System.out.println(calc.sum3(1,2,3));
		System.out.println(calc.sum3(1,2,3,4,5,6,7));
		
	}

}
