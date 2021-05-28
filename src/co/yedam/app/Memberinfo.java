package co.yedam.app;

import java.util.Scanner;

public class Memberinfo {

	String name;
	String id;
	String tel;
	double height;
	double weight;
	//키, 몸무게 
	double result = 0; //bmi 결과
    String s = "";


	
	
	void heightWeightInput() {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.키(key):");
		height = scanner.nextDouble();
		System.out.print("2.몸무게(kg):");
		weight = scanner.nextDouble();
		scanner.close();
	}
	 	String bmi() {
		result = weight/((height/100)*(height/100));
	    
	    if(result < 18.5) {
	        s = "저체중";
	    }
	    else if(result <= 23) {
	        s = "정상";
	    }
	    else if(result <= 25) {
	        s = "과체중";
	    }
	    else if(result <= 30) {
	        s = "비만";
	    }
	    else { 
	        s = "고도비만";
	    }
		return s;
	}
		
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		// 코드 작성
		System.out.print("1.이름:");
		name = scanner.next();
		System.out.print("2.주민번호 앞 6자리:");
		id = scanner.next();
		System.out.print("3.전화번호:");
		tel = scanner.next();
	}
	
	void print() {
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}
}
