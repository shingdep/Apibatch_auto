package package_1;

public class Assign2_day3 
{
public void method()
{
	this.method3(1,2,3);
	System.out.println(" default method of the class");
	this.method1(3);
}
public void method1(int a)
{
	System.out.println(" first method of the class");
	this.method2(1,2);
}
public void method2(int a, int b )
{
	System.out.println(" second method of the class");
	this.method4(1,2,3,4);
}
public void method3(int a, int b, int c)
{
	System.out.println(" third method of the class");
}
public void method4(int a, int b,int c,int d)
{
	System.out.println(" fourth method of the class");
}
public static void main(String[] args) 
{
	Assign2_day3 r=new Assign2_day3();
	r.method();
}
	}
