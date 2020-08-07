package com.rahul.branch;

class vehicle 
{
	void talk()
	{
		System.out.println("this is class vehicle");
	}
}

class BMW extends vehicle
{
	void brand()
	{
		System.out.println("this is brand BMW");
	}	
}

class Car extends BMW
{
	void whichCar()
	{
		System.out.println("320Di");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		Car c = new Car();
		c.brand();
		
	}

}
