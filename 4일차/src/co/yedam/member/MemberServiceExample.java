package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
//		MemberService memberService = new MemberService();
//		memberService.insert("hong", "12345", "홍길동", 25);
//		memberService.insert("kim", "1111", "김유신", 20);
//		memberService.insert("choi", "2222", "최기자", 30);
//
//		memberService.printList();
//
//		memberService.printMember(1);
//
//		System.out.println(memberService.login("kim", "1111"));
//		System.out.println(memberService.login("kim", "1234"));

		MemberService app = new MemberService();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while (run) {
			System.out.println("1.등록 2.전체조회 3.번호조회 4.로그인 5.id로조회 6.종료");
			System.out.println("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.insert(); // app.insert
			} else if (selectNo == 2) {
				app.printList();// app.memberList
			} else if (selectNo == 3) {
				app.printNum(); // app.~~~
			} else if (selectNo == 4) {
				System.out.println("id>");
				String id = scanner.next();
				System.out.println("pw>");
				String password = scanner.next();
				System.out.println(app.login(id, password) ? "로그인" : "다시입력");
			} else if (selectNo == 5) {
				app.printId();
			} else if (selectNo == 6) {
				run = false;
			}

		}
	}
}

/*
 * <<실행예시>> ===> 과제 1.등록 2.전체조회 3.번호조회 4.로그인 5.종료 입력>1 id> hong name> 홍길동 pw>
 * age>
 * 
 * 입력>2
 */