package 클래스;

public class StringEqual {

	public static void main(String[] args) {
		String s1 = "hello";					//상수
		String s2 = "hello";
		
		String s3 = new String("hello");		//new ==> 힙에 저장 , new가 아니면 전부 상수에 저장
		String s4 = new String("hello");		
		
		System.out.println(s1==s2); 			//true
		System.out.println(s3==s4);				//false
		System.out.println(s1==s3);				//false
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		StringBuffer sb = new StringBuffer("hello world");
		sb.insert(5,"!!!");
		System.out.println(sb.toString()); //toString은 생략가능
		sb.replace(0, 5, "hi");
		System.out.println(sb.toString());
		System.out.println(sb.toString().equals(sb)); //insert가 적용  -> replace 적용 -> 출력
		
	}

}
