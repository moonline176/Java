package creator;

public class Human extends Animal{
	public void think() {
		System.out.println("사고");
	}

	@Override
	public void eat() {
		System.out.println("고기,채소");
	}
}
