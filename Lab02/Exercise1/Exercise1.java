import java.util.*;

class Exercise1 
{
	public static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int i =0;i<size ;i++ )
		{
			arr[i] = sc.nextInt();
		}

		int res = getSecondSmallest(arr);
		System.out.println("Second Smallest Element of the Arrray is :"+res);
	}
}
