package pkg;
/*
 * @author admin
 * 
 */
public class Projectinfo {
	public static final String name = "예담주식회사"; 
	//필드값 고정, final을 이용하여 타 클래스에서 변경불가
	static String uploadpath = "c:/temp"; //p.273~278참고
	int version = 1; //인스턴스 필드 => 타 클래스에서 객체생성후 이용가능
}
