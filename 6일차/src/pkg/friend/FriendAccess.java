package pkg.friend;

import java.util.List;
/*
 * 
 * 인터페이스 : 상수필드 + 추상메소드, p.372
 * 상수필드 : 기본적으로 (public static final)이 작성되어 생략된 상태이다.
 * 메소드 : public abstract 
 */

import pkg.Friend;

//  친구관리개발 시  개발 표준
public interface FriendAccess {
	public static final String model ="add";
	
	//등록
	public void insert(Friend friend);
	
	//수정
	public void update(Friend friend);
	
	//삭제
	public void delete(String name);
	
	//전체조회
	public void seletAll();
	
	//단건조회
	public Friend selectOne(String name);
	
}
