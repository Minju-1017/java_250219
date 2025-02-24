package java_250219.ch02.first;

public class Ipod {
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 20;
	
	private int volume = 0;
	
	public void downVolume() {
		if (this.volume == MIN_VOLUME) {
			System.out.println("볼륨 이미 0");
			return;
		}
		this.volume--;
		
		System.out.println("볼륨 1 감소: " + this.volume);
	}
	
	public void upVolume() {
		if (this.volume == MAX_VOLUME) {
			System.out.println("볼륨 이미 Max");
			return;
		}
		this.volume++;
		
		System.out.println("볼륨 1 증가: " + this.volume);
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		
		System.out.println("볼륨 세팅: " + this.volume);
	}
}
