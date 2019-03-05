public abstract class Coin {
	
	/**
	 * value in cents
	 */
	protected int value;
	
	public void setValue(int v) {
		this.value = v;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String toString() {
		return value + " cents";
	}
}
