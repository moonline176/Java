package co.yedam.app;

public class CalcMain {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		try {
			c = Calc.div(a, b);
		} catch (Exception e) {
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
		System.out.println(c);
	}
}
