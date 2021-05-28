package co.yedam.score;

public class ArrayApp {
	int[] arr = new int[10];
	
//	void init() {
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//					}
//		System.out.println(arr[i]);
//	}
//	
	void print() {
		//합계
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		System.out.println(result);
	}
	
	void total() {
		int result = 0;
		//for : 합계 계산
		for (int i=0; i<arr.length; i++) {
			result = result + arr[i];
		}
		System.out.println(result);
	}
	
	void max() {
		int max=arr[0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}