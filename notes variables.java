class A
{
	public static void main(String[] args) 
	{
		System.out.println("MVR World!");
	}
}
public class B
{
	public static void main(String[] args) 
	{
		System.out.println("CSE World!");
	}
}
class C
{
	public static void main(String[] args) 
	{
		System.out.println("SRINIVAS World!");
	}
}
======================================================================
class test 
{
	1.variables
		2.methods
		3.constructors
		4.instances
		5.static

}
1.varibles
--> store values which can be used for application requirements
1.local variables
2.instence "
3.static "
1.local variables:
the variable that are declare inside the block are called local var
scope:
->starting of the method to ending of the method
->these are stored in shared memory
class Test

{
	public static void main(String[] args )
	
	{
		int a=20;
		int b=40;
		System.out.println(a);
		System.out.println(b);
	}
}


2.instence :
-->the varibles that are declare outside th method inside th
block
-> memory is allocated when obj is created and memory is destroyed when obj is destroyed 
->these are stored in heap memory

class Test
{
int a,b;
void m1()
	{
	System.out.println(a);
		System.out.println(b);
	}
	static void m2()
	{
	}
	public static void main(String[] args )
	{
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();

	}
}

3.static variables:
--> the var that are declare outside th method 
inside the class with static modifier are called static var
->the memory is allocated for (static var whenever the class is 
go the memory its exists untill th existence of th class 
in memoy
--> these are stored in non heap memory
-->instene area,static area are called with 
class name

VARIABLES vs DEFAULT VALUES:
THE PRIMITIVE types are:
->byte : 0
short : 0
int : 0
long : 0
float : 0.0
double: 0.0
boolean:false
char: single space character
class Test
{
 int a;
float b;
	public static void main(String[] args )
	{
		int c,d;
		//System.out.println(c);
		//System.out.println(d);
	Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
	}
}

CLASS:
-->class is a logical entity which contains 
logic of th application 
--> it is created using the keyword class
OBJECT:
-->it is a physical entity which resides in 
memory execute th class logic
--> it is created using the keyword object