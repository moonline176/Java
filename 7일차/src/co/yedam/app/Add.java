package co.yedam.app;

public class Add {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);  // parseInt():문자열 String타입의 숫자를 int타입으로 변환해줌
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 / value2);
		} catch (NumberFormatException e) {
			System.out.println("숫자입력");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2개입력");
		} catch (Exception e) { //Exception 이 전체를 포괄하는 예외문 이기 때문에 위치를 옮길 경우 나머지 예외들은 적용불가
			System.out.println(e.getMessage());
		}

	}

}
