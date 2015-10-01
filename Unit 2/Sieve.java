package U2;

import java.util.Scanner;

public class Sieve{

	
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
	boolean[] b = new boolean[num+1];
		
		for(int i = 2; i <= num; i++){
			if(b[i] == false)
			{
				for(int c = i * i; c <= num; c = c + i){
					b[c] = true;
				}
			}
		}
		
		for(int x = 2; x <= num; x++){
			if(b[x] == false){
				System.out.print(x + " ");
			}
		}
		
	}
	//579a
}
