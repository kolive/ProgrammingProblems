import java.util.ArrayList;
import java.util.HashMap;

public class ProblemC {
	
	static ArrayList<Integer> allTheNumbers = new ArrayList<Integer>();
	static HashMap<Long, Long> binomCoeff = new HashMap<Long, Long>();
	
	public static int solveC(int A, int B)
	{
		allTheNumbers = new ArrayList<Integer>();
		int count = 0;
		String seeds[] = new String[B-A+1];
	//	System.out.println("SIZE OF ARRAY:" + seeds.length);
		for(int i = A, n = 0; n < seeds.length; i++, n++)
		{
			seeds[n] = Integer.toString(i);
			//System.out.println(seeds[n]);
		}
		
		
		for(int i = 0; i < seeds.length; i++)
		{
			count += binom(CircularStringShift(seeds[i], A, B),2);
		}
		
		return count;
	}
	public static int CircularStringShift(String s, int lowerLimit, int upperLimit)
	{
		String tmp = s;
		char placeHolder = ' ';
		int count = 0;
		int tmp2;
		
		for(int i = 0; i < s.length(); i++)
		{
			placeHolder = tmp.charAt(0);
			tmp = tmp.substring(1, tmp.length()) + placeHolder ;
			tmp2 = Integer.parseInt(tmp);
			if(!allTheNumbers.contains(tmp2) && tmp2 >= lowerLimit && tmp2 <= upperLimit && tmp != s)
			{
				count++;
				allTheNumbers.add(tmp2);
			}
					
		}
	
		
		
		return count;
	}
	
	static long binom(int n, int k) {
		
		/*
		if(binomCoeff.containsKey(n))
		{
			return binomCoeff.get(n);
		}
		
		long coeff = 1;
		for (int i = n - k + 1; i <= n; i++) {
			coeff *= i;
		}
		for (int i = 1; i <= k; i++) {
			coeff /= i;
		}
		binomCoeff.put((long)n, coeff);
		return coeff;
		*/
		
		return ((n-1)*(n) / 2);
	}
 

}

