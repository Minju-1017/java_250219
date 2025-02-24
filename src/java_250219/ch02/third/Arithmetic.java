package java_250219.ch02.third;

public class Arithmetic {
	
	int a;
	int b;
	
	Arithmetic() {
		
	}
	
	Arithmetic(int a, int b) {
		this.a = a;
		this.b = b;
		
		plus(a, b);
	}
	
	void plus(int a, int b) {
		System.out.printf("%d + %d = %d 입니다", a, b, a + b);
	}
	
}
