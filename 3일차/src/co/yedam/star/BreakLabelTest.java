package co.yedam.star;

public class BreakLabelTest {

	public static void main(String[] args) {
		Outer: 
		for(int i=0;i<9;i++); {
			for(int j=0; j<9;j++) {
				System.out.println(j*i);
				if(j==2) {
					break; 
				}
			}
		}
		System.out.println("end");
	}
}
