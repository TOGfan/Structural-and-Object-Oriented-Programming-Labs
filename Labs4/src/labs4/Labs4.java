package labs4;
import java.util.Scanner;
public class Labs4 {
private static Scanner scKeyboard= new Scanner(System.in);
/* input data from standard input, if there is not enough data fill
* the remaining elements with 0's.
* Stop reading the numbers after filling the array.
* All tokens that do not represent a number must be ignored
*/
	public static int[] readArray(int size) {
		int i=0;
		int[] arr = new int[size];
		while(scKeyboard.hasNext()&&i<size) {
			String input=scKeyboard.next();
			try {
				int number = Integer.parseInt(input);
				arr[i]=number;
				i++;
			}
			catch(Exception ex) {
				System.out.println("Not a number");
			}
		}
		return arr;
	// input your code here, use the scKeyboard to read data
	// skip all tokens that do not represent numbers
	}
	
	public static int[] appendArrays(int [] a1, int [] a2) {
		int[] arr = new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			arr[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			arr[i+a1.length]=a2[i];
		}
		return arr;
	// input your code here
	}
	
	public int getMinimalElement(int [] inArr) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<inArr.length;i++) {
			if(inArr[i]>min) {
				min=inArr[i];
			}
		}
		return min;
		// input your code here
	}
	
	// resulting array should contain all elements have the minimal value
	public int[] getMinimalElements(int [] inArr) {
		int min=getMinimalElement(inArr);
		for(int i=0;i<inArr.length;i++) {
			if(inArr[i]==min) {
				
			}
		}
	// input your code here
	}
	// resulting array should contain elements that are >= limit
	public int[] getGreaterThan(int[] inArr, int limit) {
		int counter=0;
		for(int i=0;i<inArr.length;i++) {
			if(inArr[i]>=limit) {
				counter++;
			}
		}
		int[] arr = new int[counter];
		int j=0;
		for(int i=0;j<arr.length;i++) {
			if(inArr[i]>=limit) {
				arr[j]=inArr[i];
				j++;
			}
		}
		return arr;
		// input your code here
	}
	// resulting array should contain elements that are >= lowrLimit and <=upperLimit
	public int[] getRange(int[] inArr, int lowerLimit, int upperLimit) {
		int counter=0;
		for(int i=0;i<inArr.length;i++) {
			if(inArr[i]>=lowerLimit&&inArr[i]<=upperLimit) {
				counter++;
			}
		}
		int[] arr = new int[counter];
		int j=0;
		for(int i=0;j<arr.length;i++) {
			if(inArr[i]>=lowerLimit&&inArr[i]<=upperLimit) {
				arr[j]=inArr[i];
				j++;
			}
		}
		return arr;
	// input your code here
	}
	public int elementCount(int[] inArr, int what2Look4) {
		int counter=0;
		for(int i=0;i<inArr.length;i++) {
			if(inArr[i]==what2Look4) {
				counter++;
			}	
		}
		return counter;
	// input your code here
	}
	public static int countCommonElements(int [] a1, int [] a2) {
		int counter=0;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					counter++;
				}
			}
		}
		return counter;
	}
	// resulting array contains elements that are in exactly one array
	public static int[] uniqueElements(int [] a1, int [] a2) {
		int[] result = new int[a1.length+a2.length-2*countCommonElements(a1,a2)];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					
				}
			}
		}
	// input your code here
	}
	// resulting array should contain elements that are in both arrays
	public static int[] commonElements(int [] a1, int [] a2) {
		int[] result = new int[countCommonElements(a1,a2)];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					result[]=a1[i];
				}
			}
		}
	// input your code here
	}
	public static void reverseMe(int[] inOutArr) {
		int[] temp=new int[inOutArr.length];
		for(int i=0;i<inOutArr.length;i++) {
			temp[temp.length-i-1]=inOutArr[i];
		}
		for(int i=0;i<inOutArr.length;i++) {
			inOutArr[i]=temp[i];
		}		
		// input your code here, modify the input array
	}
	// return an array with elements in reversed order
	public static int[] returnReversed(int[] inArr) {
		int[] reversed=new int[inArr.length];
		for(int i=0;i<inArr.length;i++) {
			reversed[reversed.length-i-1]=inArr[i];
		}
		return reversed;
	// input your code here, keep the input array intact
	}
	public static void showArr(int [] arrIn, int numberOfColumns) {
		for(int i=0;i<arrIn.length;i++) {
			if(i%numberOfColumns==0) {
				System.out.print("\n");
			}
			System.out.print(arrIn[i]);
		}
	// input your code here
	}
	public static void main(String[] args) {
	// Test calls to all above methods
	// Except for the readArray method use initialized arrays for testing.
	// input your code here, modify the input array
	}

}
