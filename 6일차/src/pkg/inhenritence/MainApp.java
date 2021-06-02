package pkg.inhenritence;

public class MainApp {

	public static void main(String[] args) {

		A a = new D(); //자동형변환
		int temp = ((D)a).sd; //강제형변환
		
		A o = new A(); 
		temp = ((D)a).sd; //X 런타임 오류
		
//		a = new B();
//		a = new D();
//		
//		B b = new D();
//		Z x = new D();
//		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof D);
		System.out.println(a instanceof X);
//		B b = new B();
//		b = new D();
		//b = new C(); => 타입변환 불가능
	}

}
