import java.util.Scanner;

// Java solution for the "Double Cola" codeforces problem
// In this problem you have 5 people in a line, when they drink a double cola,
// they turn into two and go to the end of the line.

public class Problem82A {
	
	public static void main(String args[])
	{
		int drinkNum = 0;
		
		
		String[] names = { "Sheldon", "Leonard","Penny", "Rajesh", "Howard"};
		try {
			 Scanner sc = new Scanner(System.in);
		     drinkNum = sc.nextInt();
			 System.out.println(names[doubleCola(drinkNum)]);
			
		} catch (Exception e) {
			System.out.println("Exception Caught: " + e);
		}
		

		
	}
	
	//determines the index of the person who drinks, given the drink number
	static int doubleCola(int drinkNum)
	{
		//saves the current range
		int range = rangeDeterminer(drinkNum);
		int modifier = (int) Math.pow(2, range-1);
		int result = 0;
		
		
		for(int i = (int) (Math.pow(2, range-1)*5 -4); 
			i < Math.pow(2, range) * 5 - 4; i += modifier)
		{
			if(drinkNum >= i && drinkNum < i+modifier){
				return result;
			}
			
				result++;
			
		}
		
		return -1;
		
		
	}
	
	//Determines the range of the drink
	static int rangeDeterminer(int drinkNum)
	{

		
		for(int i = 1; i < 30; i++)
		{
			if(drinkNum >= (Math.pow(2, i-1)*5 - 5) && drinkNum <= (Math.pow(2, i)*5) - 5)
			{
				return i;
			}
		}
		
		return -1;
	}
	

}
