package pkg;

public class AppMain {
//	void print() {
//		System.out.println("==========");
//	}
//	static void printName() {
//		System.out.println("홍길동");
//	}
	public static void main(String[] args) {
//		print(); //메소드 작성 or static
		
//		System.out.println(Projectinfo.name);
//		Projectinfo info = new Projectinfo();
//		//info.name = "예성"; //필드값이 고정되지 않은경우 수정됨 ==> final로 인해 변경불가
//		System.out.println(info.name);
//		
//		Projectinfo.uploadpath = "/upload";
//		
//		System.out.println(info.version); //위의 info객체 생성후 인스턴스필드 이용가능
//		
//		System.out.println(DateUtil.curDate());
//		
		Count count1 = new Count();
		Count.cnt1++;
		count1.cnt2++;

		Count count2 = new Count();
		Count.cnt1++;
		count2.cnt2++;
		
		Count count3 = new Count();
		Count.cnt1++;
		count3.cnt2++;
		
		System.out.println(Count.cnt1+":"+count1.cnt2);
		System.out.println(Count.cnt1+":"+count2.cnt2);
		System.out.println(Count.cnt1+":"+count3.cnt2);
	}//cnt1=3,cnt2=1이 되는이유 ==> p.278

}
