An interface in the Java programming language is an abstract type 
that is used to specify a behavior that classes must implement. ...
Starting with Java 8,

default and static methods may have implementation
in the interface definition. Interfaces cannot be instantiated, 
but rather are implemented.

====================================================

Example1:
// public all packages
// default only one package



interface It1
{
	void m1();// public abstract
	void m2();
	void m3();
	


}
class Test1 implements It1
{
public void m1()
	{
	System.out.println("This is m1 method");
		
		
	}


public void m2()
	{
	System.out.println("This is m2 method");
		
		
	}


public void m3()
	{
	System.out.println("This is m3 method");
	}


	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		t.m1();
		t.m2();
		t.m3();
		
	

	}
}
//public abstract

=====================================================
Example 2:



interface It1
{
	void m1();
	void m2();
	void m3();
	


}
class Test1 implements It1
{
public void m1()
	{
	System.out.println("This is m1 method");
		
		
	}


public void m2()
	{
	System.out.println("This is m2 method");
		
		
	}


public void m3()
	{
	System.out.println("This is m3 method");
	}


	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		t.m1();
		t.m2();
		t.m3();
	
	It1 t1=new Test1();
		t1.m1();
		t1.m2();
		t1.m3();

	}
}

==========================================================
Example 3
interface It1
{
	void m1();
	void m2();
	void m3();
}
abstract class  Test implements It1
{	public void m1(){	
			System.out.println("This is m1 Method");
		}
}

abstract class  Test1 extends Test
{	public void m2(){	
			System.out.println("This is m2 Method");
		}
}
class  Test2 extends Test1
{	public void m3(){	
			System.out.println("This is m1 Method");
		}

		public static void main (String[] args)
	{
			Test2 t=new Test2();
			t.m1();
			t.m2();
			t.m3();
	}
}


=============================================================
interface It1
{
	void m1();
}
interface It2 extends It1
{
	void m2();
}
interface It3 extends It2
{
	void m3();
}

class Test implements It1
{
	override m1 method
}
===========================================================
interface It1
{
	void m1();
}
interface It2 
{
	void m2();
}
interface It3 extends It1,It2
{
	void m3();
}
class Test implements It3
{
	override 3 methods
}
==============================================================
interface It1
{
	void m1();
}
interface It2 
{
	void m1();
	void m2();
}
interface It3 extends It1,It2
{
	void m3();
}
class Test implements It3
{
	override 3 methods
}

===============================================
class extends class 
interface extends interface
class implements interface 

class A extends B
class A extends B,C
class A implements It1
class A implements It1,It2
class A extends A

interface It1 extends It2
interface It1 extends It2,It3
interface It1 extends A
interface It1 extends It1


class A extends B implements It1,It2

class A implements It1,It2 extends B


============================================================
interface It1
{
	interface It2
	{
		void m1()
	}
}

class Test implements It1.It2
{
	public void m1()
	{
		System.out.println("m1 methid"):
	}
		public static void main(String args[])
	{
			new Test.m1();
	}
}
//nested interface

======================================

class A
{


	interface It2
	{
		void m1()
	}
}

class Test implements A.It2
{
	public void m1()
	{
		System.out.println("m1 methid"):
	}
		public static void main(String args[])
	{
			new Test.m1();
	}
}
//nested class interface
===============================================
default values
=================================
public static final   ==Interface variable
abstract=interface
public abstract=methods


interface It1
{
	int a=12;
	void m1();
}

class Test implements It1
{
	public void m1()
	{
		a=a+10;
		System.out.println(a);
	}
	public static void main (String[] args)
	{
		new Test().m1();
	}
}

//interface variables can not over ridden
==================================








interface It1
{
	int a=12;
}

interface It2
{
	int a=12;
}

class Test implements It1,It2
{
	public void m1()
	{
	
		System.out.println(a);
	}
	public static void main (String[] args)
	{
		new Test().m1();
	}
}

D:\DS_JAVA_PROGRAMES\interface>javac Test.java
Test.java:23: error: reference to a is ambiguous
                System.out.println(a);
                                   ^
  both variable a in It1 and variable a in It2 match
1 error

D:\DS_JAVA_PROGRAMES\interface>
=============================================================







interface It1
{
	int a=12;
}

interface It2
{
	int a=12;
}

class Test implements It1,It2
{
	public void m1()
	{
	
		System.out.println(It1.a);
	}
	public static void main (String[] args)
	{
		new Test().m1();
	}
}

====================================



Adapter Class



interface Mvr
{
	void cse();
	void ece();
	void me();
	void mba();
	void eee();
	void civil();
	void diploma();
		void mtech();
}

class Mvrcoe implements Mvr
{
	
public	void cse()
	{}
	public void ece()
	{
	}
	public void me(){}
	public void mba(){}
	public void eee(){}
	public void civil(){}
public	void diploma(){}
	public void mtech(){}
}


class MyBranch extends Mvrcoe
{
	public void cse()
	{
		System.out.println("This is cse method");
	}
	public static void main(String[] args)
	{
	new MyBranch().cse();
	}
}


Empty implementation of all interface methods;



=======================================

Marker Interface

The Interface without any methods whenever a class imlementing that intrerface the class acquiring some capabilities
is called Marker Interface

java.io.Serializable
java.util.RandomAccess
java.lang.Cloneable 



The process of creating duplicate object is called clonning


======================================
class Test implements Cloneable
{
	int a=100;
	int b=200;
	public static void main(String[] args) throws Exception
	{
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=111;
		t.b=222;
		System.out.println(t.a);
		System.out.println(t.b);
t.a=555;
		t.b=666;
		System.out.println(t.a);
		System.out.println(t.b);
		Test t1=(Test) t.clone();
;
;
;
;
t.a=999;
		t.b=888;
		System.out.println(t.a);
		System.out.println(t.b);
System.out.println("===============");
		System.out.println(t1.a);
		System.out.println(t1.b);




	}
}
===========================================================



