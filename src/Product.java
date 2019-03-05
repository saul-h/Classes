
public class Product {
	/**
	 * Cost of the product (in cents)
	 */
	private int cost;
	/**
	 * Name of product
	 */
	private String name;
	
	/**
	 * 
	 * @param name
	 * @param cost
	 */
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
	
	@Override
	public String toString() {
		return name + " " + String.format("$%.2f", (double)cost / 100f);
	}
}
