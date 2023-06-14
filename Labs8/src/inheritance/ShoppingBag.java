package inheritance;

public class ShoppingBag extends Bag {
	boolean extremelyRobust;
	public ShoppingBag(boolean robustness) throws Exception {
		super(30, 20.0);
		this.extremelyRobust=robustness;
	}
	public String toString() {
		if(extremelyRobust) {
			return "Robust "+super.toString();
		}
		else return "not robust "+super.toString();
	}
}
