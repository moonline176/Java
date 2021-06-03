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
		if (friends.get(0).getName() == friend.getName()) {
			friends.set(0, friend);
		}
		else if (friends.get(1).getName() == friend.getName()) {
			friends.set(1, friend);
		}
	}

	@Override
	public void delete(String name) {
		for (Friend f : friends) {
			if(f.getName().equals(name)) {
				friends.remove(f);
			}
		}
//		if (friends.get(0).getName() == name) {
//			friends.remove(0);
//		}
//		else if (friends.get(1).getName() == name) {
//			friends.remove(1);
//		}	
	}

	@Override
	public void seletAll() {
		System.out.println(friends);
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
