package Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

	public MyCalendar()
	{
		
	}
	
	public MyCalendar(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	public void setNewDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String dayOfWeek()
	{
		GregorianCalendar c = new GregorianCalendar();
		c.set(GregorianCalendar.YEAR, year);
		c.set(GregorianCalendar.MONTH, month);
		c.set(GregorianCalendar.DAY_OF_MONTH, day);
		
		int dayOfWeek = c.get(GregorianCalendar.DAY_OF_WEEK);
		
		String actualDay;
		
		if (dayOfWeek == 2){
			actualDay = "Monday";
		}
		else if (dayOfWeek == 3){
			actualDay = "Tuesday";
		}
		else if (dayOfWeek == 4){
			actualDay = "Wednesday";
		}
		else if (dayOfWeek == 5){
			actualDay = "Thursday";
		}
		else if (dayOfWeek == 6){
			actualDay = "Friday";
		}
		else if (dayOfWeek == 7){
			actualDay = "Saturday";
		}
		else 			
			actualDay = "Sunday";
		
		return (actualDay);
	}
	
	int day;
	int month;
	int year;
	
}
