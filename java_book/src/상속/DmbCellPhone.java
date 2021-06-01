package 상속;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	public DmbCellPhone() { 
		//super("","");	 // 생략가능 생략해도 부모 클래스 호출
		System.out.println("DmbCellPhone 기본생성자");
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자");
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송수신 시작");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널이 " + channel + "번 채널로 변경됩니다.");
	}
	
	// 오버로딩(중복정의) <-> 오버라이딩(재정의)
	// 오버라이딩 = 메서드 재정의 
	// 상속 받은 메서드를 수정
	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("Dmb 전원 on");
	}
	
	
}
