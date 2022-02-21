import java.util.*;

class Exercise4
{
	public static void firstNPrimeNumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Integer value :");
		int n = sc.nextInt();

		firstNPrimeNumbers(n);
	}
}