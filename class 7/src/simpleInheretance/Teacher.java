package simpleInheretance;

public class Teacher extends HumanBeing{
	private int yearsOfWork;
	public Teacher (int age, int yearsOfWork, String name, int id) throws Exception {
		super(name, id);
		super.setAge(age);
		if(!setYearsOfWork(yearsOfWork)) {
			throw new Exception();
		}
		// 0<= yearsOfWork <=50 and less than age+20
		// enter your code here
		}
		public int getYearsOfWork() {
			return this.yearsOfWork;
			// enter your code here
		}
		public boolean setYearsOfWork(int yearsOfWork) {
			if(yearsOfWork<this.age-18&&yearsOfWork>=0) {
				this.yearsOfWork=yearsOfWork;
				return true;
			}
			return false;
			// enter your code here
		}
}
