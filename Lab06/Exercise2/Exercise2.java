import java.util.*;

public class Exercise2
{
   
  public static void main(String args[]) 
  {
      
  String input = "MaharashtraIsMyState";
  char search = 'a';             
  
  Map<Character,Integer> hash = new HashMap<Character,Integer>();
  
  for(int i=0;i<input.length();i++)
  {
      if(hash.containsKey(input.charAt(i)))
      hash.put(input.charAt(i), hash.get(input.charAt(i))+1);
      
      else
      hash.put(input.charAt(i), 1);
  }
  
  int result = hash.get(search);
  
  System.out.println("The Character:'"+search+"' are appears "+result+" times.");
  }
}