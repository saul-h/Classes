import java.util.ArrayList;

public class VendingMachine {
	
	private ArrayList<Inventory> inventory;
	
	public VendingMachine() {
		inventory = new ArrayList<Inventory>();
	}
	
	public void addItem(Product product, int quantity) {
		inventory.add(new Inventory(product, quantity));
	}
	
}
