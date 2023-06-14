package inheritance;

public class HandHoldBag extends Bag {
	
	boolean premiumQuality;
	
	public HandHoldBag(boolean quality) throws Exception {
		super(5, 2.0);
		this.premiumQuality=quality;
	}
	public String toString() {
		if(premiumQuality) {
			return "Premium Quality handheld bag "+super.toString();
		}else {
			return "Standard Quality handheld bag "+super.toString();	
		}
	}
}
