import java.util.HashMap;

public class ProblemA {

	static HashMap<Character, Character> mappingTable = new HashMap<Character, Character>(30);
	
	private static void generateInitialSeed()
	{
		//generating the map from a seed, cause I'm lazy to do it myself and this is 
		//more efficient
		
		String seed = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String mapping = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		mapping.replaceAll(" ", "");
		seed.replaceAll(" ", "");
		for(int i = 0; i < seed.length(); i++)
		{
			if(!mappingTable.containsKey(seed.charAt(i)) && seed.charAt(i) != ' ')
			{
				mappingTable.put(seed.charAt(i), mapping.charAt(i));
			}
			
			
				
		}
		
		//manual adding of the three characters
		mappingTable.put('y', 'a');
		mappingTable.put('e', 'o');
		mappingTable.put('q', 'z');
		mappingTable.put('z', 'q');

		//System.out.println(mappingTable.get('q'));
		
//		String test = "abcdefghijklmnopqrstuvwxyz";
//		for(int i = 0; i < test.length(); i++)
//			System.out.println(test.charAt(i) + " maps to : " + mappingTable.get(test.charAt(i)));
	}
	
	public static String translateString(String s)
	{
		//it's inefficient to keep calling generate initial seed
		//but I don't care, it's really small input.
		generateInitialSeed();
		String tmp = "";
		for(int i = 0; i < s.length();i++)
		{
			if(s.charAt(i) == ' ')
				tmp += ' ';
			else
				tmp += (mappingTable.get(s.charAt(i)));
				
		}
		
		return tmp;

	}
	


}
