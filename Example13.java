package example13;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show the calculation of wind-cHill temperature.
*/
public class Example13
{ 
    public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	    double fahrenheit;
		double windSpeed;
		double a = 35.74;
		double b = 0.6215;
		double c = 35.75;
		double d = 0.4275;
		double e = 0.16;
		double windChillTemperature;
		double chillTemperature;
		double wind;
		double something;
		
		// Write a program which prompts the user to enter a temperature between -58°F and 41°F
		System.out.print("Enter a temperature in Fahrenheit between -58F and 41F: ");
		fahrenheit = in.nextDouble();
		
		// a wind speed greater than or equal to 2
        System.out.print("Enter a wind speed greater than or equal to 2 in miles per hour: ");
		windSpeed = in.nextDouble();
		
		// Calculation
		wind = a + (b * fahrenheit);
		chillTemperature = (c * Math.pow(windSpeed, e));
		something = (d * fahrenheit * Math.pow(windSpeed, e));
		windChillTemperature = wind - chillTemperature + something; 
		
		//  display the wind-chill temperature
		System.out.println("The wind chill temperature is " + windChillTemperature);
	} 
}
