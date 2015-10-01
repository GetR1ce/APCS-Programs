package U2;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		boolean e = true;
		
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int[][]mat = new int[count][count];
		
		mat[0][0] = 1;
		
		for(int i = 1; i < count; i++){
			
			for (int r=0; r <= i ; r++)
			
			if (r == 0 || r ==i){
				mat[i][r] = 1;
			}
			else{
			mat[i][r] = mat[i-1][r] + mat[i-1][r-1];
			}
			
		}
		
		for (int x = 0; x < count; x++){
			System.out.println("");
			for (int y = 0; y < x + 1; y++){
				System.out.print(mat[x][y] + " ");
			}
		}
		
	}

}
