import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Email
{
	Header header;
	String body;
	String greetings;

	Email(Header header,String body,String greetings)
	{
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}
class Header
{
	String from;
	String to;

	Header(String from, String to)
	{
		this.from = from;
		this.to = to;
	}
}

class EmailOperations
{
	public int emailVerify(Email e)
	{
		String regex = "([a-zA-Z_]{1}[a-zA-Z]+)@([a-zA-Z]+)\\.([a-zA-Z]+)";
		boolean b1 = Pattern.matches(regex,e.header.from);
		boolean b2 = Pattern.matches(regex,e.header.to);

		if(b1 && b2)
			return 2;
		else if((b1 || b2)==false)
			return 0;
		else
			return 1;
	}

	public String bodyEncryption(Email e)
	{
		StringBuffer result = new StringBuffer();

		for(int i=0;i<e.body.length();i++)
		{
			if(Character.isUpperCase(e.body.charAt(i)))
			{
				char ch = (char)(((int)e.body.charAt(i)+3-65)%26+65);
				result.append(ch);
			}
			else if(Character.isLowerCase(e.body.charAt(i)))
			{
				char ch = (char)(((int)e.body.charAt(i)+3-97)%26+97);
				result.append(ch);
			}
			else if(Character.isSpace(e.body.charAt(i)))
			{
				result.append(e.body.charAt(i));
			}
		}
		return result.toString();
	}

	public String greetingMessage(Email e)
	{
		StringTokenizer st1 = new StringTokenizer(e.header.from,"@");
		String str = "";

		if(st1.hasMoreTokens())
		{
			str = st1.nextToken();
		}
		return e.greetings+" "+str;
	}
}

public class Source 
{
	public static void main(String args[] ) throws Exception 
	{
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    		// You can Implement your main() to check your Program.
	}
}