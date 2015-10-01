package U2;

public class Primes {
	
	public static int countPrimes(int n){
		numPrimes = 0;
		prime = 2;

		while (prime <= n){			
			b = true;
			for (int num = 2; num < prime; num++){	
				if (prime%num == 0){
					b = false;
					break;
				}
				
			}
			if (b==true){
				numPrimes++;
			}
			prime++;
		}
		return numPrimes;
	}
	public static boolean b;
	public static int prime;
	public static int numPrimes;
}
