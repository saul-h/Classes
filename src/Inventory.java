public class Inventory {
	
	private Product product;
	private int quantity;
	
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
	
	public int getProductCost() {
		return product.cost;
	}
	
}
