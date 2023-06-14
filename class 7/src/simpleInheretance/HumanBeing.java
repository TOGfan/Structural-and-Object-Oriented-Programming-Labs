package simpleInheretance;

public class HumanBeing {
	// null or empty names are not allowed,
	// the first letter must uppercase, the rest lowercase.
	// if necessary correct (change to proper form) the cases.
	protected String name; 
	// the id must consist of 6 digits starting with non zero
	protected int id;
	// >1 and <120
	protected int age;
	public HumanBeing(String name, int id) throws Exception  {

		if(name==null||name.length()<=0) {
			throw new Exception();
		}
		if(Character.isLowerCase(name.charAt(0))){
			Character.toUpperCase(name.charAt(0));
		}	
		 for(int i=1; i<name.length(); i++){
             if(Character.isUpperCase(name.charAt(i))) {
                 Character.toLowerCase(name.charAt(i));
             }
		 }
		 if(id>=120||id<=1) {
			 throw new Exception();
		 }
		 this.name = name;
		 this.id = id;
	}

	public String toString() {
		return this.name+" "+this.id;
	}
	// two objects of the HumanBeing class are equal if they have the same id
	// in all other cases return false
	public boolean equals(Object ob) {
		if (!(ob instanceof HumanBeing)) {
			return false;
		}else {
			return ((HumanBeing)ob).id==this.id;	
		}

	}
	// if the ob is not a proper HumanBeing return -1
	// in all other cases use alphabetical, case not sensetive ordering of name,
	// use a proper method from the String class
	public int compareTo(Object ob) {
		if (!(ob instanceof HumanBeing)) {
			return -1;
		}
		return name.compareTo(((HumanBeing)ob).name);	
	}
	public String getName() {
	return name;
	}
	public int getId() {
	return id;
	}

	public boolean setAge(int age) {
		if(age<=0||age>130) {
			return false;
		}
		else {
			this.age = age;
			return true;
		}
	// enter your code here
	}
	public int getAge() {
		return this.age;
	// enter your code here
	}
	public static void testMe() {
	// enter the test code here
	}
	public static void main(String[] args) {
	testMe();
	}
	
}
