import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercise5 
{
      
        public int getSecondSmallest(int[] arr)
	{
              List<Integer> intList = new ArrayList<Integer>();
              for(int i: arr)
		{
                     intList.add(i);

              }

              Collections.sort(intList);
              return intList.get(1);
       }

       public static void main(String[] args) 
	{
              Exercise5 ex = new Exercise5();
              int arr[] = {55,78,41,21,14,56,12,99};
              int i = ex.getSecondSmallest(arr);
              System.out.println(i);
       }

}