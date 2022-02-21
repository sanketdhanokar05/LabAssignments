import java.util.Scanner;

class Exercise6 
{
	public static int calculateDifference(int n)
	{
		int sum = 0;
		int square = 0;

		for (int i = 1;i <= n ;i++ )
		{
			square = square + (int)Math.pow(i,2);
			sum = sum +i;
		}
		return square - (int)Math.pow(sum,2);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");

		int n = sc.nextInt();
		int res = calculateDifference(n);
		
		System.out.println("Sum of the Square : "+res);
	}
}
