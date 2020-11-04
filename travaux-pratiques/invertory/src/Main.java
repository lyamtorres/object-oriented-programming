
public class Main {

	public static void main(String[] args) {
		// Creation des produits avec leurs prix
		Product ninjaWeapon1 = new Product("Hiramekarei", 200);
		Product ninjaWeapon2 = new Product("Kunai", 10);
		Product ninjaWeapon3 = new Product("Shuriken", 5);
		
		// Creation d'un stock vide
		Stock myInvertory = new Stock();
		
		// Inclusion des produits dans le stock
		myInvertory.addProduct(ninjaWeapon1, 1);
		myInvertory.addProduct(ninjaWeapon2, 10);
		myInvertory.addProduct(ninjaWeapon3, 25);
		
		// Affichage de l'intégralité du stock
		System.out.println(myInvertory.toString());
		
		// Elimination du produit "Kunai" dans le stock
		myInvertory.removeProduct("Kunai");
		
		// Affichage du stock après modification
		System.out.println(myInvertory.toString());
		
		// Affichage du prix total de tous les produits dans le stock
		System.out.println("Le prix total du stock est: " + myInvertory.totalPrice());
	}

}