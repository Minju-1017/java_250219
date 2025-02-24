package java_250219.ch05.first;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		
//		for (int i = 0; i < 5; i++) {
//			toolkit.beep();
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("12");
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for (int i = 0; i < 5; i++) {
//					System.out.println("1");
//					System.out.println("2");
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//	
//		});
//		
//		thread.start();
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("3");
//		}
		
		Runnable runnable = new BeepPrintRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
