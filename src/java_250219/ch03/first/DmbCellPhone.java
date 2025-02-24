package java_250219.ch03.first;

public class DmbCellPhone extends CellPhone {

	DmbCellPhone() {
		super();
	}
	
	DmbCellPhone(String model, String color) {
		super(model, color);
	}

	@Override
	void powerOff() {
		System.out.println(super.model + " 전원을 끕니다.");
	}

	@Override
	void powerOn() {
		System.out.println(super.model + " 전원을 켭니다.");
	}
	
	
}
