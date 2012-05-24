// Project Euler Problem 6
// calculates the difference of the sum of squares
// and the square of sums
public class Problem6 {
	
	public static void main(String args[])
	{
		long sumOfSquares = 0;
		long squareOfSum = 0;
		long result = 0;
		
		for(int i = 0; i <= 100; i++)
		{
			sumOfSquares += (i*i);
			squareOfSum += i;
		}
		
		squareOfSum *= squareOfSum;
		
		result = squareOfSum - sumOfSquares;
		
		System.out.println(result);
	}

}
