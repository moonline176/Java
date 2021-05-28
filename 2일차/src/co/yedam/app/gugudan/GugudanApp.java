package co.yedam.app.gugudan;

public class GugudanApp {
	
	int s;
	int e;
	

		//입력받은 단만 출력
		void printDan(int dan) {
			for(int i=1;i<=9; i++) {
				//2*1=2 ~ 2*9=18
			System.out.println(dan*i + "\t");
			}
		}
		void printRange(int s,int e) {
			for(int j=1; j<10; j++) {
				for(int i=s; i<e+1; i++) {
					System.out.print(i+"*"+j+"="+i*j+ "\t");
				}
				System.out.println();
			}
		}
		void printAll() {
			for(int j=1; j<10; j++) {
				for(int i=1; i<10; i++) {
					System.out.print(i+"*"+j+"="+i*j+ "\t");
				}
				System.out.println();
			}
			//9단까지 모두 출력
		}
		void printAllReverse() {
			
		}
	

}