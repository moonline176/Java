package pkg.friend;

import java.util.ArrayList;
import java.util.List;

import pkg.Friend;
//매꾸기
public class FriendList implements FriendAccess{
	List<Friend> friends;
	
	public FriendList() {
		friends = new ArrayList<Friend>(); //리스트는 객체생성 불가 ==> ArrayList로 작성+import
	}

	@Override
	public void insert(Friend friend) {
		friends.add(friend);
	}

	@Override
	public void update(Friend friend) {
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seletAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public Friend selectOne(String name) {
		for(Friend f : friends) {
			if(f.getName().equals(name)) { //contains
				return f;
			}
		}
		return null;
	}
	
}
