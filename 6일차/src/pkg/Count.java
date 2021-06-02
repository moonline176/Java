package pkg;

public class Count { //get vs set 개념파악
	public static int cnt1;
	int cnt2;
	
	public void setCnt(int cnt) {
		if(cnt < 0) {
			cnt = 0;
		}
		this.cnt2 = cnt;
	}
	public int getCnt2() {
		return cnt2;
	}
	
}
