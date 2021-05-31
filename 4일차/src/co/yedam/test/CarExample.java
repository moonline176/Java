package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		//2. 객체생성(인스턴스)
		Car myCar = new Car();
		myCar.company="벤츠";
		myCar.color="red";
		System.out.println("제조회사: "+myCar.company);
		System.out.println("속도: "+myCar.speed);
		
		//생성자
		Car youCar = new Car("르노","SM6","블루");
		System.out.println(youCar);
		
		//"코나,100"
		Car miniCar = new Car("코나",100);
		System.out.println(miniCar);
		
	}
}