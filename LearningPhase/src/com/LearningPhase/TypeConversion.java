package com.LearningPhase;

public class TypeConversion {

	public static void main(String[] args) 
	{
		String s = "12345";		
		int a = Integer.parseInt(s);		
		System.out.println(a);
		
		String one = "124578";
		int two = Integer.valueOf(one);
		System.out.println(two);
		
		int three = 2356;
		String four = String.valueOf(three);
		
		System.out.println(four);
		
	
	}

}
