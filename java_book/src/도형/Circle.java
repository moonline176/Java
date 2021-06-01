package 도형;

public class Circle extends Shape implements Drawable{
	public Circle(int w) {
		super(w); //부모생성자 호출
		//this.w = w;
	}
	public void area() {
		result = w*w*3.14;
	}
	@Override
	public void draw() {
		System.out.println("circle draw");
	}
	
	
}
