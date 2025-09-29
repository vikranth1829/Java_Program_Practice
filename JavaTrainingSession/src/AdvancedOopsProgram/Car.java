package AdvancedOopsProgram;


class Vehicle{
	int age;
	String name;
	
	public Vehicle(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	
	public Vehicle(Vehicle v1)
	{
		this.age=v1.age;
		this.name=v1.name;
		
	}
}

public class Car {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle(21,"Vikranth");
		Vehicle v1=new Vehicle(v);
		System.out.println(v.age);
		System.out.println(v.name);
		System.out.println(v1.age);
		System.out.println(v1.name);

	}

}
