package U2;

import java.util.ArrayList;
import java.util.Scanner;

public class AList {
	
	static void changer(ArrayList<Integer> a){
		int origSize = a.size();
		for(int i = 0; i <= origSize - 1; i++){
			a.add(a.get(i));
			a.set(i,2*a.get(i));
		}
		
	}
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(s.hasNextInt()){
			a.add(s.nextInt());
		}
		changer(a);
		System.out.print(a);
	}
}
