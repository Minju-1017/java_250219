package java_250219.ch04.first;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끄기");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("TV 볼륨 설정: " + volume);
	}

}
