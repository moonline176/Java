package co.yedam.exam;

public class ExamScoreExample {

	public static void main() {
		ExamScore examScore = new ExamScore("101",80,90,70);
		System.out.println(examScore.isPass()?"합격":"불합격");
	}
}
