/**
 * A Product object and the quantity of that Product in Inventory. 
 * @author Abel
 * @author Saul
 */
public class Inventory {
	/**
	 * The type of product
	 */
	private Product product;
	/**
	 * The quantity of this product in the vending machine
	 */
	private int quantity;
	
	/**
	 * Constructs a defualt Inventory item using the default Product constructor and 
	 * a quantity of 0.
	 */
	public Inventory() {
		this.product = new Product();
		this.quantity = 0;
	}
	
	/**
	 * Constructs an Inventory object with 
	 * @param p Product type
	 * @param q Quantity of product
	 */
	public Inventory(Product p, int q) {
		this.product = p;
		this.quantity = q;
	}
	
	/**
	 * Returns the Product instance
	 * @return the Product of this Inventory object
	 */
	public Product getProduct() {
		return product;
	}
	
	/**
	 * Returns the quantity of this Product type in the inventory.
	 * @return the quantity of the Product type in inventory
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity of the product. Used for when products are bought and added to the
	 * VendingMachine.
	 * @param q Quantity to be set at
	 */
	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	/**
	 * Returns the cost (in cents) of the product
	 * @return the cost (in cents) of the product
	 */
	public void removeQuantity(int x) {
		this.quantity -= x;
	}
  
	public int getProductCost() {
		return product.getCost();
	}
	
	/**
	 * Returns a string describing the product details (name, cost) and the quantity of that product
	 * @return a string describing the product details (name, cost) and the quantity of that product
	 */
	public String toString() {
		return product.toString() + " " + quantity; 
	}
}
