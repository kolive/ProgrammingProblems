// Project Euler Problem 10
// finds the sum of all the primes
// below 2 million
public class Problem10 {
	

	public static void main(String args[])
	{
		
		long result = 0;
		boolean primes[] = sieveOfE(2000000);
		
		for(int i = 2; i<primes.length; i++)
		{
			if(primes[i])
			result += i;
		}
		
		System.out.println(result);
	}

	//generating primes up to primeLimit
	//using the sieve of Eratosthenes
	//see blog post for description
	static boolean[] sieveOfE(int primeLimit)
	{
		boolean[] primes = new boolean[primeLimit];
		int current = 2;
		
		for(int i = 0; i<primeLimit; i++)
		{
			primes[i] = true;
		}
		
		for(int i = 2; i<Math.sqrt(primeLimit); i++)
		{
			if(primes[i] == true)
			{
			  while(i*current < primeLimit)
			  {
				  primes[i*current] = false;
				  current++;
			  }
			  current = 2;
			}
		}
		
		return primes;
		
	}
		
		

}
