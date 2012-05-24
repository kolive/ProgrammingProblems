// Project Euler Problem 3
// Finds the biggest prime factor of
// 600851475143
public class Problem3 {

	
	public static void main(String args[])
	{
		//outputs all the factors of the number.
		// the bigest one will be outputted last.
		for(double i = 0; i < 600851475143.0; i++){
			if(isPrime(i) && 600851475143.0%i == 0 ){
				System.out.println(i);	
			}
				
		}
		
	}
	
	// checks if the number passed as a param is a prime.
	static boolean isPrime(double num)
	{
		// checks to see if the number has any factors, if yes returns false
		// cause this ain't no prime yo
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
