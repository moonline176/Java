package creator;
/*
 * 인터페이스 목적
 * 1. 다중상속
 * 2. public abstract 생략, 모든 메소드 추상메소드
 * 3. 개발표준 제시 
 * 4. 부모클래스를 상속 받아 자식클래스가 오버라이딩 하고 싶을때 사용
 */
public interface Flyer {
	void takeOff();
	void fly();
	void land();

}