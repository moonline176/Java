package pkg.friend;

import pkg.Friend;

public class SchoolFriend extends Friend {
	String birth;
	
	public SchoolFriend() {}
	
	public SchoolFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}

	public SchoolFriend(String gubun, String name, String tel, String birth) {
		super(gubun,name,tel); //p.313~316
//		this.gubun = gubun;
//		this.name = name;
//		this.tel = tel;
		this.birth = birth;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("생일: "+birth);
	}
	
}
