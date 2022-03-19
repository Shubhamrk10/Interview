import java.util.HashMap;
public class Occur
{
	public static void main(String[] args) 
	{
		String src = "bhagyashree";
		char [] data = src.toCharArray();

		HashMap<Character, Integer> occ = new HashMap<Character, Integer>();

		for (char c: data )
		{
			if (occ.containsKey(c))
			{
				occ.put(c, occ.get(c)+1);
			}
			else
			{
				occ.put(c, 1);
			}
		}
		System.out.println("occurance: "+occ);
	}
}
