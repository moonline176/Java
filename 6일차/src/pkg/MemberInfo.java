package pkg;

public class MemberInfo { //p.279(싱글톤) + 오버라이딩 vs 오버로딩
	static MemberInfo memberInfo = new MemberInfo();
	static MemberInfo getInstance() {
		return memberInfo;
	}
	private MemberInfo() {}
	
	String[] names = new String[10];
	
	void print() {
		for(String name:names) {
			System.out.println(name);
		}
	}
}
