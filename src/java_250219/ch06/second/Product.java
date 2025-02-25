package java_250219.ch06.second;

public class Product<T, M> {
	
	private T product;		// Type
	private M model; 	
	
	public T getProduct() {
		return product;
	}
	public void setProduct(T product) {
		this.product = product;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
