public class Main {

	public static void main(String[] args) {
		// Create Vending Machine object
		VendingMachine vendingMachine = new VendingMachine();
		
		Product p1 = new Product("Cheetos", 100);
		vendingMachine.addItem(p1, 10);
		vendingMachine.addItem(p1, 10);
		System.out.println(vendingMachine.toString());
	}
}
