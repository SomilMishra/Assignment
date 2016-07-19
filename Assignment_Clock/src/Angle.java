import java.io.IOException;
import java.util.Scanner;
public class Angle 
{
	int hrhand1;
	int minhand1;
	
	void enterTime()
	{
		// Enter the time in HH:MM  format
		Scanner a= new Scanner(System.in);
		System.out.print("Enter your Time IN HH:MM format: ");
		String time = a.nextLine();
		a.close();
		System.out.println("You entered Time: " + time);
		
		// Split the string
		String[] parts = time.split(":");
		String hrhand = parts[0];
		String minhand = parts[1];
				
		// Convert string into integers
		hrhand1=Integer.parseInt(hrhand);
		minhand1=Integer.parseInt(minhand);
		
		// Covert 24 hrs format into 12 hours
		if (hrhand1 > 12 && hrhand1 <=24)
		{
			hrhand1 = hrhand1-12;
		}
	}
	
	void calculateAngle()
	{
		// Convert the Hours and Minutes in angle
		if (hrhand1 >=0 && hrhand1 <=12)
		{
			if (minhand1 >=0 && minhand1 <=59)
			{
				double hr_angle= (hrhand1 * 30) + (minhand1 * 0.5); 
				// 12 hrs=360 degrees, 1 hr = 30 degrees
				// 60 mins=30 degrees,  1 min = 0.5 degree
				
				double min_angle= (minhand1 * 6);
				// 60 mins = 360 degrees, 1 min = 6 degrees
								
				// Calculate the difference
				double difference = Math.abs(hr_angle-min_angle);
				//System.out.println("The difference is" + difference);
				if (difference > 180)
				{
					difference = 360-difference;
					System.out.println("Shortest angel b/w the Hour hand and Minute hand: " + difference);
				}
				else
					System.out.println("Shortest angel b/w the Hour hand and Minute hand: " + difference);
			}
			
		}
		else
		{
			System.out.println("Wrong Entry");
		}
	}
	public static void main(String[] args) 
	{
		Angle angle = new Angle();
		angle.enterTime();
		angle.calculateAngle();
		System.out.println("Thank You");
    }	
}
