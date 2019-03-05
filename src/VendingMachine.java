import java.util.ArrayList;

public class VendingMachine {
	
	private ArrayList<Inventory> inventory;
	private ArrayList<Coin> coins;
	
	public VendingMachine() {
		inventory = new ArrayList<Inventory>();
		coins = new ArrayList<Coin>();
	}
	
	public void addItem(Product product, int quantity) {
		boolean itemMatched = false;
		for (Inventory items: inventory) {
			if (items.toString().startsWith(product.getName())) {
				items.setQuantity(items.getQuantity() + quantity);
				itemMatched = true;
				break;
			}
		}
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
