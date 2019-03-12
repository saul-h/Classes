/**
 * Product to be sold. The product class has a name and a cost (in cents).
 * @author Saul
 * @author Abel
 */
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
	 * Constructs a product with default values of "" for name and 0 for cost
	 */
	public Product() {
		this.name = "";
		this.cost = 0;
	}
	
	/**
	 * Constructs a product with the inputted name and cost
	 * @param name Name of the item being sold
	 * @param cost Cost of the item (in cents)
	 */
	public Product(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	/**
	 * Returns the name of this product
	 * @return the name of this product
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the cost of this product
	 * @return the cost of this product
	 */
	public int getCost() {
		return cost;
	}
	
	/**
	 * Returns a descriptive string of this product
	 * @return the name and cost of this product formatted as a string
	 */
	@Override
	public String toString() {
		return name + " " + String.format("$%.2f", (double)cost / 100f);
	}
}
