package recursion2;

public class Recursion2 {

	public static int factorial(int x) {
		if(x<0) {
			return 0;
		}
		if(x==0) { 
			return 1;
		}
		return x*factorial(x-1);
	}
	public static int sumXY(int x, int y) {
		if(x>y) {
			return 0;
		}
		if(x==y) {
			return y;
		}
		return x + sumXY(x+1, y);
	}
	public static int numberDigit(int x, int digit) {
		if(x<=0) {
			return 0;
		}
		if(x%10==digit) {
			return 1 + numberDigit(x/10, digit);
		}
		else {
			return numberDigit(x/10, digit);
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
