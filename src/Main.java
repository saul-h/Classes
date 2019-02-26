public class Main {

	public static void main(String[] args) {
		
		User user = new User(16, 5, 20, 5);
		
		// Create Vending Machine object
		VendingMachine vendingMachine = new VendingMachine();
		
		// Add items
		vendingMachine.addItem(new Snickers(), 4);
		vendingMachine.addItem(new Starburst(), 6);
		vendingMachine.addItem(new Cheetos(), 3);
		
		System.out.println("You have a balance of: ");
		System.out.println(user);
		System.out.println();
		
		System.out.println("Available items to buy: ");
		System.out.println(vendingMachine);
		
	}

}
