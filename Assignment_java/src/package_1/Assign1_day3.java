package package_1;

public class Assign1_day3 
{
	public Assign1_day3()
	{ 
		this(7,8,9);
		System.out.println("default constructor");
	}
	public Assign1_day3(int a)
	{
		this(11,12);
		System.out.println("one parameterized constructor");
	}
	public Assign1_day3(int a, int b)
	{
		this();
		System.out.println("two parameterized constructor");
	}
	public Assign1_day3(int a,int b,int c)
	{
		System.out.println("three parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assign1_day3 w=new Assign1_day3(7);
	}
		}

