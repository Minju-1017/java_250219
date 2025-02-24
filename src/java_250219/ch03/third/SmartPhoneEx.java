package java_250219.ch03.third;

public class SmartPhoneEx {

	public static void main(String[] args) {
		// Phone phone = Phone(); // 에러: 인스턴스화 할 수 없다

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.open();
	}

}
