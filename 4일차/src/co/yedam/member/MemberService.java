package co.yedam.member;

import java.util.Scanner;

public class MemberService {
	Member[] members = new Member[10];
	Scanner scanner = new Scanner(System.in);
	int cnt = 0;

	// 회원가입
	void insert() {
		System.out.println("id>");
		String id = scanner.next();
		
		System.out.println("이름>");
		String name = scanner.next();
		
		System.out.println("pw>");
		String password = scanner.next();
		
		System.out.println("나이>");
		int age = scanner.nextInt();
		members[cnt++] = new Member(id, name, password, age);
	}

	// 회원리스트
	void printList() {
		for (int i = 0; i < cnt; i++)
			System.out.println(i+" "+members[i].id+" "+members[i].name+" "+members[i].password+" "+members[i].age);
	}

	void printMember(int i) {
			System.out.println(members[i].id+" "+members[i].name+" "+members[i].password+" "+members[i].age);
	}
	void printNum() {
		System.out.println("번호입력>");
		int n = scanner.nextInt();
		for(int i=0; i<cnt; i++) {
			if (i==n) {
				printMember(n);
			}
		}
	}
	void printId() {
		System.out.println("id입력>");
		String a = scanner.next();
		for(int i=0; i<cnt; i++) {
			if ((members[i].id).equals(a)) {
				printMember(i);
			}
		}
	}

	boolean login(String id, String password) {
		for (int i = 0; i < cnt; i++) {
			if (id.equals(members[i].id) && password.equals(members[i].password)) {
				return true;
			}
		}
		return false;
	}

	void logout(String id) {
		System.out.println("logout");
	}

}
