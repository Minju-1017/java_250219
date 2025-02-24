package java_250219.ch02.second;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car(8, "Sonata1", "White", "Hyundai");
		Car car2 = new Car(8, "Sonata2", "Black", "Hyundai");
		Car car3 = new Car(8, "Sonata3", "Grey", "Hyundai");
		Car car4 = new Car(8, "Sonata4", "Pink", "Hyundai");
		
		System.out.println("name: " + car1.name);
		System.out.println("name: " + car2.name);
		System.out.println("name: " + car3.name);
		System.out.println("name: " + car4.name);
	}

}
