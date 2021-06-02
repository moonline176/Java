package pkg;

public class Car {
	private String model; //필드 => private, 클래스,생성자 => public
	private int speed;
	private boolean stop;
	
	

	public Car() {}
	
	public Car(String model,int speed) {
		this.model = model;
		if(speed<50) {
			speed = 50;
		}
		this.speed = speed;
	}
	
	public Car(String model) {
		this(model,0); //생성자 호출 : this() ,동일 생성자 여러개 ==> 오버로딩 
	}
	
	private String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() { //boolean 참조시 get보단 is가 문법상 옳다.
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
