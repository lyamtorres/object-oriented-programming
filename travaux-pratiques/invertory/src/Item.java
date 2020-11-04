
public class Item {
	
	private Product prod;
	private int quantity;
	
	public Item(Product prod, int quantity) {
		this.prod = prod;
		this.quantity = quantity;
	}
	
	public Product getProd() {
		return prod;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void more(int n) {
		n++;
	}
	
	public void less(int n) {
		n--;
	}
}
