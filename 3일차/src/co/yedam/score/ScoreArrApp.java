package co.yedam.score;
//1. 클래스 설계도(UML)
//2. 클래스 선언
public class ScoreArrApp {

	
	int[] arr = {90,90,50};
	
	void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	int total() {
		int result = 0;
		//for : 합계 계산
		for (int i=0; i<arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}
	double avg() {
		double result = 0;
		result = (double)total()/arr.length; //평균 로직
		// (타입) vs 타입 차이점
		// 괄호가없는 경우 = 첫 변수선언
		// 괄호 있는 경유 = 이후 선언된 변수를 일시적으로 다른타입으로 변환
		return result;
	}
	void printH() {
		System.out.printf("%s\n국어:%d\t영어:%d\t수학:%d\n","홍길동성적",arr[0],arr[1],arr[2]);
	}
}
