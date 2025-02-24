package java_250219.ch03.first;

public class DmbCellPhoneEx {
	
	public static void main(String[] args) {
		CellPhone cellPhone1 = new CellPhone("SAMSUNG", "Black");
		System.out.println(cellPhone1.model);

		CellPhone cellPhone2 = new CellPhone("iPhone 16", "White");
		System.out.println(cellPhone2.model);

		DmbCellPhone dmbCellPhone = new DmbCellPhone("SAMSUNG2", "Black2");
		System.out.println(dmbCellPhone.model);
		dmbCellPhone.powerOff();
		dmbCellPhone.powerOn();
	}

}
