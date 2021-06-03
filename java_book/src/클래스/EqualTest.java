package 클래스;

public class EqualTest {

	public static void main(String[] args) {
		Robot r1 = new Robot(2,4);
		Robot r2 = new Robot(1,4);
	
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		System.out.println(r1);
		//r1 == r2는 (힙)주소비교, 
		//결과값은 같을 수 있으나 (힙)주소값이 다르기 때문에 false로 나타남  
		
		String a = new String("hello");
		String b = new String("hello");
//		String b = a; //true
		System.out.println(a==b); //이것도 false
		System.out.println(a.equals(b));
	}

}