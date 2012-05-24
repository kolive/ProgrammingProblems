import java.util.Scanner;

// Java solution to codeforces problem 58A "Chat room"
// This problem is to determine whether or not the string
// "hello" appears in the correct order in a given string
public class Problem58A {
	
	static Scanner sr = new Scanner(System.in);
	public static void main(String args[])
	{
		String target = "hello";
		String vas = sr.nextLine();
		String received = "";
		int cur = 0;
		
		//uses a current index of the character in the target string ("hello")
		//and navigates the string until it finds a match.
		//when it finds a match it adds it to the received string
		for(int i = 0; i < vas.length(); i++)
		{
			
			if(cur <= 4 && vas.length() > cur)
			{
				if(target.charAt(cur) == vas.charAt(i))
				{
					received += Character.toString(vas.charAt(i));
					if(target.equals(received))
						i = vas.length() + 10;
					cur++;
				}
			}	
		}
		
		//if the recieved string is filled,
		// it should equal the target
		// then "hello" is present.
		if(target.equals(received))
			System.out.println("YES");
		else
		{
			System.out.println("NO");
		}
		
		
	}


}