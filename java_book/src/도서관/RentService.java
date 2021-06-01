package 도서관;

import java.util.Scanner;

public class RentService implements Service{
	
	Rent[] rents;
	int cnt;			//입력건수
	int maxCnt = 10;	//최대건수
	
	Scanner scanner = new Scanner(System.in);
	
	public RentService() {
		rents = new Rent[maxCnt];
	}
	
	//등록
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.printf("이름>");
		String name = scanner.next();
		System.out.print("책번호>");
		String title = scanner.next();
		rents[cnt++] = new Rent(name, title); 
		System.out.println("등록된 건수:" + cnt);
	}
	
	//수정
	public void update() {
		System.out.printf("수정할 회원>");
		int idx = scanner.nextInt(); //문자열로 변환
		if(idx >= cnt-1) {
			System.out.println("없는 회원입니다.");
			return;
		}
		System.out.print("수정할 책 번호>");
		String title = scanner.next();
		rents[idx].setTitle(title); 
		System.out.println("수정되었습니다.");
	}
	
	//삭제
	public void delete() {
		System.out.printf("회원 번호>"); //문자열로 변환
		int idx = scanner.nextInt(); 
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for(int i=idx; i<cnt-1; i++) {
			rents[i] = rents[i+1];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "회원이름", "책번호"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-20s %-20s", rents[i].getName(), rents[i].getTitle()));
		}
		System.out.println("================================================================");
	}
	
	//단건조회(타이틀)
	public void selectOne() {
		System.out.printf("조회할 번호>");
		int idx = scanner.nextInt();
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println(String.format("회원 이름:%s   책번호:%s", rents[idx].getName(), rents[idx].getTitle()));
	}

	@Override
	public void seletOne() {
		// TODO Auto-generated method stub
		
	}

}
