import java.util.Scanner;

// Java solution for codeforces problem 4A. "Watermelon"
// This problem required you to determine whether a given weight
// was divisible into two equal parts
public class Problem4A {
	
	static Scanner sr = new Scanner(System.in);
	public static void main(String args[])
	{
		int weight = sr.nextInt();
		
		//If something is divisible into two equal parts
		// it's both even, and bigger than 2.
		if(weight > 2 && weight % 2 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
