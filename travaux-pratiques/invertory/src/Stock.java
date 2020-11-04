
import java.util.ArrayList;

public class Stock {
	
	private ArrayList<Item> invertory;
	
	public Stock() {
		invertory = new ArrayList<Item>();
	}
	
	public int find(String name) {
		int result = 0;
		
		for(int i = 0; i < invertory.size(); i++) {
			if(name == invertory.get(i).getProd().getName()) {
				return i;
			}
		}
		return -1;
	}
	
	public void addProduct(Product prod, int quantity) {
		if(find(prod.getName()) == -1) {
			Item item = new Item(prod, quantity);
			invertory.add(item);
			System.out.println("Le produit " + prod.getName() +  " a été ajouté de manière satisfaisante.");
		} else {
			System.out.println("Le produit existe déjà dans le stock !");
		}
	}
	
	public void removeProduct(String name) {
		if(find(name) != -1) {
			invertory.remove(find(name));
			System.out.println("Le produit " + name + " a été enlevé de manière satisfaisante.");
		} else {
			System.out.println("Le produit n'existe pas dans ce stock !");
		}
	}
	
	public double totalPrice() {
		int total = 0;
		
		for(int i = 0; i < invertory.size(); i++) {
			total += invertory.get(i).getProd().getPrice() * invertory.get(i).getQuantity();
		}
		return total;
	}
	
	
	public String toString() {
		String stockList = "";
		
		for(int i = 0; i < invertory.size(); i++) {
			stockList += "Stock [name=" + invertory.get(i).getProd().getName() + ", price=" + invertory.get(i).getProd().getPrice() + ", quantity=" + invertory.get(i).getQuantity() + "] \n";
		}
		return stockList;
	}
}
