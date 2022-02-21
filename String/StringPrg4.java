class Person
{
	private String loc;
	private String name;
	private double salary;
	
	public Person(String loc,String name,double salary)
	{
		this.loc=loc;
		this.name=name;
		this.salary=salary;		
	}
	public void setLoc(String loc)
	{
		this.loc=loc;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;	
	}
	public String getLoc()
	{
		return loc;	
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;	
	}
}
public class StringPrg4
{
	public  static Person buildPerson(String locNameSal)
	{
		String loc="",name="";
		double sal=0;
		int len=locNameSal.length();
		int i=0;
		while(i<len)
		{
			if(!(locNameSal.charAt(i)=='N' && locNameSal.charAt(i+1)=='M'))
			{
				loc=loc+String.valueOf(locNameSal.charAt(i));	
			}
			else
			{
				i=i+2;
				break;
			}
			i++;
		}
		while(i<len)
		{
			if(!(locNameSal.charAt(i)=='S' && locNameSal.charAt(i+1)=='A'&& locNameSal.charAt(i+2)=='L'))
			{
				name=name+String.valueOf(locNameSal.charAt(i));
			}
			else
			{
				i=i+3;
				break;	
			}
			i++;	
		}
		String temp="";
		while(i<len)
		{
			temp=temp+String.valueOf(locNameSal.charAt(i));
			i++;	
		}
		sal=Double.parseDouble(temp)*1000;
		 Person p1=new Person(loc,name,sal);

		return p1;
	}
	public static String findGrade(Person person)
	{
		String grade="";
		double sal=person.getSalary();
		if(sal>25000)
			grade="A";
		else if(sal>=10000 && sal<=25000)
			grade="B";
		else
			grade="C";
		return grade;	
	}
	public static void main(String[] args)
	{
		String str="HydNMSanket-DhanokarSAL25";
		String str2="BangloreNMHarsha-GawandeSAL25";
		Person p=buildPerson(str);
		System.out.println("Employee Loc:-"+p.getLoc());
		System.out.println("Employee Name:-"+p.getName());
		System.out.println("Employee Sal:-"+p.getSalary());
		 System.out.println("Grade:-"+findGrade(p));

		System.out.println();
		Person p1=buildPerson(str2);
		System.out.println("Employee Loc:-"+p1.getLoc());
		System.out.println("Employee Name:-"+p1.getName());
		System.out.println("Employee Sal:-"+p1.getSalary());
		 System.out.println("Grade:-"+findGrade(p1));	
	}
}