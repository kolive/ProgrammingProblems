// Project Euler Problem 4
// Finds the largest number that is the product
// of two three digit numbers
// that is a palindrome
public class Problem4 {

	public static void main(String args[])
	{
		//starting at the biggest number (999*999)
		// keeps track of the biggest palindrome,
		int result = 0;
		for(int i = 999 ; i>0; i--)
		{
			for(int j=999; j>0; j--)
			{
				if(isPalindrome(Integer.toString((i*j))))
				{					
					if(i*j > result)
					result = i*j;
				}
			}
			
		}
		System.out.println(result);
		
	}
	
	//function to determine whether a string is a palindrome
	static boolean isPalindrome(String test)
	{
		char[] toTest = test.toCharArray();
		
		for(int i = 0; i < toTest.length/2;i++)
		{
			if(toTest[i] != toTest[toTest.length-1-i])
				return false;
		}
		
		return true;
		
	}
	
}
