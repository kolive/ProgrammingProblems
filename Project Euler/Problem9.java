// Project Euler Problem 9
// find a pythagorean triplet which a + b + c = 1000
// return a*b*c
public class Problem9 {
	
	public static void main(String args[])
	{
		int[] result = pythagTripleFinder(1000);
		
		System.out.println("a =" + result[0]);
		System.out.println("b =" + result[1]);
		System.out.println("c =" + result[2]);
		System.out.println("a*b*c = "+ result[0]*result[1]*result[2]);
		
	}
	
	//finds the pythag triplet for the given sum of a + b + c
	static int[] pythagTripleFinder(int sum)
	{
		int[] answers = new int [3];
		int a = 1;
		int b = 0;
		int c = 0;
		
		//tries different combinations of a, b, and c until
		// a^2 + b^2 = c^2
		// where c = sum - (b+a)
		for(int i = 1;!((a*a + b*b) == c*c); i++ )
		{
			a = i;
			for (int j = i;j<999 &&!((a*a + b*b) == c*c); j++)
			{
				b = j;
				c = sum - b - a;
			}
		}
		
		answers[0] = a;
		answers[1] = b;
		answers[2] = c;
		return answers;
	
	}

}
