package lab6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise6 
{
	private static List<Integer> voterList(Map<Integer,Integer> people) 
	{
		List<Integer> ans=new ArrayList<>();
		 Set<Map.Entry<Integer,Integer>> set=people.entrySet();
		 Iterator<Map.Entry<Integer,Integer>> i=set.iterator();
		 while(i.hasNext())
		 {
			 Map.Entry<Integer,Integer> entry=i.next();
			 if(entry.getValue()>=18)
			 {
				 ans.add(entry.getKey());
			 }	 
		 }	 
		 return ans;
	}
	public static void main(String[] args) 
	{
		 Map<Integer,Integer> people=new LinkedHashMap<>();
		 people.put(1,25);
		 people.put(2,26);
		 people.put(3,17);
		 people.put(4,18);
		 List<Integer> ans=voterList(people);
		 System.out.println(ans);
	}


}
