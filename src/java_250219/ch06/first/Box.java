package java_250219.ch06.first;

public class Box<T> {
	int a;
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
