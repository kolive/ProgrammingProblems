
import java.util.Scanner;

//Java solution for Problem116A
// Train & Min Capacity Question
public class Problem116A 
{
	static Scanner sr = new Scanner(System.in);
	public static void main(String args[])
	{
		int numberOfStops = 0;		
		
			numberOfStops = sr.nextInt();

			System.out.println( minCapacity(numberOfStops) );
	}
	
	//Goes through every stop and keeps track of the maximum amount of people
	//on the train during the journey. This is the minCapacity.
	static int minCapacity(int stops)
	{
		int minCap = 0;
		int numberOfPeople = 0;

			for(int i = 0; i < stops; i++)
			{
				
				

					numberOfPeople -= sr.nextInt();
					numberOfPeople += sr.nextInt();
				
				if(numberOfPeople > minCap)
					minCap = numberOfPeople;
				
			}


		
		return minCap;
	}
}
