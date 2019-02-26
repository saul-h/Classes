import java.util.ArrayList;

public class VendingMachine {
	
	private ArrayList<Inventory> inventory;
	
	public VendingMachine() {
		inventory = new ArrayList<Inventory>();
	}
	
	public void addItem(Product product, int quantity) {
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
	
}
