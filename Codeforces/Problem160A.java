import java.util.Scanner;
import java.util.*;
// Java solution for the "Twins" codeforces problem
// Take the minimum number of coins such that you have more money than the other dude

public class Problem160A {

	public static void main(String args[])
	{
		int myCoinSum = 0;
		int restCoinSum = 0;
		
		ArrayList<Integer> coins = new ArrayList<Integer>();
		
		try {
			 Scanner sc = new Scanner(System.in);
		     sc.nextLine();
			 for(String s : sc.nextLine().split(" ")){
		    	 coins.add( Integer.parseInt(s) );
		    	 restCoinSum += coins.get(coins.size() - 1);
		     }
		     sc.close();

		} catch (Exception e) {
			System.out.println("Exception Caught: " + e);
		}

		Collections.sort(coins);
		
		
		for(int i = coins.size() - 1; i >= 0 ; i--){
			myCoinSum += coins.get(i);
			restCoinSum -= coins.get(i);
			if(myCoinSum > restCoinSum){
				System.out.println( coins.size() - i );
				break;
			}
		}


	}

	
}
