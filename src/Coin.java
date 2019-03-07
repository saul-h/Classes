/**
 * The abstract Coin class is a template for the Coin object. This coin object has a default
 * value of zero cents and is the superclass for a specific coin object (that is a coin which
 * has a name and value) such as a Quarter, Dime, or Nickel
 */
public abstract class Coin {
	
	/**
	 * value in cents
	 */
	protected int value;
	
	/**
	 * Default constructor for abstract Coin class. The default constructor of the
	 * coin class assigns 0 to the value of this object.
	 */
	public Coin() {
		value = 0;
	}
	
	/**
	 * Sets the value of this coin
	 * @param v value (in cents)
	 */
	public void setValue(int v) {
		this.value = v;
	}
	
	/**
	 * Returns the value of this coin
	 * @return coin value (in cents)
	 */
	public int getValue() {
		return this.value;
	}
	
	/**
	 * Returns a string describing value of this coin
	 * @return string that shows value of this coin
	 */
	@Override
	public String toString() {
		return value + " cents";
	}
}
