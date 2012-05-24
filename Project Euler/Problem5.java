// Project Euler Problem 5
// finds the smallest number
// thats divisible by 1 to 20
public class Problem5 {

	public static void main(String args[])
	{
		System.out.println(smallestDiv(20));
	}
	
	// checks numbers starting at the upperlimit and going until a number is 
	// found to see if it's divisible by all the numbers from 1 to
	// the upper limit
	static int smallestDiv(int upperLimit)
	{
		boolean notIt = false;
		int result = upperLimit;
		
		while(true)
		{
			for(int i = 0; i < upperLimit && !notIt; i++)
			{
				if(result %(i+1)  != 0)
					notIt = true;
					
			}
			
			if(!notIt)
			{
				return result;
			}
			
			result++;
			notIt = false;
			
		}
		
		
	}
	
}
