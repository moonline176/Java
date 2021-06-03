package pkg.collect;

import java.util.ArrayList;
import java.util.LinkedList;

import pkg.Friend;
import pkg.friend.CompanyFriend;
import pkg.friend.SchoolFriend;

public class ListTest {

	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<Friend>(); // <Object> 라면 나머지 타입들도 추가 가능
		list.add(new Friend("현대", "홍", "1111"));
		list.add(0, new CompanyFriend("삼성", "김", "222"));
		list.add(new SchoolFriend("초등", "박", "333"));
		// System.out.println(list);
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		System.out.println("=======================");

		list.remove(0);
		for (Friend f : list) { // ':'을 in으로 생각하면 편하다
			System.out.println(f.getName());
		}

		Friend fr = list.get(0);
		System.out.println("첫번째 이름: " + fr.getName());

		// 마지막 이름 : size()
		System.out.println("마지막 이름: " + list.get(list.size() - 1).getName());

		list.set(1, new Friend("중학교", "최", "5555"));
		for (Friend f : list) {
			System.out.println(f.getName());
		}

	}

}
