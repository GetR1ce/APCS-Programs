package Proj1;

public class Maths
{
	private static int cnt = 0;
	
	public static int getCount(){
		return cnt;
	}
	
	public static double getSqrRt(double num){
		double x;	
		 
		double squareRoot = num / 2;		
	 
		do {
			x = squareRoot;							
			squareRoot = (x + (num / x)) / 2;	
		} while ((x - squareRoot) != 0);		
													
		cnt++;										
		
		return squareRoot;
	}
	
	public static String getLine(double x1, double y1, double x2, double y2){
		double slope = (y2-y1)/(x2-x1);
		double yInt = y1-(slope*x1);
		
		cnt++;
		
		if (yInt != 0)
		return("y = " + slope + "x + " + yInt);
		
		else 
			return(("y = " + slope + "x"));
		
	}
	
	public static String solveQuadratic(double a, double b, double c){
		double solution1;
		double solution2;
		double discriminant = Math.sqrt((b*b)-(4*a*c));
		if (discriminant > 0)
		{
			solution1 = ((-b) + discriminant)/(2*a);
			solution2 = ((-b) - discriminant)/(2*a);
			
			solution1 = Math.round(solution1 * 100.0) / 100.0;
			solution2 = Math.round(solution2 * 100.0) / 100.0;

			return("First Solution: " + solution1 + " Second Solution " + solution2);
		}
		else  
			return("No solution");
	}
	
	public static String defSphere(double radius){
		double sphereVol = (4.0/3)*Math.PI*(radius*radius*radius);
		double sphereSA = 4*Math.PI*(radius*radius);
		
		sphereVol = Math.round(sphereVol * 100.0) / 100.0;
		sphereSA = Math.round(sphereSA * 100.0) / 100.0;
		
		return ("Sphere Volume: " + sphereVol + " Sphere Surface area = " + sphereSA);
	}
}
//pastie.org/10351352