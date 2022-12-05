import java.util.Scanner;
import java.lang.Math;

public class ATTENDANCE {
	 public static void main(String[] args){
			Scanner sCan = new Scanner(System.in);
			
			System.out.println(" Luis Gabriel H. Laguardia (awit)");
// 1.)
			System.out.println(" ");	
			
System.out.println("enter x, y, z: ");
float x = sCan.nextFloat();
float y = sCan.nextFloat();
float z = sCan.nextFloat();


float sum = x + y + z;
float avg = sum / 3;
float pro = x * y * z;
System.out.println("Sum: " + sum + "\nAverage: " + avg + "\nProduct: " + pro);

System.out.println(" ");

// 2.) 
			double distance;
			
System.out.println("Input x1, y1, x2, y2: ");
double x1 = sCan.nextDouble();
double y1 = sCan.nextDouble();
double x2 = sCan.nextDouble();		
double y2 = sCan.nextDouble();		

distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
System.out.println("Distance: " + Math.sqrt(distance));

System.out.println(" ");

// 3.) 

	System.out.print("Input the year: ");
	int year = sCan.nextInt();

	boolean a = (year % 4) == 0;
	boolean b = (year % 100) != 0;
	boolean c = ((year % 100 == 0) && (year % 400 == 0));

	if (a && (b || c))
	{
		System.out.println(year + "'s a leap year");
	}
	else
	{
		System.out.println(year + " isnt a leap year");
	}
			
}
	}
