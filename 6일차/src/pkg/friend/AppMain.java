package pkg.friend;

import pkg.Friend;

public class AppMain {

	public static void main(String[] args) {
		Friend f = new CompanyFriend("학교", "홍길동", "1111", "과장");
		f.print();
		Friend f1 = new SchoolFriend("학교", "홍길동", "1111", "0106");
		/*f1.print();
		다형성 (상속받고 오버로딩 전제조건)
		1. 부모타입의 참조변수가 자식객체를 참조가능
		2. 메소드 실행 => 참조대상의 메소드가 호출되므로 결과가 다르다 
		*/
		
		// FriendAccess manager = BeanFactory.getBean(FriendAccess.class);
		// FriendAccess manager = new FriendList();
		// FriendList manager = new FriendList();
		FriendManager manager = new FriendManager();
		for(Friend fr : manager.friends ) {
			if(fr instanceof CompanyFriend) //or SchoolFrined
			fr.print();
		}
//		manager.seletAll();
	}

}
