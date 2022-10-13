package package_1;

public class Student 
{
int roll_no;
int Age;
public void display1()
{
	System.out.println("welcome all of you");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
public static void main(String[] args) 
{
	Student a=new Student();
	a.display1();
	a.display2();
	
	a.roll_no=123;
	a.Age=12;
	System.out.println("roll_no="+a.roll_no);
	System.out.println("Age="+a.Age);
	
}
}
