package simpleInheretance;

import java.util.ArrayList;
import java.util.List;

public class Student extends HumanBeing {
	private List<Double> grades = new ArrayList<Double>();
	public Student (int age, String name, int id) throws Exception {
		super(name, id);
		super.setAge(age);
		// enter your code here
	}
		public boolean storeGrade(double grade) {
			if(grade==2.0||grade==3.0||grade==3.5||grade==4.0||grade==4.5||grade==5.0||grade==5.5) {
				grades.add(grade);
				return true;
			}
			else {
				return false;	
			}

		// allowed values: 2.0, 3.0, 3.5, 4.0, 4,5 5,0, 5,5
		// enter your code here
		}
		public Double getAverageGrade() {
			if(grades.size()==0) {
				return (Double)null;
			}else {
				double sum=0;
				for(int i=0;i<grades.size();i++) {
					sum=sum+(double)grades.get(i);
				}
				return sum/grades.size();
			}
		// return null if there are no grades
		// enter your code here
		}
		public double[] getAllGrades() {
			if(grades.size()==0) {
				return null;
			}
			double[] gradesArr = new double[grades.size()];
			for(int i=0;i<grades.size();i++) {
				gradesArr[i]=(double)grades.get(i);
			}
			return gradesArr;
		// return null if there are no grades
		// enter your code here
		}
		public String toString() {
			String s = super.toString();
			for(int i=0;i<grades.size();i++) {
				if(i%4==0) {
					s=s+"\n";
				}
				s=s+String.valueOf(grades.get(i));
			}
			return s;
		}
}
