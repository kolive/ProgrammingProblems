import java.util.Arrays;


public class ProblemB {
	
	private static int[] generateTriplet(int totalScore)
	{
		int third = totalScore/3;
		int[] triplet = new int[3];
		int total = 0;
		int i = 0;
		
		triplet[0] = third;
		triplet[1] = third;
		triplet[2] = third;
		
		total = third*3;
		
		while(total < totalScore)
		{
			triplet[i] += 1;
			total += 1;
			i = (i+1)%3;
		}
		//System.out.println( triplet[0] + "," + triplet[1] + "," + triplet[2]);
		
		return triplet;
	}
	
	public static int GenerateMaxP(int p, String[] totalScores, int numSuprising) {
		boolean containsP[] = new boolean[totalScores.length];
		int totalScoresI[] = new int[totalScores.length];
		
		for(int i = 0; i < totalScores.length;i++)
		{
			totalScoresI[i] = Integer.parseInt(totalScores[i]);
		}
		for(int i = 0; i < totalScores.length; i++)
		{
			int[] tmp = ProblemB.generateTriplet(totalScoresI[i]);
			int[] dupe = Arrays.copyOf(tmp, tmp.length);
			
			if (tmp[0] < p)
			{
				containsP[i] = false;
				while(tmp[0] < p && numSuprising > 0)
				{					
					//see if the surprising config has p
					
					
					
					//decrease the next biggest and increase tmp[0], if there's something to borrow from
					if(tmp[1] > tmp[2] && tmp[2] > 0)
					{
						tmp[1]--;
						//start by increasing tmp[0]
						tmp[0] ++;
					}
					else if (tmp[2] > 0)
					{
						tmp[2]--;
						//start by increasing tmp[0]
						tmp[0] ++;
					}else
					{
						//System.out.println( dupe[0] + "," + dupe[1] + "," + dupe[2]);
						break;
					}
					
					//confirm that it's not yet suprising
					if((tmp[0] - tmp[1]) >= 2 || (tmp[0] - tmp[2]) >= 2)
					{
						//if now suprising, and max is included. Accept this result, decrease suprising count
						if(tmp[0] >= p && (tmp[0] - tmp[1]) <= 2 && (tmp[0] - tmp[2]) <= 2)
						{
							containsP[i] = true;
							numSuprising--;
							
							//System.out.println( tmp[0] + "," + tmp[1] + "," + tmp[2] + "*");
							break;
						}
						else
						{
							containsP[i] = false;
							

							//System.out.println( dupe[0] + "," + dupe[1] + "," + dupe[2]);
							break;
						}
					
					}else if(tmp[0] >= p)
					{
						//if not yet suprising, but we've gotten a p, set contains p to true, move on.
						containsP[i] = true;

						//System.out.println( tmp[0] + "," + tmp[1] + "," + tmp[2]);
						break;
					}
					
				}
			}else
			{
				containsP[i] = true;

				//System.out.println( dupe[0] + "," + dupe[1] + "," + dupe[2]);
			}
			
			
			
		}
		int count = 0;
		for(int i = 0; i < containsP.length; i++)
		{
			if(containsP[i])
				count++;
		}
		
		return(count);
	}

}
