package U2;

import java.util.Scanner;

public class Bacteria {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int total = s.nextInt();
		int count = total%2;
		total = total/2;
		
		for(int i = total; i > 0; i = i/2){
			if(i%2==1){
				count++;
			}
		}
		
		System.out.print(count);
		//do %2
		//do /2
	}

}
