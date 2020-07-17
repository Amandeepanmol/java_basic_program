Static keyword : It is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class.
----------------------------------------------------------------------------------------------------------------------------------------------------

Static variable:
----------------

If you declare any variable as static, it is known as static variable. 
=> The static variable can be used to refer the common property of all objects (that is not unique for each object) e.g. company name of employees,college name of students etc.
=> The static variable gets memory only once in class area at the time of class loading. 

Code to demonstarte the use of static variable:
----------------------------------------------

import java.util.*;
class statickeyword 
{
	String name;
	int age;
	static String compname="Google";                              // static variable are used for the memory management
	
	statickeyword(String n,int a)
	{
		name=n;
		age=a;
	}
	
	void display()
	{
		System.out.println("Customer name  is "+name+" "+" , age is "+age+" "+", company name is "+compname);
	}
}

class Test 
{
	public static void main(String[] args)
	{
		statickeyword obj=new statickeyword("A",37);
		statickeyword obj1=new statickeyword("B",38);
		
		obj.display();
		obj1.display();
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Static Method:
-------------------
If you apply static keyword with any method, it is known as static method. 
=> A static method belongs to the class rather than object of a class. 
=> A static method can be invoked without the need for creating an instance of a class. 
=> static method can access static data member and can change the value of it. 

Code to demostrate the use of static method:
----------------------------------------------

-import java.util.*;
class statickeyword 
{
	String name;
	int age;
	static String compname="Google";
	
	statickeyword(String n,int a)
	{
		name=n;
		age=a;
	}
	static void change()                        // static method used
	{
		compname="Microsoft";
	}
	void display()
	{
		System.out.println("Customer name  is "+name+" "+" , age is "+age+" "+", company name is "+compname);
	}
}

class Test 
{
	public static void main(String[] args)
	{
		statickeyword.change();                           
		statickeyword obj=new statickeyword("A",37);
		statickeyword obj1=new statickeyword("B",38);
		
		obj.display();
		obj1.display();
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Static block:
--------------
=> It is used to initialize the static data member. 
=> It is executed before main method at the time of classloading. 

Code to demonstrate the use of Static Block:
---------------------------------------------

import java.util.*;
class statickeyword 
{
	static int a;
	static
	{
		System.out.println("I am static block");
		a=990;                                               // static block is used to initialize the static variable
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
	}
}

