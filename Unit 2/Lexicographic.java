package U2;

import java.util.Scanner;

public class Lexicographic {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int holder2 = 0;
		int holder = 0;
		int min = 100;
		int num = 0;
		int total = s.nextInt();
		int[] arr = new int[total];
		
		for(int i = 0; i < total; i++){
			arr[i] = s.nextInt();
		}
		
		for(int x = 2; x < total; x++){	
			
			if (arr[(arr.length-x)]<arr[(arr.length)-x+1]){	//stops where num to left is less than num to right
																//x is the number where it needs to be replaced by bigger
				holder = x-1;
			    holder2 = arr[(arr.length-x)];
			    arr[(arr.length-x)] = arr[(arr.length-(x-1))];	
				
			}
				for(int p = 1; p<x;p++){
					
					if (arr[(arr.length-p)]<min){
						min = arr[(arr.length-p)];
						
						arr[(arr.length)-holder] = arr[(arr.length-p)];
						
					}
					
					
				}
			}
		
		for(int c = 0; c<arr.length; c++){
			System.out.print(arr[c] + " ");
		}
		System.exit(0);
	}
		//scan to see where left number is less than right
		//find number to right is bigger than one you are swapping out and less than the others
}
