package com.JavaPrograms;

public class HelloWorld {

	private synchronized void nonStaticMethod () {
		System.out.println("This is not a static block");
	}
	
	public static void StaticMethod() {
		System.out.println("This is a Static Method");
		
	}
	
	public static void main(String[] args) {
		
		HelloWorld h = new HelloWorld();
		h.nonStaticMethod();
		System.out.println("Hello World");
		StaticMethod();

	}

}
