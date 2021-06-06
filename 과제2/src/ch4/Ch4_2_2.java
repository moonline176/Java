package ch4;

public class Ch4_2_2 {
	public static void main(String[] args) {
		
		int a = 0;
		
		for(int i=1;i<101;i++) {
			if(i%3 == 0) {
				a += i;
			}
		} System.out.println(a);
		
	}
	
}