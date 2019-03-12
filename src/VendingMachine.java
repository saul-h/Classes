import java.util.ArrayList;

/**
 * 
 * @author Saul
 * @author Abel
 */
public class VendingMachine {
	
	/**
	 * List of Inventory (Product and quantity) objects 
	 */
	private ArrayList<Inventory> inventory;
	private ArrayList<Coin> coins;
	
	/**
	 * Constructs a VendingMachine object with no products contained within.
	 */
	public VendingMachine() {
		inventory = new ArrayList<Inventory>();
		coins = new ArrayList<Coin>();
	}
	
	/**
	 * Adds the specified quantity of a Product to the VendingMachine object. If there is
	 * already a Product of the same name contained in the VendingMachine object then the
	 * quantity gets added into the inventory for that product (so as to not have multiple
	 * ArrayList objects with the same name).
	 * @param product Product to be added
	 * @param quantity Quantity of Product to be added
	 */
	public void addItem(Product product, int quantity) {
		boolean itemMatched = false;
		for (Inventory items: inventory) {
			// checks if the Product has the same name as a product in inventory
			if (items.toString().startsWith(product.getName())) {
				// adds quantity of object to 
				items.setQuantity(items.getQuantity() + quantity);
				itemMatched = true;
				break;
			}
		}
		// if item did match then add a new Inventory object for the product to VendingMachine
		if (!itemMatched)
			inventory.add(new Inventory(product, quantity));
	}
	
	public String toString() {
		String header = String.format("%-10s%8s%10s%n", "Name", "Quantity", "Price");
		
		String body = "";
		for(int i = 0; i < inventory.size(); i++) {
			Inventory item = inventory.get(i);
			body += String.format("%-10s%8d%10.2f%n", item.getProduct().getName(), item.getQuantity(), (double)item.getProductCost() / 100f);
		}
		return header + body;
	}
	
	public void clearCoins() {
		
		int size = coins.size();
		
		for(int i = 0; i < size; i++) {
			coins.remove(0);
		}
	}
	
	public ArrayList<Inventory> getInventory(){
		return inventory;
	}
	
	public void insertCoin(Coin c) {
		coins.add(c);
	}
	
	public int getBalance() {
		int bal = 0;
		
		for(Coin coin: coins) {
			bal += coin.getValue();
		}
		
		return bal;
	}
}
