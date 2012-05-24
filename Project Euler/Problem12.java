
public class Problem12 {
	
	public static void main(String args[])
	{
		int[] triangles = triangleNumCalculator(1000);
		
		for(int i = 0; i < triangles.length; i++)
		System.out.println(triangles[i]);
	}
	
	static int[] triangleNumCalculator(int limit)
	{
		int[] triangles = new int[limit];
		triangles[0] = 1;
		for(int i = 1; i < limit; i++)
		{
			for(int n = 0; n < i+2; n++)
				triangles[i] += n;
		}
		
		return triangles;

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

}
