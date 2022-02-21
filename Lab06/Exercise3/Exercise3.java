import java.lang.*;
import java.util.*;
 
public class Exercise3 
{
	public static HashMap<String, Integer>sortByValue(HashMap<String, Integer> hashMap)
	{
	
		List<Map.Entry<String, Integer> > list= new LinkedList<Map.Entry<String, Integer> >(hashMap.entrySet());

        	Collections.sort

		(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));
 
			HashMap<String,Integer> temp= new LinkedHashMap<String, Integer>();

        	for (Map.Entry<String, Integer> aa : list)
		{
           		 temp.put(aa.getKey(), aa.getValue());

        	}

        return temp;
 	}

  	  public static void main(String[] args)
  	  {
       		HashMap<String, Integer> hashMap= new HashMap<String, Integer>();
 
       		hashMap.put("Sanket", 78);
        	hashMap.put("Harsha", 75);
        	hashMap.put("Akash", 12);
		hashMap.put("Pallavi", 35);
		hashMap.put("Hrushi", 66);

       		Map<String, Integer> hashMap1 = sortByValue(hashMap);
 
        	for (Map.Entry<String, Integer> en :hashMap1.entrySet())
		{
            		System.out.println("Name = " + en.getKey() + ", Marks = "+ en.getValue());

     		}
   	 }
}