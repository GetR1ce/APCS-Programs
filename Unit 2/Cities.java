import java.util.Scanner;

public class Cities {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int candidates = s.nextInt();	
		int cities = s.nextInt();		
		int holder = 0;
		int win = 0;
		int win1 = 0;
		int max= 0;
		
		int[] winner = new int[candidates];	
		
		for(int x = 0; x < cities; x++){
			int[] city = new int[candidates];	
			max = 0;
			holder = 0;
				for(int i = 0; i < candidates; i++){		
					city[i] = s.nextInt();
					
						if (city[i] > max) {	
							max = city[i];		
							holder = i;
						}
				}
				winner[holder] = winner[holder] + 1;
		}
		//System.out.println(winner[0] + " " + winner[1]);
		holder = 0;
		win = 0;
		
		for(int y = 0; y < winner.length; y++){		
			if (winner[y] > win){
				win = winner[y];
				holder = y;
			}
		}
		
		win1 = holder + 1;
		System.out.println(win1);
	}	
	
}
