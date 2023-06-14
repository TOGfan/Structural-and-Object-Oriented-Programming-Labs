package inheritance;

public class Item {

	private String name;
	private double weight;
	
	public Item(String name, double weight) throws Exception{
		if(name!=null&&name.length()>=0) {
			this.name=name;
		}
		else {
			throw new Exception();
		}
		if(weight>=0.1&&weight<=10.0) {
			this.weight=weight;
		}
		else {
			throw new Exception();
		}
	}
	
	public double getWeight() {
		return this.weight;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return name+" "+weight;
	}
		
}
