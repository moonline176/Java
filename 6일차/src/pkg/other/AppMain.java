package pkg.other;

import pkg.Car; //*로 패키지명을 생략할 수 있으나 전부 구별해주는 것이 좋다
import pkg.Count;
import pkg.DateUtil;
import pkg.Projectinfo;

public class AppMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("현대");
		car.setSpeed(100);
		
		Car car2 = new Car("삼성",50);
		Car car3 = new Car("삼성");
		
		System.out.println(DateUtil.curDate());
		System.out.println(Projectinfo.name);
		
		Count count1 = new Count();
		Count.cnt1++;
		count1.setCnt(count1.getCnt2()+1);
	}
	

}
