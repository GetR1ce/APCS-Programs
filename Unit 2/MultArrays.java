package Proj1;

import java.util.Arrays;

public class MultArrays {
		
	static int[][] multiply(int[][] arr, int[][] arr2){
		int[][] arr3 = new int[0][0];
		int[][] ans = new int[arr.length][arr2[0].length];
		if (arr[0].length == arr2.length){
			for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr2[0].length; j++){
					for(int k = 0; k < arr[0].length; k++){
						ans[i][j] += arr[i][k]*arr2[k][j];
					}
				}
			}
			return ans;
		}
		else 
			return arr3;
	}
	// matrix multiplication = 1sts row by 2nds column finding first row of resulting
	
	public static void main(String[] args){
		
		int[][] arr = new int[][] {{2,0},{1,1}}; //new int[2][2];
		int[][] arr2 = new int[][] {{0,6,3,},{0,5,0}};
		
		System.out.println(Arrays.deepToString(multiply(arr, arr2)));
		
	}
}
