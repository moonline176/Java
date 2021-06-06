package co.yedam.score2;

public class AppMain {

	public static void main(String[] args) {
		ScoreArr2App score = new ScoreArr2App();
		for (int i = 0; i <score.arr.length; i++) {
			System.out.println(score.getSbjCnt(i)+":"+score.stdTotal(i));
		}

		System.out.println(score.stdTotal(0));
		System.out.println(score.stdTotal(1));
		System.out.println(score.stdTotal(2));
		
		score.print();
		
	}

}
