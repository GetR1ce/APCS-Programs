package Calendar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numTests = scan.nextInt();
		
		for(int i = 0; i<numTests; i++)
		{	
			int day = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
			MyCalendar calendar = new MyCalendar(day, month-1, year);
			System.out.println(calendar.dayOfWeek());
			
		}
		scan.close();
	}

}
