import java.util.ArrayList;

public class User {
	
	ArrayList<Quarter> quarters;
	ArrayList<Dime> dimes;
	ArrayList<Nickel> nickels;
	ArrayList<Penny> pennies;
	
	public User(int q, int d, int n, int p) {
		setQuarters(q);
		setDimes(d);
		setNickels(n);
		setPennies(p);
	}
	
	public void setQuarters(int q) {
		quarters = new ArrayList<Quarter>();
		for(int i = 0; i < q; i++) {
			quarters.add(new Quarter());
		}
	}
	
	public void setDimes(int d) {
		dimes = new ArrayList<Dime>();
		for(int i = 0; i < d; i++) {
			dimes.add(new Dime());
		}
	}
	
	public void setNickels(int n) {
		nickels = new ArrayList<Nickel>();
		for(int i = 0; i < n; i++) {
			nickels.add(new Nickel());
		}
	}
	
	public void setPennies(int p) {
		pennies = new ArrayList<Penny>();
		for(int i = 0; i < p; i++) {
			pennies.add(new Penny());
		}
	}
	
	public String toString() {
		return 	"Quarters: " + quarters.size() +
				"\nDimes: " + dimes.size() +
				"\nNickels: " + nickels.size() + 
				"\nPennies: " + pennies.size();
	}
}
