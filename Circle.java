import java.util.*;
class Circle
{
	Scanner sc=new Scanner(System.in);
	static double Pi=Math.PI;
	public void set()
	{
		System.out.println("Enter Radius of circle");
		int r=sc.nextInt();
		double perimeter=2*Pi*r;
		double area=Pi*r*r;
		System.out.println("Perimeter of circle is "+perimeter);
		System.out.println("Area  of circle is "+area);
	}
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.set();		
	}
}