package homework;

public class Homework {
	public static boolean isAscending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>=arr[i])return false;
		}
		return true;
	}
	public static void showMax(int[][] arr) {
		int max=arr[0][0];
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
	public static double getAverageValue(int [][]arr) {
		double average=0;
		int amount = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				average=average+arr[i][j];
				amount++;
			}
		}
		return average=average/amount;
	}
	public static int longestRow(int[][] arr) {
		int longest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length>longest) {
				longest=arr[i].length;
			}
		}
		return longest;
	}
	public static void main(String[] args) {
		int [][] arr = {
			{1, 4, 17},
			{7, 127},
			{3, 15, 19, 22,5}
		};	
		showMax(arr);
		System.out.println(getAverageValue(arr));
	}

}
