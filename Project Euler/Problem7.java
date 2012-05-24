// Project Euler Problem 7
//finds the 10001st prime
public class Problem7 {
	
	public static void main(String args[])
	{
		
		double result = 0;
		double cur = 0;
		double i = 0;
		
		while (cur != 10002)
		{
			if(isPrime(i))
			{
				result = i;
				cur++;
			}
			
			i++;
		}
		
		System.out.println(result);
		
	}

	static boolean isPrime(double num)
	{
		for (int i = 2; i <= Math.ceil(Math.sqrt(num)); i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		
		return true;
		
		
	}
}
