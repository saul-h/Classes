import java.util.Scanner;

public class Main {
	
	static Scanner input;
	static VendingMachine vendingMachine;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		// Create Vending Machine object
		vendingMachine = new VendingMachine();
		
		Product p1 = new Product("Cheetos", 100);
		Product p2 = new Product("Snickers", 120);
		Product p3 = new Product("Peanuts", 125);
		
		vendingMachine.addItem(p1, 10);
		vendingMachine.addItem(p2, 2);
		vendingMachine.addItem(p3, 4);
		
		while(true) {
			System.out.println("S)how products  I)nsert coin B)uy  \nA)dd product  R)emove coins  Q)uit");
			
			String resp = input.nextLine();
			
			switch(resp){
			case "s":
				System.out.println(vendingMachine);
				break;
			case "i":
				insertCoin();
				break;
			case "b":
				//TODO: Remove product from vending machine and remove inserted coins
				break;
			case "a":
				addProduct();
				break;
			case "r":
				//TODO: Remove inserted coins in vending machine
				break;
			case "q":
				return;
			}
		}
	}
	
	static void insertCoin() {
		System.out.println("A) Penny @ 0.01\n" + 
				"B) Nickel @ 0.05\n" + 
				"C) Dime @ 0.10\n" + 
				"D) Quarter @ 0.25");
		
		String resp = input.nextLine();
		
		switch(resp) {
		case "a":
			vendingMachine.insertCoin(new Penny());
			break;
		case "b":
			vendingMachine.insertCoin(new Nickel());
			break;
		case "c":
			vendingMachine.insertCoin(new Dime());
			break;
		case "d":
			vendingMachine.insertCoin(new Quarter());
			break;
		}
		
		double balance = (double)vendingMachine.getBalance() / 100.0f;
		System.out.println("Balance: " + balance);
		
	}
	
	static void addProduct() {
		System.out.println("Enter the name of the product: ");
		String name = input.nextLine();
		
		System.out.println("Enter the price of the product (in cents): ");
		int price = Integer.parseInt(input.nextLine());
		
		System.out.println("How many would you like to add?");
		int qty = Integer.parseInt(input.nextLine());
		
		vendingMachine.addItem(new Product(name,price), qty);
	}
}
