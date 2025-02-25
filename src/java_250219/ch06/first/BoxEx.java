package java_250219.ch06.first;

public class BoxEx {
	
	public static void main(String[] args) {
//		Box box = new Box();
//		box.a = 1;
//		System.out.println(box.a);
		
		// <> 안에 들어올 수 있는 type은 원시 타입은 안됨. 레퍼런스만 됨(int x, Integer o)
		Box<Integer> box1 = new Box<>(); // 동일: Box<Integer> box = new Box<Integer>();
		box1.setT(1);
		System.out.println(box1.getT());
		
		Box<String> box2 = new Box<>();
		box2.setT("MJ");
		System.out.println(box2.getT());
		
		Box<Float> box3 = new Box<>();
		box3.setT(1.2f);
		System.out.println(box3.getT());
	}

}
