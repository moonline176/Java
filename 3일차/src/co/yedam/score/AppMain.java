package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {
		//3. new객체 생성
		ScoreArrApp score = new ScoreArrApp();
		//4. 객체 이용(메서드 호출)
		System.out.println("성적");
		System.out.printf("총점:%04d\n",score.total());
		System.out.printf("평균=%.2f\n",score.avg());
		score.printH();
	}

}
