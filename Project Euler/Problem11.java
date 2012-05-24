import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Project Euler Problem 11
//finds the largest product
//of 4 adjacent numbers
//in the 20 by 20 grid.
public class Problem11 {
	
	public static void main(String args[])
	{
		File inFile = new File("/home/Kyle/workspace/ProjectEuler/src/problem11");
		int size = 20;
		try {
			String[][] myStrArray = (readTextFile(inFile, size));
			int[][] myIntArray = new int[size][size];
			
			for(int i = 0; i < size;i++)
			{
				for(int n = 0; n < size; n++)
				myIntArray[i][n] = Integer.parseInt(myStrArray[i][n]);
			}
			
			System.out.println(bigMultipleFinder(myIntArray, size));
			
			
		} catch (IOException e) {
			System.out.println("Exception Caught: " + e);
		}
	}
	
	static String[][] readTextFile(File fromFile, int size) throws IOException
	{
		BufferedReader myReader = new BufferedReader(new FileReader(fromFile));
		String tmp = null;
		String result[][] = new String[size][size] ;
		int row = 0;
		
		
		while((tmp=myReader.readLine()) != null)
		{
			String tempRow[] = tmp.split(" ");
			
			for(int i = 0; i < size; i++)
				result[row][i] = tempRow[i];
			
			row++;
		}
		
		myReader.close();
		
		return result;
	}
	
	static int bigMultipleFinder(int[][] arrayOfInts, int size)
	{
		int cur = 0;
		int max = 0;
		
		if(arrayOfInts.length < size)
			return -60;
		
		for(int i = 0; i < size-3;i++)
		{
			for(int n = 0; n < size-3; n++)
			{
				
					cur = arrayOfInts[i][n] * arrayOfInts[i+1][n+1] *
						arrayOfInts[i+2][n+2] * arrayOfInts[i+3][n+3];
					
					if(cur > max)
					{
						max = cur;
					}	
			}
			
		}
		
		for(int i = size-1; i > 2;i--)
		{
			for(int n = size-1; n > 2; n--)
			{
					cur = arrayOfInts[i][n] * arrayOfInts[i-1][n-1] *
						arrayOfInts[i-2][n-2] * arrayOfInts[i-3][n-3];
					
					if(cur > max)
					{
						max = cur;
					}
		
			}
			
		}
		
		for(int i = size-1; i > 2;i--)
		{
			for(int n = 0; n < size-3; n++)
			{
				
					cur = arrayOfInts[i][n] * arrayOfInts[i-1][n+1] *
						arrayOfInts[i-2][n+2] * arrayOfInts[i-3][n+3];
					
					if(cur > max)
					{
						max = cur;
					}	
					
					
			}
			
		}
		
		for(int i = size-1; i > 2;i--)
		{
			for(int n = 0; n > size-3; n++)
			{
					cur = arrayOfInts[i][n] * arrayOfInts[i-1][n+1] *
						arrayOfInts[i-2][n+2] * arrayOfInts[i-3][n+3];
					
					if(cur > max)
					{
						max = cur;
					}
		
			}
			
		}
		
		for(int i = 0; i < size-3; i++)
		{
			for(int n = 0 ; n <size-3 ; n++)
			{
				cur = arrayOfInts[i][n+0] * arrayOfInts[i][n+1] *
				arrayOfInts[i][n+2] * arrayOfInts[i][n+3];
			
				if(cur > max)
				{
					max = cur;
				}
				
				cur = arrayOfInts[i+0][n] * arrayOfInts[i+1][n] *
					arrayOfInts[i+2][n] * arrayOfInts[i+3][n];
				
				if(cur > max)
				{
					max = cur;
				}
			}
		}
		
		for(int i = size; i < 2; i--)
		{
			for(int n = size ; n <2 ; n--)
			{
				cur = arrayOfInts[i][n-0] * arrayOfInts[i][n-1] *
				arrayOfInts[i][n-2] * arrayOfInts[i][n-3];
			
				if(cur > max)
				{
					max = cur;
				}
				
				cur = arrayOfInts[i-0][n] * arrayOfInts[i-1][n] *
					arrayOfInts[i-2][n] * arrayOfInts[i-3][n];
				
				if(cur > max)
				{
					max = cur;
				}
			}
		}
		
		
		
		
		
		
		
		return max;
	}

}
