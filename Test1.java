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
