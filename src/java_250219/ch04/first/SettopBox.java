package java_250219.ch04.first;

public class SettopBox implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("SettopBox 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("SettopBox 끄기");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("SettopBox 볼륨 설정: " + volume);
	}
	
	public void setMute(boolean mute) {
		System.out.println("ㅁㅁㅁㅁ");
	}
	
	void s() {
		
	}
}
