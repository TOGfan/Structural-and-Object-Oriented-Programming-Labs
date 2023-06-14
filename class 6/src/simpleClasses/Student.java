package simpleClasses;

public class Student {
	private String name; // null or empty names are not allowed, default value
	//"Joe Doe"
	private int id; // the id must consist of 6 digits, default value -1
	// use default values in the case of any problem
	public Student(String name, int id) {
		if(name.length()>0) {
			this.name=name;
		}else {
			this.name = "Joe Doe";
		}
		if(id>=100000&&id<1000000) {
			this.id = id;
		}else {
			id=-1;
		}
		// insert your code here
	}
	public String toString() {
		return this.name+String.valueOf(this.id);
	// insert your code here
	}
	// two objects of the \student class are equal if they have the same id
	// in all other cases return false
	public boolean equals(Object ob) {
		if(!(ob instanceof Student)) {
			return false;
		}else {
			return((Student)ob).getId()==this.id;
		}
		
	// insert your code here
	}
	// if ob is not a student return -1
	// if the object or ob is not a proper Student return -1
	// in all other cases use alphabetical, case not sensetive ordering of name,
	//use a proper method from the String class
	public int compareTo(Object ob) {
		if(!(ob instanceof Student)) {
			return -1;
		}else {
			return((Student)ob).name.compareToIgnoreCase(this.name);
		}
	// insert your code here
	}
	public String getName() {
		return name;
	}
	public int getId() {
	return id;
	}
	public boolean isProper() {
	// insert your code here
	}
	
}
