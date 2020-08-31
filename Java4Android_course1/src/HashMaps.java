import java.util.ArrayList;
import java.util.*;
//Determine the frequency of words in a file.
public class HashMaps 
{
	public static void main(String args[])
	{
		ArrayList<String> words = new ArrayList<String>();
		words.add("Peolple");
		words.add("Places");
		words.add("Programming Languages");
		words.add("Stacks");
		words.add("Programming Languages");
		
		System.out.println(words);
		
		Map<String, Integer> counts = new HashMap<String, Integer>();
		for(String word: words)
		{
			word = word.toLowerCase();
			if(!counts.containsKey(words))
			{
				counts.put(word, 1);
			}
			else
			{
				counts.put(word, counts.get(word) + 1);
			}
		}	System.out.println(counts);
	}
}
