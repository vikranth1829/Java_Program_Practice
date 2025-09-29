package AdvancedOopsProgram;

abstract class shape
{
	String color;
	
	public abstract double area();
	
	public shape(String color)
	{
		System.out.println("Called shape constructor");
		this.color=color;
		
	}
	
	public double perimeter(double l,double b)
	{
		return l*b;
	}
}

 class rectangle extends shape
 {
	 public rectangle(String color) {
		super(color);
	 }
	 double l,b;
	 public double area()
	 {
		 System.out.println(super.color);
		 return this.l*this.b;
	 }
	 public double perimeter(double l,double b)
	 {
		 return l*b;
	 }
 }


public class AbsTest {
	public static void main(String[] arg)
	{
		shape obj1=new rectangle("Blue");
		obj1.area();
		
		double d=obj1.perimeter(3.5, 4.5);
		System.out.println(d);
	}

}
