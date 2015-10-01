package U2;

import java.util.Scanner;

public class Game24 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		if (n!=3 && n!=1 && n!=2){
			System.out.println("YES");
			
				if (n%2 == 0){
					System.out.println("4 * 3 = 12");
					System.out.println("12 * 2 = 24");
					System.out.println("24 * 1 = 24");
					
						while (n > 4){
							System.out.println(n+" - "+(n-1)+" = 1");
							System.out.println("1 * 24 = 24");
							n = n-2;
						
					}
				}
				else if (n%2 != 0){
					System.out.println("5 * 4 = 20");
					System.out.println("20 + 3 = 23");
					System.out.println("23 + 2 = 25");
					System.out.println("25 - 1 = 24");
					
						while(n > 5){
							System.out.println(n+" - "+(n-1)+" = 1");
							System.out.println("1 * 24 = 24");
							n = n-2;
						}
					
				} 
			}
			
		
		else 
			System.out.println("NO");
		
		s.close();
		//if odd use first 5, 1 2 3 4 5 6 7 = ((5*4)+(3+2)-1)*(7-6)
		//if even use first 4, 1 2 3 4 5 6 = (24) * (6-5)
	}
	private static int n;
	private static int counter;
	private int num2;
	//http://codeforces.com/problemset/problem/468/A

	}


