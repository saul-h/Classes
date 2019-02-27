
public class Product {
	// Cost of the product (in cents)
	private int cost;
	// Name of product
	private String name;
	
	public Product(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}

}
