package co.yedam.app.score;

import java.util.Scanner;

import co.yedam.app.score.ScoreApp;

public class AppMain {

	public static void main(String[] args) {
		ScoreApp score = new ScoreApp();
		score.input();
		
		System.out.println(score.getSum()+"\n"+
						   score.getAvg()+"\n"+
						   score.getGrade()
						   );
		System.out.println("합격여부: "+(score.isPass()? "합격":"불합격"));
	}

}
