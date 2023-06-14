package simpleInheretance;

public class Main {
	public static void showAllStudents(HumanBeing[] data) {
			for(int i=0;i<data.length;i++) {
				if(!(data[i] instanceof Student) ) {	
					continue;		
				}
				System.out.println(data[i].toString());
			}
		}
		public static void bestStudents(HumanBeing[] data) {
			double max=Double.MIN_VALUE;
			for(int i=0;i<data.length;i++) {
				if(!(data[i] instanceof Student) ) {
					continue;
				}
				if(((Student)data[i]).getAverageGrade()==null) {
					continue;
				}
				if(((Student)data[i]).getAverageGrade()>max) {
					max=((Student)data[i]).getAverageGrade();
				}
			}
			for(int i=0;i<data.length;i++) {
				if(!(data[i] instanceof Student) ) {
					continue;
				}
				if(((Student)data[i]).getAverageGrade()==null) {
					continue;
				}
				if(((Student)data[i]).getAverageGrade()==max) {
					System.out.println(data[i].getName());
				}
			}
		}
		public static Double getAvgSeniors(HumanBeing [] data, double minYears) {
			int counter=0;
			int sum=0;
			for (int i=0;i<data.length;i++) {
				if(!(data[i] instanceof Teacher) ) {
					continue;
				}
				if(((Teacher)data[i]).getYearsOfWork()>minYears) {
					counter++;
					sum=sum+((Teacher)data[i]).getYearsOfWork();
				}
			}
			return (double)sum/counter;
		}

	public static void main(String[] args) {
		HumanBeing[] humans = new HumanBeing[8];
		for(int i=0;i<8;i++) {
			if(i<4) {
				try {
					humans[i]= new Student(18,"Xyz",i+10);
				}
				catch (Exception ex) {
					System.out.println("Illegal arguments for Student");
				}
				
			}
			else {
				try {
					humans[i] = new Teacher(30,5,"Abc",i+10);
				}
				catch(Exception ex) {	
					System.out.println("Illegal arguments for Teacher");
				}
			}
		}
		showAllStudents(humans);
		bestStudents(humans);
		System.out.println(getAvgSeniors(humans, 4));
	}
}
