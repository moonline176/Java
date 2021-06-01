package 도서관;

import java.util.Scanner;

public class MemberService implements Service{
	
	Member[] members;
	int cnt;			//입력건수
	int maxCnt = 10;	//최대건수
	
	Scanner scanner = new Scanner(System.in);
	
	public MemberService() {
		members = new Member[maxCnt];
	}
	
	//등록
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.printf("이름>");
		String name = scanner.next();
		System.out.print("전화번호>");
		String Phone = scanner.next();
		members[cnt++] = new Member(name, Phone); 
		System.out.println("등록된 건수:" + cnt);
	}
	
	//수정
	public void update() {
		System.out.printf("수정할 이름>");
		for (int i = 0; i < cnt - 1; i++) {
			(members[i].getName()).equals(scanner.next());
			if (i >= cnt - 1) {
				System.out.println("없는 이름입니다.");
				return;
			}
			System.out.print("전화번호>");
			String Phone = scanner.next();
			members[i].setPhone(Phone);
			System.out.println("수정되었습니다.");
		}
	}

	// 삭제
	public void delete() {
		System.out.printf("삭제할 회원>");
		for (int i = 0; i < cnt - 1; i++) {
			(members[i].getName()).equals(scanner.next()); // 문자열 비교 수정필요
			if (i > cnt - 1) {
				System.out.println("없는 회원입니다.");
				return;
			}
			for (int j = 0; j < cnt - 1; j++) {
				members[j] = members[j + 1];
			}
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "회원이름", "전화번호"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-20s %-20s", members[i].getName(), members[i].getPhone()));
		}
		System.out.println("================================================================");
	}
	
	//단건조회(타이틀)
	public void selectOne() {
		System.out.println("조회할 이름>");
		for (int i = 0; i < cnt ; i++) {
			(members[i].getName()).equals(scanner.next());
			if(i >= cnt){
				System.out.println("없는 회원입니다.");
				return;
			}
			System.out.println(String.format("이름:%s   전화번호:%s", members[i].getName(), members[i].getPhone()));// 배열에 있는 이름과 비교
			
		}

	}
		

	@Override
	public void seletOne() {
		
	}
}
