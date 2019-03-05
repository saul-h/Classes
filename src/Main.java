import java.util.Scanner;

public class Main {
	
	static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		// Create Vending Machine object
		VendingMachine vendingMachine = new VendingMachine();
		
		Product p1 = new Product("Cheetos", 100);
		Product p2 = new Product("Snickers", 120);
		Product p3 = new Product("Peanuts", 125);
		
		vendingMachine.addItem(p1, 10);
		vendingMachine.addItem(p2, 2);
		vendingMachine.addItem(p3, 4);
		
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
			break;
		case "b":
			break;
		case "c":
			break;
		case "d":
			break;
		}
	}
	
	static void addProduct() {
		
	}
}
