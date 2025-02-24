package java_250219.ch05.first;

import java.awt.Toolkit;

public class BeepPrintRunnable implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("1");
			System.out.println("2");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
