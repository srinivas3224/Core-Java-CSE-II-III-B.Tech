class 
{
	void m1()
	{

int	a=3;
int	b=5;
sop(a+b);
}
}
methods:
-->methods are used to write logic of the business 
application
-->2 types of methods
1.instance method
2.static "
-->th memory allocted for instance methods when obj is created; ; )
-->the memory allocated for static methods when 
   the class is loading into th memory
There are 2 types of areas in java:
1.instance area
2.static area
1.instance area:
->instance methods are called directly in instance area 
->static methods are called using class name
->class Test
{
	void m1()
	{
		m3();
System.out.println("this is instance method m1");
m3();
Test.m2();

}
void m3()
	{
System.out.println("this is instance method m3");
}
static void m2()
	{
System.out.println("this is static method m2");
	}

	public static void main(String[] args) 
	{
		Test p=new Test();
p.m1();
Test.m2();

	}
}
Syntx for defining methods:

modifiers returntype methodname(parameters) throws exceptions

2.In a java pgm no 2 methods have same signature
3.In java there is no concept of inner method definition
4.Every method must return something if nothing is written void is return
==============================================================
class Test
{
	int a=100;
	int b=50;
void m1(int x,int y)
	{
	System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		new Test().m1(200,300);

		Test t=new Test();
		t.m1(1000,2000);
	}
}
======================================================
-->If th local varibles&instance var have same nme
then the method ,they can be diiferntiated with "this"
this refers to th instance variables
========================================================
-->The parameters to th method are primitives,objs
-->primitives means int,char,double .....
-->60% of real time process th parameter to th method re objs
-->
class A  
{
}
class B
{
}

class Emp 
{
}
class Student
	{
}
class Test
{
	void m1(A a,Emp e)
	{
System.out.println("this is method m1");
	}
	static void m2(B b, Student s1)
	{
System.out.println("this is method m2");

	}

	public static void main(String[] args) 

	{

A a=new A();
B b=new B();
Emp e=new Emp();
Student s=new Student();
Test t=new Test();
t.m1(a,e);
Test.m2(b,s);
	}
}
=============================================
