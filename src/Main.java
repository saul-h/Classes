import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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
			//TODO: Insert coin to vending machine
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
	
	static void addProduct() {
		
	}
}
