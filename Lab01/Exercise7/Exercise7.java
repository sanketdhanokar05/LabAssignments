import java.util.Scanner;

class Exercise7
{
	public static boolean checkNumber(int num)
	{
		while(num>0)
		{
			int digit = num % 10;
			num = num/10;
			
			if(digit < num%10)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");

		int num = sc.nextInt();
		
		if(checkNumber(num))
		{
			System.out.println("Number is in increasing order:"+num);
		}
		else
		{
			System.out.println("Number is not in increasing order:"+num);
		}
	}
}