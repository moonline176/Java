package co.micol.tv;

public class LgTV implements RemoteControl {
	public void SamsungTV() {
		System.out.println("LGTV 객체생성");
	}
	public void powerOn() {
		System.out.println("lg TV--전원 on");
	}
	public void powerOff() {
		System.out.println("lg TV--전원 off");
	}
	public void volumeUp() {
		System.out.println("lg TV--볼륨 up");
	}
	public void volumeDown() {
		System.out.println("lg TV--볼륨 Down");
	}
	
}
