public class Inventory {
	/**
	 * The type of product
	 */
	private Product product;
	/**
	 * the quantity of this product in the vending machine
	 */
	private int quantity;
	
	/**
	 * 
	 * @param p
	 * @param q
	 */
	public Inventory(Product p, int q) {
		this.product = p;
		this.quantity = q;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	public int getProductCost() {
		return product.getCost();
	}
	
	public String toString() {
		return product.toString() + " " + quantity; 
	}
}
