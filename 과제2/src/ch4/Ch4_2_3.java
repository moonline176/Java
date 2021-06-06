package ch4;

public class Ch4_2_3 {
	public static void main(String[] args) {

		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			System.out.println("(" + a + "," + b + ")");
			if ((a + b) == 5) {
				break; //눈의 합이 5가 되기전까지 계속 반복실행
			}

		}

	}
}