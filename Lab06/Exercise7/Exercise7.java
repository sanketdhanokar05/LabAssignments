package lab6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Exercise7
{
	public static int[] getSorted(int[] a)
	{
		ArrayList<Integer> nums=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int rev=0;
			while(num>0)
			{
				int digit=num%10;
				rev=rev*10+digit;
				num=num/10;	
			}
			nums.add(rev);
		}
		Collections.sort(nums);
		
		 Iterator<Integer> i=nums.iterator();
		 int k=0;
		 while(i.hasNext())
		 {
			 a[k++]=i.next();
		 }
		return  a;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		int[]  ans=getSorted(a);
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
		
	}

}
