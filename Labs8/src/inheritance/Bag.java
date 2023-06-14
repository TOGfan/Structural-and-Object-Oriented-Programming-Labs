package inheritance;

public class Bag {
	private int bagCapacity;
	private double maxWeight;
	private Item[] content;
	

	public Bag(int bagCapacity, double maxWeight) throws Exception {
		if (bagCapacity <= 50 && bagCapacity >= 1) {
			this.bagCapacity = bagCapacity;
			content = new Item[bagCapacity];
		} else {
			throw new Exception();
		}
		if (maxWeight >= 0.1 && maxWeight <= 20.0) {
			this.maxWeight = maxWeight;
		} else {
			throw new Exception();
		}
	}

	public void removeAllItems() {
		for (int i = 0; i < content.length; i++) {
			content[i] = null;
		}
	}

	public boolean putIn(Item item) {
		if (this.getTotalWeight() + item.getWeight() <= this.maxWeight) {
			for (int i = 0; i < this.bagCapacity; i++) {
				if (content[i] == null) {
					content[i] = item;
					return true;
				}
			}
		}
		return false;
		// … returns false if putting the item would result in exceeding the number of
		// Items or the their total weight.
	}

	public int getCapacity() {
		return this.bagCapacity;
		// … returns the capacity of the bag
	}
	public double getMaxWeight() {
		return this.maxWeight;
	}

	public int getItemNo() {
		int numItems=0;
		for(int i=0;i<this.bagCapacity;i++) {
			if(content[i]!=null) {
				numItems++;
			}
		}
		return numItems;
		// … returns the number of Items in the bag
	}

	public double getTotalWeight() {
		double totalWeight=0;
		for (int i = 0; i < this.bagCapacity; i++) {
			if (content[i] != null) {
				totalWeight+=content[i].getWeight();
			}
		}
		return totalWeight;
		// … returns the combined weight of all items in the
	}

	public boolean isEmpty() {
		return getItemNo()==0;
	}

	public boolean isFull() {
		return getItemNo()==this.bagCapacity;
	}

	public void removeAll() {
		for(int i=0;i<this.bagCapacity;i++) {
			content[i]=null;
		}
		// … removes all items from the bag
	}

	public boolean removeTheHeaviest() {
		double maxWeight=0;
		int heaviest = -1;
		for(int i=0;i<this.bagCapacity;i++) {
			if(content[i]!=null&&content[i].getWeight()>maxWeight) {
				maxWeight=content[i].getWeight();
				heaviest=i;
			}
		}
		if(heaviest==-1) {
			return false;
		}
		content[heaviest]=null;
		return true;
		// .. remove the heaviest(s) items from the bag
	}

	public String toString() {
		String bagString = this.bagCapacity+" "+this.maxWeight;
		for(int i=0;i<this.bagCapacity;i++) {
			if(content[i]!=null) {
				bagString = bagString+" "+content[i].getName();
		
			}
		}	
		return bagString;
	}
}
