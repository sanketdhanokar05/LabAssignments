import java.util.*;

public class Exercise1
{
	public static List<String> getValues(HashMap<Integer, String> map)
	{
		List<String> list = new ArrayList<>(map.values());
		Collections.sort(list);
		return list;
	}

	public static void main(String [] args)
	{
		HashMap<Integer, String> hashmap = new HashMap<>();

		hashmap.put(1,"Sanket");
		hashmap.put(4,"Akash");
		hashmap.put(5,"Hrushi");
		hashmap.put(3,"Pallavi");
		hashmap.put(2,"Harsha");
		hashmap.put(1,"Sanket");

		List<String> list = getValues(hashmap);
		
		System.out.println(list);
	}
}