package co.yedam;
/*
 * 클래스선언 -> new클래스 객체 생성 -> 필드나메서드 호출 실행
 * 1. 클래스 선언
 * class 이름 {   }
 */
public class Student {
	// 필드 + 메서드
	String name;
	String no;
	
	void print() {
		System.out.println(name + ":" + no);
	}
}
