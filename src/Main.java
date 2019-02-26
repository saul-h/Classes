
public class Main {

	public static void main(String[] args) {
		
		// Create Vending Machine object
		VendingMachine vendingMachine = new VendingMachine();
		
		// Add items
		vendingMachine.addItem(new Snickers(), 4);
		vendingMachine.addItem(new Starburst(), 6);
		vendingMachine.addItem(new Cheetos(), 3);
	}

}
