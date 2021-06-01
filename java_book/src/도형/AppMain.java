package 도형;

public class AppMain {

	public static void main(String[] args) {

//		Shape s = new Rect(4,5);
//		s.area();
//		s.print();
//		
//		s = new Tri(4,5); //Shape 은 이미 선언 했기 때문에 작성 x / 참조할수있는건 부자지간에만 가능 자식간은 불가능
//		s.area();
//		s.print();
		Drawable[] s = new Drawable[3];
		s[0] = new Rect(4, 5); // 자식타입==>부모타입으로 자동 형변환 / 메모리크기 부모 < 자식
		s[1] = new Circle(5);
		s[2] = new Tri(4, 5);

		for (Drawable temp : s) {
			temp.draw();
//			if (temp instanceof Rect) {
//				((Rect) temp).area();// 부모타입==>자식타입은 강제적인 형변환 필요
//				((Rect) temp).print();
//			} else if (temp instanceof Circle) {
//				((Circle) temp).area();
//			} else if (temp instanceof Tri) {
//				((Tri) temp).area();
//			}
			if (temp instanceof Shape) { //instanceof:파일값 검사 ==> 맞으면 true or 없으면 false + 부모타입을 자식타입으로 변환시킬때
				((Shape) temp).area();
				((Shape) temp).print();
			}
			if( temp instanceof Movable) {
				((Movable)temp).move();
			}

		}
	}

}
