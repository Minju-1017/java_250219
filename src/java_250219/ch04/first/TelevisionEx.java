package java_250219.ch04.first;

public class TelevisionEx {

	public static void main(String[] args) {
		// 객체의 내용이 통째 변경될 것을 대비해 interface를 쓴다. 예) TV를 Settop으로 바꿀때
		RemoteControl remoteControl = new SettopBox();
		// RemoteControl remoteControl = new SettopBox();
		remoteControl.turnOn();
		remoteControl.setMute(false);
	}

}
