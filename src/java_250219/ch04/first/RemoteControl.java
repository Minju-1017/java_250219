package java_250219.ch04.first;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	final String name = "ansdf";
	
	// 추상메서드
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
}
