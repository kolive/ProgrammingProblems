import java.io.*;
//Project Euler Problem 8
//finds the longest product
// of 5 consecutive numbers
// in the 1000 digit number.
public class Problem8 {
	
	public static void main(String args[])
	{
		File inFile = new File("/home/Kyle/workspace/ProjectEuler/src/problem8");
		
		//reads in the number
		// converts it to an int array
		try {
			char[] myCharArray = (readTextFile(inFile)).toCharArray();
			int[] myIntArray = new int[myCharArray.length];
			
			for(int i = 0; i < myCharArray.length;i++)
			{
				myIntArray[i] = Integer.parseInt(Character.toString(myCharArray[i]));
			}
			
			System.out.println(bigMultipleFinder(myIntArray));
			
		} catch (IOException e) {
			System.out.println("Exception Caught: " + e);
		}
	}
	
	static String readTextFile(File fromFile) throws IOException
	{
		BufferedReader myReader = new BufferedReader(new FileReader(fromFile));
		String tmp = null;
		String result = "";
		
		while((tmp=myReader.readLine()) != null)
		{
			result += tmp;
		}
		
		myReader.close();
		
		return result;
	}
	
	//tries all combinations of 5 consecutive numbers
	// returns the largest product.
	static int bigMultipleFinder(int[] arrayOfInts)
	{
		int cur = 0;
		int max = 0;
		
		if(arrayOfInts.length < 5)
			return -60;
		
		for(int i = 4; i < arrayOfInts.length; i++)
		{
			cur = arrayOfInts[i-4] * arrayOfInts[i-3] * 
				arrayOfInts[i-2] * arrayOfInts[i-1] * arrayOfInts[i];
			
			if(cur > max)
			{
				max = cur;
			}
		}
		
		return max;
	}
	

}
