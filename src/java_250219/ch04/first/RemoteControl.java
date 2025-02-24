package java_250219.ch04.first;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final 생략 가능
	final String name = "ansdf";
	
	// 추상메서드
	public abstract void turnOn();
	void turnOff(); // public abstract 생략 가능 
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 설정");
		} else {
			System.out.println("음소거 해제");
		}
	}
	
	static void s() {
		
	}
}
