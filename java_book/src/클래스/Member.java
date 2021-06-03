package 클래스;

public class Member {
	
	
	String id;
	String name;
	String password;
	int age;
	
	//기본 생성자
	Member(){
		this("","","",0);
	}

	public Member(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	//모든 필드를 초기화하는 생성자

	@Override
	public boolean equals(Object obj) {
		Member s = (Member)obj;
		return this.id.equals(s.id) && this.name.equals(s.name);
	}

//	@Override
//	public boolean equals(Object obj) {
//		Member m2 = ((Member)obj);
//		return ((Member)obj).id == this.id && m2.name ==this.name;
//	}
	
	
	
	
	
	
	
	
}
