package java_250219.ch06.second;

public class ProductEx {

	public static void main(String[] args) {
		Product<String, Integer> iPhone6 = new Product<>();
		iPhone6.setModel(6);
		
		Product<String, String> iPhone6s = new Product<>();
		iPhone6s.setModel("6s");
		
		Product<Tv, String> tv = new Product<>();
		tv.setProduct(new Tv());
	}

}
