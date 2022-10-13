// ((((10+2)-2)+2)*2)/2)//

package package_1;

public class Assign1_day2 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(" sumresult="+c);
		return c;
	}
	public int sub(int a1,int b1)
	{
		int d;
		d=a1-b1;
		System.out.println(" subresult="+d);
		return d;
	}
	public int multi(int a2,int b2)
	{
		int e;
		e=a2-b2;
		System.out.println(" multiresult="+e);
		return e;
	}
	public int div(int d1, int d2)
	{
		int f;
		f=d1/d2;
		System.out.println(" divisionresult="+f);
		return f;
	}
	public static void main(String[] args) 
	{
		 Assign1_day2 q=new  Assign1_day2();
		 int sumresult=q.sum(10, 2);
		 int subresult=q.sub(sumresult, 2);
		 int multiresult=q.multi(subresult, 2);
		 int sumresult1=q.sub(multiresult, 2);
		 q.div(multiresult, 2);
		
	}
	

}
