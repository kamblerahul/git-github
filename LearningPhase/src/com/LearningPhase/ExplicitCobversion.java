package com.LearningPhase;

class one
{
	static void addString()
	{
		int number1 = 1245;
		String Str = "jump";
		String cd = number1 + Str;		
		System.out.println(cd);		
	}	
}

class Employees{

	int id;
	int salary;
	static String company = "Amazon";
	
	Employees(int i, int s)
	{
		this.id=i;
		this.salary=s;
	}
	 void display()
	 {
		 System.out.println("ID-Number "+id+" \nSalary "+salary+" \nCompany-Name "+company);
	 }
	
	
}
public class ExplicitCobversion 
{

	public static void main(String[] args) 
	{
		double d = 45445.0123458;
		long l = (long)d;
		one.addString();		
		System.out.println(l);
		Calculator cal = new Calculator();
		cal.Add(10, 20);
		cal.multiply(40, 50);
		ArrayWork.arr();
		StringOp.StringManupulation();
		
		Employees e1 = new Employees(1,76499);
		e1.display();
	}

}
