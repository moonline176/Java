package 도형;

public class Tri extends Shape implements Drawable{

	int h;
	
	public Tri(int h,int w) {
		super(w);
		this.h = h;
	}
	public void area() {
		result = (w*h)/2;
	}
	@Override
	public void draw() {
		System.out.println("draw tri");
	}
}
