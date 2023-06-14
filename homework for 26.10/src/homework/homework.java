package homework;
import java.util.Scanner;

public class homework {
	public static boolean isAscending(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>=arr[i]) {
				return false;
			}
		}
		return true;
	}
//3. a
	public static int showMax(int [][] arr) {
		if(arr==null) {return Integer.MIN_VALUE;}
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;i++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				
			}
		}
		return max;
	}
//3. b
	public static double getAverageValue(int [][] arr) {
		int sum=0;
		int amount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;i++) {
				amount ++;
				sum=sum+arr[i][j];
			}
		}
		return (double)sum/amount;
	}
//3. c
	public static int longestRow(int [][] arr) {
		int longestRow=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length>longestRow) {
				longestRow=arr[i].length;
			}
		}
		return longestRow;
	}
//4.
	static int[][] createArr(int n) {
		int [][]triangleArray = new int[n][];
		for(int i=0;i<n;i++) {
			triangleArray[i] = new int[i+1];
		}
		return triangleArray;
	}
//5.
	static void fillArr(int [][] data) {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;i++) {
				data[i][j]=0;
			}
		}
	}
//6.
	static void readAndSkip(int [][] data) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				
				if(sc.hasNextInt()) {
					data[i][j]=sc.nextInt();
				}
				else {
					data[i][j]=-1;
				}
			}
		}
		sc.close();
	}
	
//7.
	static int[] flattenArr(int [][] data) {
		int flatLength=0;
		for(int i=0;i<data.length;i++) {
			flatLength+=data[i].length;
		}
		int []flat = new int[flatLength];
		int k=0;
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;i++) {
				flat[k]=data[i][j];
				k++;
			}
		}
		return flat;
	}
	public static void main(String[] args) {
//1.
		/*
		int ascArray[] = {1,12,4,5,7,6,10};
		System.out.println(isAscending(ascArray));
//2.
		int[][] testArray = {	{1,4,17},
								{7,127},
								{3,15,19,22,5}
								};
//3.
		System.out.println(showMax(testArray));
		System.out.println(getAverageValue(testArray));
		System.out.println(longestRow(testArray));
	*/
		int [][] arr = createArr(2);
		readAndSkip(arr);
		System.exit(0);
	}

}
