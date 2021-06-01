package 도형;

public class Tri extends Shape implements Drawable{

	int h;
	
	public Tri(int h,int w) {
		super(w);
		this.h = h;
	}
	public void area() {
		result = (w*h)/2;
		System.out.println("삼각형넓이: " + result);
	}
	@Override
	public void draw() {
		System.out.println("draw tri");
	}
}
