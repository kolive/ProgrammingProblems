// Project Euler Problem 2
// Finds the sum of even valued terms of the Fibbonaci Sequence
// Where the biggest term is under 4 million
public class Problem2 {
	static int result = 0;
	
	public static void main(String args[])
	{
		fibCalc(4000000);
		System.out.println(result);
		
	}
	
	//returns the sum of the even valued terms
	//with the biggest term being that passed as the arg
	static void fibCalc(int biggestVal)
	{
		//creates a temp array to store calculated answers
		int[] tfibArray = new int[9999];
		int currentValue = 0;
		int i;
		tfibArray[0] = 0;
		tfibArray[1] = 1;
		
		//calculates the fibonacci values, adding the even ones
		//to the sum
		for(i = 2; currentValue <= biggestVal; i++)
		{
			
			System.out.println(currentValue);
			
			if(currentValue %2 == 0)
			result += currentValue;
			
			currentValue = tfibArray[i-2] + tfibArray[i-1];
			tfibArray[i] = currentValue;
			
		}
		
		
	}
	

}
