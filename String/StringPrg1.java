class StringPrg1
{
	public static String concatAdd(String str1,String str2)
	{
		String s=str1+" "+str2;
		String ans="";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			ans=ans+str[i];	
		}
		return ans;
	}
	public static String reverse(String str)
	{
		int len=str.length();
		String result="";
		char[] ch=new char[len];
		for(int i=len-1;i>=0;i--)
		{
			 result=result+String.valueOf(str.charAt(i));	
		}
		return result;
	}
	protected static int paddlingIndex(String str1,String str2)
	{
		for(int i=0;i<str1.length();i++)
		{
			if(str2.charAt(0)==str1.charAt(i))
			return i;
		}	
		return 0;		
	}

	public static boolean isDigit(String str)
	{
		int len=str.length();
		 
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
				continue;
			else
				return false;	
		}
		return true; 	
	}

	public static void main(String[] args)
	{
		System.out.println("Remove Spaces and Concat String:"+concatAdd("Sanket Vinod"," Dhanokar"));
		System.out.println("Reverse String:"+reverse("SanketDhanokar"));
		System.out.println("Paddling Index:"+paddlingIndex("SanketDhanokar","Dhanokar"));
		System.out.println("Digit or Not:"+isDigit("09"));
	}
}