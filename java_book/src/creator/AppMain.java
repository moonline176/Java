package creator;

public class AppMain {

	public static void main(String[] args) {
		Superman superman = new Superman();
		superman.land();
		superman.fly();
		superman.takeOff();
		Human human = new Human();
		human.think();
		Bird bird = new Bird();
		bird.fly();
		bird.eat();
		bird.layEggs();
		
		
		// ---- .run 등등 클래스에 따른 메소드 만들어주기 
	}

}
