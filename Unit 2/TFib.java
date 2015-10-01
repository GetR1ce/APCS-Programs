package U2;

import java.util.Scanner;

public class TFib {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		Fib f = new Fib(x);
		System.out.println(f.getNum());

	}

}
