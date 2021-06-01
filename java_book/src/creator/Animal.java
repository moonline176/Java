package creator;

public abstract class Animal {
	
	public void run() {
		System.out.println("달림");
	}
	public abstract void eat();
	
	public void sleep() {
		System.out.println("수면");
	}
}
