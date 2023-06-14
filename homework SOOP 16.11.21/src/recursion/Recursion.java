package recursion;

public class Recursion {
	public static int getMaxValue(int arr[], int pos1, int pos2) {
		if(pos1<0||pos2>arr.length-1) {
			return Integer.MIN_VALUE;
		}
		if(pos2-pos1>=1) {
			int left = getMaxValue(arr, pos1, pos1+(pos2-pos1)/2);
			int right = getMaxValue(arr, pos1+(pos2-pos1)/2+1, pos2);
			if(left>right) {
				return left;
			}
			else {
				return right;
			}
		}
		return arr[pos1];
	}
		//2. Calculating the total value of array elements
	public static int getTotal(int arr[], int pos) {
		if(pos>arr.length-1||pos<0) {
			return Integer.MIN_VALUE;
		}
		if(pos<arr.length-1) {
			return arr[pos] + getTotal(arr, pos+1);
		}
		else return arr[pos];
	}
		//3. Calculating the total value of array elements greater than a given value
	public static int getTotalGrt(int[] arr, int pos, int limit) {
		if(pos>arr.length-1||pos<0) {
			return Integer.MIN_VALUE;
		}
		if(arr[pos]>limit) {
			if(pos<arr.length-1) {			
				return arr[pos] + getTotalGrt(arr, pos+1, limit);
			}
			else return arr[pos];
		}
		else {
			if(pos<arr.length-1) {
				return getTotalGrt(arr, pos+1, limit);
			}
			else return 0;
		}
	}
		//4. Printing the content in a normal way, values separated by “\t”
	public static void print(int [] arr, int pos) {
		if(!(pos>arr.length-1||pos<0)) {
			System.out.print(arr[pos]+"\t");
			if(pos<arr.length-1) {
				print(arr, pos+1);
			}
		}
	}
		//5. Printing the content in a reverse mode, values separated by “\t”
	public static void printReverse(int [] arr, int pos) {
		if(!(pos>arr.length-1||pos<0)) {
			System.out.print(arr[pos]+"\t");
			if(pos>0) {
				printReverse(arr, pos-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 0 ,3, 1};
		System.out.println(getMaxValue(arr,0,arr.length-1));
		System.out.println(getTotal(arr, 0));
		System.out.println(getTotalGrt(arr, 0, 2));
		print(arr, 0);
		System.out.println();
		printReverse(arr, arr.length-1);

	}

}
