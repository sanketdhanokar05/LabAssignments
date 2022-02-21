import java.util.Scanner;

class Exercise8
{
	public static boolean checkNumber(int num)
	{
		if(num % 2 ==0)
		{
			num = num/2;
			System.out.println(num);

			if(num==2)
			{
				return true;
			}
			else
			{
				return checkNumber(num);
			}
		}
		else
		{
			return false;
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
	
		int num = sc.nextInt();
	
		if(checkNumber(num))
		{
			System.out.println("It is power of two: "+num);
		}
		else
		{
			System.out.println("It is not power of two: "+num);
		}
	}
}