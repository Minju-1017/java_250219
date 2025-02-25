package java_250219.ch07.first;

import java.awt.Toolkit;

public class ThrowsEx {
	
	// throws(던지다): 해당 함수(메소드)를 호출하는 곳에서 Exception 처리를 하도록 하는 것
	public void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}
	
	public void xyz() {
		try {
			abc();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
