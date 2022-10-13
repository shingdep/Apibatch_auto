//((((10*2)-2)+2)-2)/2)//

package package_1;

public class Assign2_day2 
{
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println(" multiresult="+c);
		return c;
	}
public int sub(int a1, int b1)
	{
		int d;
		d=a1-b1;
		System.out.println(" subresult="+d);
		return d;
	}
public int sum(int a2, int b2)
{
	int e;
	e=a2+b2;
	System.out.println(" sumresult="+e);
	return e;
}
public void div(int d1, int d2)
{
	int g;
	g=d1/d2;
	System.out.println(" divresult="+g);
}
public static void main(String[] args) 
{
	Assign2_day2 y=new Assign2_day2();
	int multiresult=y.multi(10, 2);
	int subresult=y.sub(multiresult, 2);
	int sumresult=y.sum(subresult, 2);
	int subresult1=y.sub(sumresult, 2);
	y.div(subresult1, 2);
}
	

}
