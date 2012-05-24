
public class Problem10b {
	

	public static void main(String args[])
	{
		
		
		//boolean primes[] = sieveOfE(2000000);
		System.out.println("done1");
		
		for(int i = 0; i<2000000; i++)
		{
			isPrime(i);
		}
		System.out.println("done2");
	}

	
	static boolean[] sieveOfE(int primeLimit)
	{
		boolean[] primes = new boolean[primeLimit];
		int current = 2;
		
		for(int i = 0; i<primeLimit; i++)
		{
			primes[i] = true;
		}
		
		for(int i = 2; i<primeLimit; i++)
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
