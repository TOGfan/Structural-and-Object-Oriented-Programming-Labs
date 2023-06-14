package inheritance;

public class Test {

	public static void main(String[] args) {
		Item[] items = new Item[6];
		try {
			items[0]= new Item("candy", 0.2);
		} catch (Exception e) {
		}
		try {
			items[1]=new Item("orange", 1.0);
		} catch (Exception e) {
		}
		try {
			items[2] = new Item("coconut", 2.0);
		} catch (Exception e) {
		}
		try {
			items[3] = new Item("cake", 5.0);
		} catch (Exception e) {
		}
		try {
			items[4] = new Item("grape", 0.8);
		} catch (Exception e) {
		}
		try {
			items[5] = new Item("car", 500.0);
		} catch (Exception e) {
		}
		try {
			HandHoldBag hhBag1 = new HandHoldBag(true);
			for(int i=0;i<items.length;i++) {
				if(items[i]==null) {
					continue;
				}
				if(hhBag1.putIn(items[i])) {
					System.out.println("Successfully added "+items[i].getName()+" to hhBag1");
				}
			}
			System.out.println(hhBag1.toString()+" "+hhBag1.getTotalWeight()+" "+hhBag1.getMaxWeight()+" "+hhBag1.isFull()+ " "+hhBag1.isEmpty());
		} catch (Exception e) {
			System.out.println("An error occured.");
		}

	}

}
