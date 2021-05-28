package co.yedam.app.score;
/*
 * 성적처리 프로그램
 * 국,영,수 입력
 * 총점, 평균, 등급 계산
 */
import java.util.Scanner;

public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	//성적입력
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국:");
		kor = scanner.nextInt();
		System.out.print("영:");
		eng = scanner.nextInt();
		System.out.print("수:");
		mat = scanner.nextInt();
		
	}
	
	//합계 계산
	int getSum() {
		sum = kor + eng + mat; 
		return sum;
	}
	
	float getAvg() {
		avg = (float)sum/3;
		return avg;//평균 계산하고 리턴
	}
	
	boolean isPass() {
		if(avg >= 60) {
			return true;
		}
			
		else {
			return false;
		}
			//평균이 60점 이상 true
		//아니면 false if문 입력
	}
	
	char getGrade() {
		switch((int)avg/10) { 
		case 10: 			
		case 9: 			
		case 8: 	grade = '상'; break;			
		case 7:			
		case 6: 	grade = '중'; break;			
		default: 	grade = '하'; break;			
		}
		return grade;
	}
}
	