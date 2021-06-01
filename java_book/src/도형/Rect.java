package 도형;

public class Rect extends Shape implements Drawable,Movable{
	int h; //인터페이스는 다중 상속가능
	
	public Rect(int h,int w) {
		super(w);
		this.h = h;
	}
	public void area() {
		result = h*w;
	}
	@Override
	public void draw() {
		System.out.println("Rect draw");
	}
	@Override
	public void move() {
		System.out.println("Rect move");
	}
}
